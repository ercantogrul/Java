package day17_RandomClass.DE17_RandomClass;

import java.util.Arrays;
import java.util.Random;

public class C01_RandomClass {
    public static void main(String[] args) {
        Random rnd = new Random();
       // rnd.nextBytes();
        for (int i = 0; i <100 ; i++) {
            int sayi= rnd.nextInt(10); //  sayi = (int) (Math.random*10)
            if (i%25==0) System.out.println();
          //  System.out.print(sayi+" ");
        }
        System.out.println();
        byte[] dizi = new byte[10];
        rnd.nextBytes(dizi);
        int toplam=0;
        for (byte val:dizi){
            toplam += val;
        }
        System.out.println(toplam);
        System.out.println(Arrays.toString(dizi));
        String str="hasan";
        System.out.println(str.substring(0,3));
        System.out.println(str);
        System.out.println("---------------");
        metot(str);
        metot(dizi);
        System.out.println(str);
        System.out.println(Arrays.toString(dizi));

    }

    private static void metot(String str) {
        str = str + " selamlar";

    }
    private static void metot(byte[] dizi) {

        for (int i = 0; i < dizi.length ; i++) {
            dizi[i] = (byte) (i*i);
        }
    }
}
