package day08_Loops.DE08_Loops_ilk.L02_WhileLoops.Tasks;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        // Task-> girilen 5 sayının en buyugunu print eden code create ediniz

        Scanner oku = new Scanner(System.in);

        int enB =Integer.MIN_VALUE;
        for (int i = 1; i <=5 ; i++) {
            System.out.println(i+" . sayi");
            int gs =oku.nextInt();
            if (enB<gs) enB=gs;
        }
        System.out.println("en büyük sayi : " +enB);

    //==============================================
        int j = 1;
        while (j<=5){
            System.out.println(j+" . sayi");
            int gs =oku.nextInt();
            if (enB<gs) enB=gs;
            j++;
        }
        System.out.println("en büyük sayi : " + enB);













    }
}
