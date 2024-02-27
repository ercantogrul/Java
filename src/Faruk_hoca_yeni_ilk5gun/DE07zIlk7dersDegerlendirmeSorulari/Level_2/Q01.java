package Faruk_hoca_yeni_ilk5gun.DE07zIlk7dersDegerlendirmeSorulari.Level_2;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        /* klavyeden sıra ile  1.sayı, işlem( +, -, *, / ) ve 2. sayı giriliyor ,
        işlemi yapıp ekrana yazdırınız (switch - case kullanılacak
        input
        3
        +
        5
        output 8
         */
        System.out.println("Sıra ile, sayi,işlem ve sayı giriniz");
        Scanner scanner = new Scanner(System.in);
        int s1 = scanner.nextInt();
        char islem  = scanner.next().charAt(0);
        int s2= scanner.nextInt();
        switch (islem){ // alttaki kullanım break varmış gibi çalışır
            case '+'    -> System.out.println(s1+s2);
            case '-'    -> System.out.println(s1-s2);
            case '/',':'-> System.out.println(s1/s2);
            case '*'    -> System.out.println(s1*s2);
        }
        // yol 2
        String str = ""+islem;
        switch (str){ // alttaki kullanım break varmış gibi çalışır
            case "+"    -> System.out.println(s1+s2);
            case "-"    -> System.out.println(s1-s2);
            case "/",":"-> System.out.println(s1/s2);
            case "*"    -> System.out.println(s1*s2);
        }


    }
}
