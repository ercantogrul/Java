package day12_Arrays;

import java.util.Arrays;

public class C04_Arrays {
    public static void main(String[] args) {

        // bu diziyi random olarak (0 ile 99 arasinda sayilar ile) method icin de doldurun
        // burada yazdirin
        int [] dizi = new int[10];
        dizi =doldur (dizi.length);
        System.out.println(Arrays.toString(dizi));

        // olusan diziyi yaz isimli bir metotta yazdirin

        yaz(dizi);  // yaz olusturulacak method ismi, (dizi) methoda gönderilen parametre


    }

    private static void yaz(int [] dizi ) {  // private static void yaz(int [] arr ) // arr ismiyle de alabiliriz
        System.out.println(Arrays.toString(dizi));  //System.out.println(Arrays.toString(arr));
    }

    private static int[] doldur(int uzunluk) {
        int [] arr =new int[uzunluk];
        for (int i = 0; i < uzunluk; i++) {
        arr [i] = (int) (Math.random()*100);
        }
        return arr;
        /*
         private static int[] doldur(int[] dizi) {  // yukardaki diziyi buraya gönderdik
//        int uzunluk = dizi.length;
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int) (Math.random() * 100);  // dizi
        }
        return dizi;
         */
    }
}
