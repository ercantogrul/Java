package Faruk_hoca_yeni_ilk5gun.L01_Base;

import java.util.Scanner;

public class B01 {
    public static void main(String[] args) {
        // Scanner class yardımı ile 2 adet int sayı okutun, (s1, s2)
        Scanner scan = new Scanner(System.in);
        System.out.println("iki sayi giriniz:");
        int s1= scan.nextInt();
        int s2= scan.nextInt();

        //1) Bu 2 sayının toplamını ekrana yazdırın
        int toplam =s1+s2;
        System.out.println(toplam);
       // 2) Bu 2 sayının toplamını Wrapper class (Integer) yardımı ile toplatıp yazdırın
        int top = Integer.sum(s1,s2);
        System.out.println(Integer.sum(s1,s2));
       // 3) Bu iki sayıdan büyük olanını ekrana if kullanarak yazdırın
        if (s1>s2) {
            System.out.println("enB :"+s1);
        }else System.out.println("enB :"+s2);
       // 4) Bu iki sayıdan büyük olanını ekrana ternary operator kullanarak yazdırın
        int enB = s1>s2? s1:s2;
        System.out.println("enB :"+enB);
      //  5) Bu iki sayıdan büyük olanını ekrana Math class  kullanarak yazdırın
        System.out.println("enB :"+ Math.max(s1,s2));

    }
}
