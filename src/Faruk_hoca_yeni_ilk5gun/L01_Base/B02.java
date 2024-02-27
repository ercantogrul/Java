package Faruk_hoca_yeni_ilk5gun.L01_Base;

import java.util.Scanner;

public class B02 {
    public static void main(String[] args) {
         //Scanner class yardımı ile 3 adet int sayı okutun, (s1, s2, s3)

        Scanner scan = new Scanner(System.in);
        System.out.println("uc sayi giriniz:");
        int s1= scan.nextInt();
        int s2= scan.nextInt();
        int s3= scan.nextInt();

       // 1) Bu 3 sayının toplamını ekrana yazdırın
        System.out.println(s1+s2+s3);
        //2) Bu 3 sayının toplamını Wrapper class (Integer) yardımı ile toplatıp ekrana yazdırın
        System.out.println(Integer.sum(Integer.sum(s1,s2),s3));
        //3) Bu 3 sayıdan büyük olanını ekrana if kullanarak yazdırın
        if (s1>s2 && s1>s3){
            System.out.println("enB :"+s1);
        } else if (s2>s1 && s2>s3) {
            System.out.println("enB :"+s2);
        }else System.out.println("enB :"+s3);
        //4) Bu 3 sayıdan büyük olanını ekrana ternary operator kullanarak yazdırın
        System.out.println("enB: "+(s1>s2&&s1>s3? s1:s2>s3? s2:s3));
        //5) Bu 3 sayıdan büyük olanını ekrana Math class  kullanarak yazdırın
        System.out.println("enB :"+Math.max(Math.max(s1,s2),s3));


    }
}
