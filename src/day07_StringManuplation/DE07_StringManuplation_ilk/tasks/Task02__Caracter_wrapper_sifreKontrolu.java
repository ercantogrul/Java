package day07_StringManuplation.DE07_StringManuplation_ilk.tasks;

import java.util.Scanner;

public class Task02__Caracter_wrapper_sifreKontrolu {
    public static void main(String[] args) {
        /*  Task->
		 	Girilen passwordun aşagıdaki şartları sağlamasını kontrol eden coden create ediniz
		 	 a)Ilk karakteri buyuk harf olmalı
		 	 b)Son karakteri sayi olamlı
		 	 c)en az 6 karakter uzunlugunda olmalı

		 */

        Scanner scan = new Scanner(System.in);
        System.out.print("password giriniz = "); // Java ogren
        String password = scan.nextLine();

        //ilk yöntem
       if (Character.isUpperCase(password.charAt(0))                                      // password stringinin ilk harfi büyük mü
                && Character.isDigit(password.charAt(password.length()-1))                 // pasword stringinin son karaktesi isDgit mi yani rakkam mi
                && password.length()>=6) {                                                 // pasword stringinin uzunlugu 6 ya da  daha buyuk mu
            System.out.println("password uygundur");
        }else System.out.println("password uygun degildir");

        //===ikinci yöntem=========================

        if (Character.isUpperCase(password.charAt(0))) {
            if (Character.isDigit(password.charAt(password.length()-1))) {
                if (password.length()>=6) {
                    System.out.println("password uygundur");
                }else System.out.println("uzunluk en az 6 karajkter olmali");
            }else System.out.println("son karakter rakkam olmali");
        }else System.out.println("ilk harf buyuk olmali");











    }
}
