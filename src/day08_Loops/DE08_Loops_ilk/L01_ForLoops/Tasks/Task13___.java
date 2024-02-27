package day08_Loops.DE08_Loops_ilk.L01_ForLoops.Tasks;

public class Task13___ {

    public static void main(String[] args) {
         /*
        A
        B B
        C C C
        D D D D
        E E E E E
        F F F F F F
        şekli print eden code create ediniz..
        A nin ascii degeri 65 dir

        */

        int n=5;
        int sayi =65;

        for (int i = 0; i <n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print((char)sayi+" ");

            }
            sayi++;
            System.out.println();

        }

        //================================================================================
        System.out.println("ikinci yöntem=================");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                char ch = (char) (64+i);
                System.out.print(ch+" ");

            }
            System.out.println();

        }








    }
}
