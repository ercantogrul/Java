package day13_ilk_13Ders_degerlendirme_sorulari.DE13Ilk13DersDegerlendirmeSorulari.Level_2;

public class T10__ {
    /*  Klavyeden girilen bir sayının pozitif,  negatif veya sıfır olduğunu bulup ekrana yazdırın
    (if ve ternary kullanılmayacak) switch ile yapılacak
     */
    public static void main(String[] args) {
        int sayi = (int) (Math.random()*11-5);
        int aa = Integer.compare(sayi, 0);
        aa = Integer.signum(sayi); // ikisi de olur

        switch (aa) {
            case 1:
                System.out.println("Pozitiftir");
                break;
            case -1:
                System.out.println("Negatiftir");
                break;
            default:
                System.out.println("Sifirdir");
                break;
        }
    }
}
