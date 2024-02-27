package day13_ilk_13Ders_degerlendirme_sorulari.DE13Ilk13DersDegerlendirmeSorulari_ilk.Level_1;

public class T16__ {
    /*   sayi=random(1,5) şeklinde bir metot create edin
    bu metot 1 ile 5 arasında (sayılar dahil) rastgele bir sayı üretsin

     */
    public static void main(String[] args) {

        int sayi = random(1, 5);
        System.out.println(sayi = random(1, 5));

    }
    private static int random(int i, int i1) {
        int sayi = (int) (Math.random()*5+1);
        return sayi;
    }

}
