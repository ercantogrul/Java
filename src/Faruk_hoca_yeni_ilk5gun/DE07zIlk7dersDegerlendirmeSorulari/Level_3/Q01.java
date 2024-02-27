package Faruk_hoca_yeni_ilk5gun.DE07zIlk7dersDegerlendirmeSorulari.Level_3;

public class Q01 {
    public static void main(String[] args) {
        // verilen int bir sayının pozitif, yada negatif olma durumunu ekrana yazdıran bir code yazınız
        // ( if ve ternary kullanılmayacak, switch-case ile çözülecek ( ip ucu: Math.abs )
        // input : -12 , output: negatiftir
        // input :  32 , output: pozitiftir
        // (sıfır olma durumu göz artı edilmiştir)

        int sayi=10;
        int islem = sayi / Math.abs(sayi);  // sayı pozitif ise islem = 1
                                            // sayı negatif ise islem = -1

        // Math.abs(sayi) // sayının mutlak değeridir, yani, işareti + ya dönmüş halidir
        switch (islem) {
            case 1  -> System.out.println("pozitiftir");
            case -1 -> System.out.println("Negatiftir");
        }



    }
}
