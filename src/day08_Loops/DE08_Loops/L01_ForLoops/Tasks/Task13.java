package day08_Loops.DE08_Loops.L01_ForLoops.Tasks;

public class Task13 {

    public static void main(String[] args) {
         /*
        A
        B B
        C C C
        D D D D
        E E E E E
        F F F F F F
        şekli print eden code create ediniz..
        A'nın ascıı kodu 65 tir
        */
        int n = 7;
        int sayi = 65;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print((char) sayi+" ");
            }
            sayi++;
            System.out.println();
        }



    }
}
