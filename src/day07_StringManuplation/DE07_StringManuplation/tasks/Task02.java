package day07_StringManuplation.DE07_StringManuplation.tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*  Task->
		 	Girilen passwordun aşagıdaki şartları sağlamasını kontrol eden coden create ediniz
		 	 a)Ilk karakteri buyuk harf olmalı
		 	 b)Son karakteri sayi olamlı
		 	 c)en az 6 karakter uzunlugunda olmalı

		 */
        Scanner scan = new Scanner(System.in);
        System.out.print("PassWord giriniz = "); // Java ogren
        String passWord = scan.next();
        if (Character.isUpperCase(passWord.charAt(0))  // passWord stringinin ilk harfi buyuk mu?
        && Character.isDigit(passWord.charAt(passWord.length()-1)) //passWord stringinin son harfi rakam mı?
        && passWord.length()>=6)   // passWord stringinin uzunlugu 6 yada daha buyuk mu?
            System.out.println("password uygundur");
        else System.out.println("passWord uygun değildir");
        // 2.yol
        if (Character.isUpperCase(passWord.charAt(0))) {
            if (Character.isDigit(passWord.charAt(passWord.length()-1))) {
                if (passWord.length()>=6) System.out.println("password uygundur");
                else System.out.println("uzunluk en az 6 karekter olmalı");
            } else System.out.println("son karekter rakam olmalı");
        } else System.out.println("ilk harf buyuk olmalı");
    }
}
