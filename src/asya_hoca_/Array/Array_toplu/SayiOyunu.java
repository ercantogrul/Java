package asya_hoca_.Array.Array_toplu;

import java.util.Scanner;

public class SayiOyunu {
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

        Scanner scanner=new Scanner(System.in);
        int sum=0;// toplam sıfır
        int count=0;//kaç adet sayı toplanacak
        do {
            System.out.println("Enter number:");
            int num=scanner.nextInt();
            sum = sum + num;//yazdığım sayıları toplama ekliyorum
            count ++;//kaç adet sayı girildiği

        }while (sum<=100);//toplam 100'e ulaşanada kadar döngü tekrar eder
        System.out.println(count+" adet sayıyı topladınız.Sonuç: "+sum);
    }
}
