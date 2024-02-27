package day13_ilk_13Ders_degerlendirme_sorulari.DE13Ilk13DersDegerlendirmeSorulari_ilk.Level_2;

public class T08_tarih_gun_artirma {
    /*  String str = "03/01/2022 şeklinde bir tarih veriliyor
    bunu 05 / Kasım / 2023 şeklinde yazan bir metot yazınız
     */
    public static void main(String[] args) {
        String str ="03/01/2022";


        str= str.replace(str.substring(0,str.indexOf("/")), "05");
        str = str.replace(str.substring(str.indexOf("/")+1,str.lastIndexOf("/")), "Kasim");
        str = str.replace(str.substring(str.lastIndexOf("/")+1), "2023");
        System.out.println(str);





    }

}
