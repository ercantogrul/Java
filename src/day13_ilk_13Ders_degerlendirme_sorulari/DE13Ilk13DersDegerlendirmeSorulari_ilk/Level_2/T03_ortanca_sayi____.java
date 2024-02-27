package day13_ilk_13Ders_degerlendirme_sorulari.DE13Ilk13DersDegerlendirmeSorulari_ilk.Level_2;

import java.util.Scanner;

public class T03_ortanca_sayi____ {
    public static void main(String[] args) {
        // rastgele birbirinden 3 int sayı klavyeden girin ve ortancasını sadece bir adet if değimi
        // kullanarak bulun. ( Ternary,Math,Integer kullanılmayacak)

        Scanner scan = new Scanner(System.in);
        System.out.println("3 sayi giriniz");
        int a= scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a>b && b>c ||a<b && b<c){
            System.out.println("ortanca sayi: "+b);
        } else if ((b>a && a>c) || (b<a && a<c) ) {
            System.out.println("ortanca sayi: "+a);
        }else System.out.println("ortanca sayi: "+c);


    }
}
