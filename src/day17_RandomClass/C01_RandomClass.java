package day17_RandomClass;

import java.util.Random;

public class C01_RandomClass {
    public static void main(String[] args) {


        Random veri = new Random();
        int a= veri.nextInt(10);      //  (10) yazinca 0 dahil 10 a kadar (10 dahil degil) olan sayilardan birini üretir
        int b= veri.nextInt(10)+1;   //  (10)+1 yazinca 1 dahil 11 a kadar (11 dahil degil) olan sayilardan birini üretir
        System.out.println(a);
        System.out.println(b);


        System.out.println();
        for (int i = 0; i < 20; i++) {
            int sayi1= veri.nextInt(10)+1; //  (10)+1 yazinca 1 dahil 11 a kadar (11 dahil degil) olan sayilardan birini üretir
            System.out.print(sayi1+" ");
            System.out.println();
            int sayi2= veri.nextInt(6)+5;    // 5 ile 11 arasindaki sayilari üretir
            double d1 = veri.nextDouble(6)+5;   // 5 ile 11 arasindaki double sayilari üretir
            System.out.println(sayi2);

        }






    }

}
