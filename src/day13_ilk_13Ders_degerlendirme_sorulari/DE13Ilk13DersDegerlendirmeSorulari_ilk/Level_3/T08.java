package day13_ilk_13Ders_degerlendirme_sorulari.DE13Ilk13DersDegerlendirmeSorulari_ilk.Level_3;

public class T08 {
    public static void main(String[] args) {
        /*    birr array ve bir k integer değeri veriliyor
        Ör ar = {1,2,3,4,5,6}
        k=5
        dizinin i. ve j. elemanından oluşan tüm çiftleri seçin (i<j olmalı) ve bu çiftleri toplamı
        k ya tam bölüne biliyorsa bu çifti yazdırın, yukarıdaki örek için çıktı
        1,4
        2,3
        4,6
         */

        int [] array = new int[] {1,3,4,2,3,1,4,1};
        int k=2;
        int result =0; //kac kez bölünebilir
        for (int i = 0; i < array.length-1; i++) { // son elemani
            for (int j = i+1; j < array.length ; j++) {
                if ((array[i]+array[j]) % k ==0) result++;

            }

        }
        System.out.println("result = " + result);

    }
}
