package day13_ArrayList.DE13_ArrayList_son.Tasks;

import java.util.Scanner;

public class _11_prime_numbers {

    /*
    negatif olmayan bir n sayısı girin ve bu sayıya kadar olan kaç asal sayı var ise yazdırın.

        Örnek 1:
        n = 20

        cevap: 8      ==   (2,3,5,7,11,13,17,19)  20 ye kadar 8 adet asal sayı vardır.
        Örnek2:
        Input(Girdi): 10
        Output(Çıktı): 4
        Explanation(Açıklama): 10'dan küçük 4 adet asal sayı vardır. (2,3,5,7)
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int counter=0;
        for (int i = 2; i <=n ; i++) {
            boolean asalmi = asalBul(i);
            if (asalmi) {
                counter++;
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("1 den "+n+" e kadar " +counter+" adet asal sayı vardır");

    }

    private static boolean asalBul(int i) {
        boolean asalmi=true;
        for (int j = 2; j <=i/2 ; j++) {
            if (i%j == 0) asalmi=false;
        }
        return asalmi;
    }
}





