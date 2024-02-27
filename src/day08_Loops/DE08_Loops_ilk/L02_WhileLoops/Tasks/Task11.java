package day08_Loops.DE08_Loops_ilk.L02_WhileLoops.Tasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        /*
    task -> 0 (sıfır) girilene kadar girilen tum sayıların adedini ve toplamını print eden code create edinz.
    */
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int counter = 0;
        int sum = 0;
        int n = 20;
        /*
        for (int i = 1; i <n ; i++) {
            System.out.println(i+" . inci sayi");
            int gs = scan.nextInt();
            sum+=gs;
            counter++;
            if(gs==0)   {
                System.out.println("sifir girdiniz");break;
            }else System.out.println("yeniden bir sayi giriniz");
        }
        System.out.println("girilen sayilarin toplami :"+sum);
        System.out.println("girilen sayi adedi :"+ counter);
         */

        int j = 1;
        boolean flag = true;
        while (flag) {
            System.out.println(j + " . inci sayi");
            int gs = scan.nextInt();
            sum += gs;
            counter++;
            j++;
            if (gs == 0) {
                System.out.println("sifir girdiniz");
                flag = false;
            } else System.out.println("yeniden bir sayi giriniz");
        }
        System.out.println("girilen sayilarin toplami :" + sum);
        System.out.println("girilen sayi adedi :" + counter);









    }
}
