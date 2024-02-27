package Faruk_hoca_yeni_ilk5gun.DE07zIlk7dersDegerlendirmeSorulari.Level_2;

import java.util.Scanner;

public class Q02_enB_Ternary_icinde_MahtXlass_ile_yapmak {
    public static void main(String[] args) {
        // Klavyeden girilen 4 sayının en büyüğünü
        // Aşağıdaki yöntemlerden en az 2 tanesi ile çözünüz
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayi 1 ? ");
        int s1 = scanner.nextInt();
        System.out.print("Sayi 2 ? ");
        int s2 = scanner.nextInt();
        System.out.print("Sayi 3 ? ");
        int s3 = scanner.nextInt();
        System.out.print("Sayi 4 ? ");
        int s4 = scanner.nextInt();


        // Task 04.1 : if kullanarak bulunuz (ternary, wrapper,Math kullanılmayacak)
        // Task 04.2 : ternary kullanarak bulunuz (if, wrapper,Math kullanılmayacak)
        // Task 04.3 : Matt class kullanarak bulunuz (if, ternary, wrapper,kullanılmayacak)
        int en3 = Math.max(Math.max(s1,s2),Math.max(s3,s4));
        // Task 04.4 : Wrapper class kullanarak bulunuz (if, ternary, math,kullanılmayacak)
        int enBs1s2 = Integer.max(s1,s2);
        int enBs3s4 = Integer.max(s3,s4);
        int enBuyuk = Integer.max(enBs1s2,enBs3s4);
        System.out.println("enBuyuk4 = " + enBuyuk);
        // Task 04.5 : Math class içinde ternary kullanarak bulunuz (if,wrapper,kullanılmayacak)
        // Task 04.6 : Ternary içinde Math class kullanarak bulunuz (if,wrapper,kullanılmayacak)

        enBuyuk = Math.max(s1,s2)>Math.max(s3,s4) ?  Math.max(s1,s2): Math.max(s3,s4);
        System.out.println("enBuyuk6 = " + enBuyuk);


    }
}
