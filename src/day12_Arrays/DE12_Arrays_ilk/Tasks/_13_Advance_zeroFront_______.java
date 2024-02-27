package day12_Arrays.DE12_Arrays_ilk.Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class _13_Advance_zeroFront_______ {

    public static void main(String[] args) {

      /*

   Verilen Array tam olarak aynı sayıları içeren, ancak tüm sıfırların dizinin başında gruplandırılması
   için yeniden düzenlenmiş bir Array döndürün.
   Sıfır olmayan sayıların sırası önemli değildir.
   Böylece {1, 0, 0, 1} {0, 0, 1, 1} olur. Verilen diziyi değiştirebilir ve döndürebilir veya yeni bir dizi oluşturabilirsiniz.

   Bu şekilde bir Array oluşturunuz: 1,0,0,1,0
   Sonuç böyle olmalı :  0,0,0,1,1

       */

        //       Kodu aşağıya yazınız..


        cozum1();
        cozum2();
        cozum_Arraylist();

    }

    private static void cozum_Arraylist() {
        ArrayList<Integer> dizi = new ArrayList<>(Arrays.asList(3, 5, 0, 0, 2, 0, 15, -1, 0, 54));
        for (int i = 0; i < dizi.size(); i++) {
            if (dizi.get(i) == 0) {
                dizi.remove(i);
                //  dizi.add(0,0);
                dizi.addFirst(0);
            }
        }
        System.out.println(dizi);
    }

    private static void cozum2() {
        int[] dizi = {3, 5, 0, 0, 2, 0, 15, -1, 0, 54};
        int[] diziYeni = new int[dizi.length];  // yeni bir dizi tanimladik
        Arrays.fill(diziYeni, 99); // dizinin icerisi 99 ile dolduruldu

        int basIdx = 0;
        int sonIdx = dizi.length - 1;
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] == 0) {
                diziYeni[basIdx] = dizi[i];
                basIdx++;
            } else {
                diziYeni[sonIdx] = dizi[i];
                sonIdx--;
            }

        }System.out.println("cözüm 2 :"+ Arrays.toString(diziYeni)); //cözüm 2 :[0, 0, 0, 0, 54, -1, 15, 2, 5, 3]
    }

    private static void cozum1() {
        int[] dizi = {3, 5, 0, 0, 2, 0, 15, -1, 0, 54};
        System.out.println(Arrays.toString(dizi));
        int basaKonulanSifirSayisi = 0;
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] == 0) {
                dizi[i] = dizi[basaKonulanSifirSayisi];
                dizi[basaKonulanSifirSayisi] = 0;
                basaKonulanSifirSayisi++;

            }
        }System.out.println("cözüm1 :"+ Arrays.toString(dizi));  //cözüm1 :[0, 0, 0, 0, 2, 3, 15, -1, 5, 54]
    }


}