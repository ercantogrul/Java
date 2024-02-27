package day13_ilk_13Ders_degerlendirme_sorulari.DE13Ilk13DersDegerlendirmeSorulari_ilk.Level_3;

import java.util.Arrays;

public class T05___Kare_Matris {
    /* Bir kare matris veriliyor, köşegenlerinin toplamları arasındaki mutlak farkı hesaplayın.
   Örnek :
    1 2 3
    4 5 6
    9 8 9
    1. köşegenin toplamı : 1+5+9 = 15
    2. köşegenin toplamı : 3+5+9 = 17
    fark  = 2

     */
    public static void main(String[] args) {


        int[][] dizi = new int[3][3];

        System.out.println("diziyi doldurun");
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                dizi[i][j] = (int) (Math.random() * 9 + 1);
            }
        }
        System.out.println(Arrays.deepToString(dizi));

        int kosegenlerArasindakiFark = (dizi[0][0] + dizi[1][1] + dizi[2][2] - dizi[0][2] + dizi[1][1] + dizi[2][0]);
        kosegenlerArasindakiFark =Math.abs(kosegenlerArasindakiFark);
        System.out.println(kosegenlerArasindakiFark);




    }
}
