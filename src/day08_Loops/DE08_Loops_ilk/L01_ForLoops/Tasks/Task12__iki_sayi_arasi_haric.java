package day08_Loops.DE08_Loops_ilk.L01_ForLoops.Tasks;

import java.util.Scanner;

public class Task12__iki_sayi_arasi_haric {
    public static void main(String[] args) {
        /*
        Task -> girilen 10 sayının [10 ile 20] arası hariç diğerlerinin
        toplamının print eden code create ediniz
        örnek , sayılar 13,5,20,7,10,12,56,45,15,12 olsun
        output : toplam = 5+7+56+45
         */

        Scanner scan =new Scanner(System.in);
        System.out.println("n sayi giriniz");
        int n = scan.nextInt();
        int gs;
        int toplam=0;
        int toplam2=0;

        for (int i = 1; i <= n; i++) {
            System.out.println(i+ ".sayi");
            gs =scan.nextInt();
            if (gs<10 || gs>20) {
                toplam=toplam+gs;
            } else
                toplam2=toplam2+gs;
        }
        System.out.println("10 ile 20 arasindaki sayilarin toplami  : "+(toplam2));
        System.out.println("10 ile 20 arasi haric sayilarin toplami : "+toplam);




    }
}
