package day10_MethodCreation.DE10_MethodCreation_ilk.Tasks;

import java.util.Scanner;

public class Task12_mail_kontrol {
    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile

    public static void main(String[] args) {
        /*
        Task-> girilen e-mail ın doğrulugunu aşağıdaki şartlarda  control eden METHOD create ediniz.
        1- @ karakteri olmalı
        2- . (nokta) karakteri olmalı
        3- @ karakterinden önce mutlaka en az bir karakter olmalı.
        Example:
        "@gmail.com"-> false
        "@gmailcom"-> false
        "gmail.com"-> false
        "ebıkGabık@gmail.com"-> true
         */
        Scanner input = new Scanner(System.in);
        System.out.print("lütfen bir Email adresi giriniz : ");
        String email = input.nextLine().toLowerCase();

        boolean kontrol = mailKontrol(email);
        System.out.println(kontrol);
        // veya direk bu sekilde
        System.out.println(mailKontrol(email));


    }//main sonu

    private  static boolean mailKontrol (String str){
        boolean yeni = (str.contains("@") && str.contains(".")&& str.indexOf("@")>=1);
        return yeni;
    }



}
