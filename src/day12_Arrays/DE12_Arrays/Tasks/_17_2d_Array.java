package day12_Arrays.DE12_Arrays.Tasks;

import java.util.Arrays;

public class _17_2d_Array {

    public static void main(String[] args) {

        /*
        Şu şekilde olan bir 2D int Array'î oluşturunuz.  [{2,3,2} , {4,1,5} , {7,2,5}]
        Bütün 2'leri 6'yla değiştirin.
        Array'i yazdırınız.
         */

        //Kodu aşağıya yazınız.
        int[][] dizi =  {{2,3,2,6,7,1,5,6,4} , {4,1,5,0,0,4} , {7,2,5,11,22,1}};

      //  ilkGun(dizi);

        int toplam =0;// dizinin tüm elemanlarını toplamak için
        int altToplam;
        for (int i = 0; i < dizi.length ; i++) {
            altToplam=0;
            for (int j = 0; j <dizi[i].length ; j++) {
                System.out.printf("%3d",dizi[i][j]);
                toplam    += dizi[i][j];
                altToplam += dizi[i][j];
            }
            System.out.println();
            System.out.println(i+".satır altToplam = " + altToplam);
        }
        System.out.println("Tüm toplam = " + toplam);
    }

    private static void ilkGun(int[][] dizi) {
        for (int i = 0; i < dizi.length ; i++) {
            for (int j = 0; j <dizi[i].length ; j++) {
                if (dizi[i][j]==2) dizi[i][j]=6;
                System.out.print(dizi[i][j]+" ");
            }
            System.out.println();
        }

        for (int i = 0; i < dizi.length ; i++) {
            System.out.println(Arrays.toString(dizi[i]));
        }
    }
}