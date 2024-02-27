package day13_ilk_13Ders_degerlendirme_sorulari.DE13Ilk13DersDegerlendirmeSorulari_ilk.Level_2;

public class T09_tarih_ileri_alma___ {
    public static void main(String[] args) {
      /*    String str = "10/11/2023 şeklinde bir tarih veriliyor
      bunu bir gün ileri alın 11/11/2023 olsun, (şubat ayı 28 kabul edilsin)
      örnek 2 : input  : 31/12/2023
                output : 01/01/2024
       */
        String str = "10/11/2023";

        String yeniTarih = "";

        int gun = Integer.parseInt(str.substring(0, 2));
        gun++; //gun bir gun ileri alinacak


        if (gun > 30) {
            int ay = Integer.parseInt(str.substring(3, 5));
            ay++;
            yeniTarih = "01/" + ay + str.substring(5);
        } else {
            yeniTarih = gun + str.substring(2);
        }
        System.out.println(yeniTarih);


    }


}
