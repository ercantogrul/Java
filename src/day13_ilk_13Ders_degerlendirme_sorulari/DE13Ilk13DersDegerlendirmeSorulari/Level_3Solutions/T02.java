package day13_ilk_13Ders_degerlendirme_sorulari.DE13Ilk13DersDegerlendirmeSorulari.Level_3Solutions;

public class T02 {
    public static void main(String[] args) {
        for (int i = 3; i <10 ; i+=2) {
            magicMatrix(i);
        }

    }
    private static void magicMatrix(int n){
        int[][] dizi = new int[n][n];
        int i=0;
        int j=n/2;
        int i2,j2;
        for (int sayi = 1; sayi <=n*n ; sayi++) {
            dizi[i][j]=sayi;
            if (i==0) i2=n-1;else i2=i-1;
            if (j==n-1) j2=0;else j2=j+1;
            if (dizi[i2][j2]==0) {
                i=i2; j=j2;
            } else {
                i++;
                if (i==n) i=0;
            }
        }
        for (int k = 0; k <n ; k++) {
            for (int l = 0; l <n ; l++) {
                System.out.printf("%3d",dizi[k][l]);
            }
            System.out.println();
        }
        System.out.println("\n\n");
    }

    // çözüm yaptığım video farklılıklar olabilir
    // https://youtu.be/tlzVRb4BQoo
}
