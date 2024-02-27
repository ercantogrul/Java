package day13_ilk_13Ders_degerlendirme_sorulari.DE13Ilk13DersDegerlendirmeSorulari_ilk.Level_2;

public class T09__TARIH_GUN_artirma {
    public static void main(String[] args) {
      /*    String str = "10/11/2023 şeklinde bir tarih veriliyor
      bunu bir gün ileri alın 11/11/2023 olsun, (şubat ayı 28 kabul edilsin)
      örnek 2 : input  : 31/12/2023
                output : 01/01/2024
       */
        String str = "30/11/2023";
        int gun = Integer.parseInt(str.substring(0,2));
        int ay  = Integer.parseInt(str.substring(3,5));
        int yil = Integer.parseInt(str.substring(6));
        System.out.println(gun);
        System.out.println(ay);
        System.out.println(yil);
        int ayGunSayisi = 0;
        switch (ay){
            case 1,3,5,7,8,10,12 -> ayGunSayisi=31;
            case 4,6,9,11        -> ayGunSayisi=30;
            case 2               -> ayGunSayisi=28;
        }
        if (gun<ayGunSayisi) gun++;
        else {
            gun=1;
            if (ay<12) ay++;
            else {
                ay = 1 ;
                yil++;
            }
        }
        String gunS = ""+gun;
        String ayS  = ""+ay;
        if (gunS.length() == 1 ) gunS ="0"+gunS;
        if (ayS.length()  == 1 ) ayS  ="0"+ayS;
        System.out.println(str);
        str = gunS+"/"+ayS+"/"+yil;
        System.out.println(str);

    }
}
