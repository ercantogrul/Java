package day13_ilk_13Ders_degerlendirme_sorulari.DE13Ilk13DersDegerlendirmeSorulari_ilk.Level_3;

public class T05___Diogonal_Difference {
    /* Diogonal Difference by HacerRank
    1 2 3 5 3
    1 7 3 5 3
    1 2 3 5 3
    1 2 3 5 3
    1 2 3 5 3

     */
    public static void main(String[] args) {
        int n= 5;
        int[][] dizi = new int [][] {{1, 2, 3, 5, 3},{1, 7, 3, 5, 3},{1, 2, 3, 5, 3},{1, 2, 3, 5, 3},{1, 2, 3, 5, 3}};

        int left =0;
        int right =0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i==j) left+=dizi [i][j];
                if (i+j==n-1) right+=dizi [i][j];

            }
        }
        int fark =Math.abs(left-right);
        System.out.println("fark = " + fark);
        System.out.println("left = " + left);
        System.out.println("right = " + right);




    }
}
