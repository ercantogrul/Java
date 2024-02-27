package day13_ilk_13Ders_degerlendirme_sorulari.DE13Ilk13DersDegerlendirmeSorulari.Level_1;

public class T16 {
    /*   sayi=random(1,5) şeklinde bir metot create edin
    bu metot 1 ile 5 arasında (sayılar dahil) rastgele bir sayı üretsin

     */
    public static void main(String[] args) {
        for (int i = 0; i <50 ; i++) {
            int sayi = random(3,5);
            System.out.print(sayi+", ");
        }

    }
    private static int random(int i, int i1) {

        return (int) (Math.random() * (i1-i+1) + i);
    }
}
