package day13_ilk_13Ders_degerlendirme_sorulari.DE13Ilk13DersDegerlendirmeSorulari_ilk.Level_3;

public class T02___ {
    public static void main(String[] args) {
        // Sihirli kareler i çözünüz n= 3, 5, 7, 9 ... olabilir
        // 1 den başlayarak n*n sayı yetleştirlecek, sutun, satır , diyagonel toplamları eşit olacak
        /* Ornek :
         n=5 için
            17 24  1  8 15
            23  5  7 14 16
             4  6 13 20 22
            10 12 19 21  3
            11 18 25  2  9

             n=7 için
            30 39 48  1 10 19 28
            38 47  7  9 18 27 29
            46  6  8 17 26 35 37
             5 14 16 25 34 36 45
            13 15 24 33 42 44  4
            21 23 32 41 43  3 12
            22 31 40 49  2 11 20

         */
        for (int i = 3; i < 10; i += 2) {
            magicMatrix(i);
        }

    }

    private static void magicMatrix(int n) {
        int[][] dizi = new int[n][n];
        int i = 0;
        int j = n / 2;
        int i2, j2;
        for (int sayi = 1; sayi <= n * n; sayi++) {
            dizi[i][j] = sayi;
            if (i == 0) i2 = n - 1;
            else i2 = i - 1;
            if (j == n - 1) j2 = 0;
            else j2 = j + 1;
            if (dizi[i2][j2] == 0) {
                i = i2;
                j = j2;
            } else {
                i++;
                if (i == n) i = 0;
            }
        }
        for (int k = 0; k < n; k++) {
            for (int l = 0; l < n; l++) {
                System.out.printf("%3d", dizi[k][l]);
            }
            System.out.println();
        }
        System.out.println("\n\n");
    }

    // çözüm yaptığım video farklılıklar olabilir
    // https://youtu.be/tlzVRb4BQoo


}

