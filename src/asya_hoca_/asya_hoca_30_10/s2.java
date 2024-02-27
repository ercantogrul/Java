package asya_hoca_.asya_hoca_30_10;

import java.util.Scanner;

public class s2 {
    public static void main(String[] args) {
        //Kullanıcıdan yaş bilgisi isteniyor
//Yaş değerleri 0-120 arasında olana kadar sormaya devam ediyor.

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen yasinizi  giriniz: ");
        int yas= input.nextInt();

      

        int i =0;
        while (yas<0 || yas>120){
            System.out.println("lutfen yasinizi tekrar giriniz: ");
            yas= input.nextInt();


        }
        System.out.println("dogru giris yaptiniz");




    }
}
