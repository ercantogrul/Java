package day12_Arrays.DE12_Arrays_ilk.Tasks;

import java.util.Arrays;
public class Task20_____ {
    public static void main(String[] args) {
        // Task-> verilen bir array'den istenmeyen elemanı silip  kalanlari
        // yeni bir array'a atayıp print eden METHOD create ediniz

        int[] dizi = {3, 5, 7, 1, 3, 33, 3, 2, 34};

        cozum1(dizi);
        cozum2(dizi);
    }

    private static void cozum2(int[] dizi) {
        String str = ",";
        for (int i = 0; i < dizi.length; i++) {
            str = str + dizi[i] + ",";
        }
        System.out.println(str); //,3,5,7,1,3,33,3,2,34,

        str = str.replace(",3,", ",");
        System.out.println(str);            //,5,7,1,33,2,34,
        str = str.substring(1, str.length() - 1);
        System.out.println(str);               // 5,7,1,33,2,34
        String[] strDizi = str.split(",");
        System.out.println("cözüm 2: "+Arrays.toString(strDizi));    //cözüm 2: [5, 7, 1, 33, 2, 34]
    }

    private static void cozum1(int[] dizi) {
        int istenmeyeninSayisi = 0;
        int istenmeyen = 3;
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] == istenmeyen) istenmeyeninSayisi++;
        }
        int[] yeniDizi = new int[dizi.length - istenmeyeninSayisi];
        int j = 0;
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] != istenmeyen) {
                yeniDizi[j] = dizi[i];
                j++;
            }
        }
        System.out.println("cözüm 1: "+Arrays.toString(yeniDizi));
    }


}
