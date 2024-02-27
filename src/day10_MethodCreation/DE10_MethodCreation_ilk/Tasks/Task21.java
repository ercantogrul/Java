package day10_MethodCreation.DE10_MethodCreation_ilk.Tasks;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        /*
    task-> girilen bir tamsayının basamak sayısını print eden METHOD create ediniz.
    */
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir tamsayi giriniz: ");
        int sayi = scan.nextInt();

        System.out.println(basamakSayisi(sayi));
        basamakSayisi2(sayi);

    }

    private static void basamakSayisi2(int sayi) {
        String str = String.valueOf(sayi);
        System.out.println(str.length());
    }

    private static int basamakSayisi (int sayi1){
        String sy= String.valueOf(sayi1);
        int sayac =0;
        for (int i = 0; i < sy.length(); i++) {
            sayac +=1;

        }
        return sayac;
    }
}
