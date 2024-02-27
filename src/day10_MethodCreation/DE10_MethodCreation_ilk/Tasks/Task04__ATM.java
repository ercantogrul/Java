package day10_MethodCreation.DE10_MethodCreation_ilk.Tasks;

import java.util.Scanner;

public class Task04__ATM {//amale köyden ırgat çağıran şeher
    /*
        Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bir
         ATM app. code create ediniz
         */



    public static void main(String[] args) {

        bankacilikIslemi ();


        }


    private static void bankacilikIslemi() {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yapmak istediginiz islemi giriniz : ");
        System.out.println("1-bakiye \n2-para yatirma \n3-para cekme \n4-cikis");
        int tercih = input.nextInt();

        int bakiye =1000;
        switch (tercih){
            case 1 : System.out.println("bakiyeniz :"+bakiye);break;
            case 2 :
                System.out.println("yatirilacak miktar");
                int yatirilacakMiktar = input.nextInt();
                bakiye +=yatirilacakMiktar;
                System.out.println("para yatirildiktan sonraki bakiye :" +bakiye);break;
            case 3 :
                System.out.println("cekilecek para miktari");
                int cekilenMiktar =input.nextInt();
                bakiye -=cekilenMiktar;
                System.out.println("cekilen miktardan sonra ki bakiye :"+ bakiye);break;
            case 4 :
                System.out.println("isleminiz bitmistir");break;
            default:
                System.out.println("hatali giris yaptiniz");



    }

}//main dışı


}
