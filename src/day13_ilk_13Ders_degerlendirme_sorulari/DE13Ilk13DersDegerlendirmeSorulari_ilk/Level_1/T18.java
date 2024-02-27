package day13_ilk_13Ders_degerlendirme_sorulari.DE13Ilk13DersDegerlendirmeSorulari_ilk.Level_1;

import java.util.ArrayList;
import java.util.Arrays;

public class T18 {
    /*  verilen ArrayListin Karelerinden oluşan bir array oluşturun
        (3 yerine 9), (5 yerine 25) gibi
     */
    public static void main(String[] args) {

        ArrayList<Double> dizi = new ArrayList<>(Arrays.asList(3.5,6.0,3.5,76.4,4.0));
        double [] array = new double[dizi.size()];
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < dizi.size(); i++) {
            array[i]=dizi.get(i)*dizi.get(i);
        }
        System.out.println("array = " + (Arrays.toString(array)));

    }


}
