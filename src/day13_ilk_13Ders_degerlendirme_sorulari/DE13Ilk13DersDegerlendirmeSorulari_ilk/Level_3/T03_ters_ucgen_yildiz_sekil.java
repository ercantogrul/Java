package day13_ilk_13Ders_degerlendirme_sorulari.DE13Ilk13DersDegerlendirmeSorulari_ilk.Level_3;

public class T03_ters_ucgen_yildiz_sekil {
    /* n sayısına göre aşağıdaki şekli yazdırıan bir code yazınız
    örnek n= 5 olsun
    * * * * *
     * * * *
      * * *
       * *
        *
     */
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print("* " );
            }
            System.out.println();
        }


    }
}
