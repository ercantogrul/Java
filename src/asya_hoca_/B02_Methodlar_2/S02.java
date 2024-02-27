package asya_hoca_.B02_Methodlar_2;

import java.util.Scanner;

public class S02 {
    public static void main(String[] args) {
        /*
    Task->
       Kullanicidan sayilar girmesini isteyin
     * ve girdigi sayilari toplayip yazdirin.
     * yeni sayi isteyin
     * girilen sayilarin toplami 100 'u gecerse
     * "... kere sayi girdin. Bu kadar sayi yeter" yazdirin ve oyunu bitirin
     *
     */
        int toplam=0;
        while (toplam<100){
            Scanner scan = new Scanner(System.in);
            System.out.println("Lütfen bir sayi giriniz");
            int sayi= scan.nextInt();
            toplam=+toplam+sayi;
        }
        System.out.println(toplam);
    }
}
