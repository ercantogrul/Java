package asya_hoca_.asya_hoca_25_10;

import java.util.Scanner;

public class s10_sayilar_yüze_ulasinca {
    public static void main(String[] args) {

        //Kullanıcıdan 5 tane sayı girmesini isteyin eğer toplamı 100 geçerse
        //"Toplamınız 100'e ulaştı daha fazla girmeyin

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen girmek istediginiz sayi adedini giriniz");
       int sayi = scan.nextInt();

       int toplam =0;

        for (int i = 1; i <= sayi; i++) {
            System.out.println(i+ ". inci sayi");
            int gs = scan.nextInt();
            toplam =toplam+gs;
            if(toplam>=100){
                System.out.println("toplaminiz 100 e ulasti taha fazla girmeyiniz");break;
            }else System.out.println("sayilarin toplami henüz 100 e ulasmadi");

        }












    }
}
