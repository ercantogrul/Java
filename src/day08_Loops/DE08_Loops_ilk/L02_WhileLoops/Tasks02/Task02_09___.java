package day08_Loops.DE08_Loops_ilk.L02_WhileLoops.Tasks02;

public class Task02_09___ {
    public static void main(String[] args) {
        /* Verilen n sayısına göre aşağıdaki şekli oluşturunuz
        n=5;
        * * * * *
        * * * *
        * * *
        * *
        *
         */

        int b =0;
        while (b<5){
            for (int k = 0; k <5-b ; k++) {
                System.out.print("* ");
            }
            b++;
            System.out.println();
        }

        System.out.println("======================================");

        int i = 5;// satir sayisi

        while (i >= 1) {

            int j = 1;
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i--;
        }




    }
}
