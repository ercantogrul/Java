package day08_Loops.A01_whileLoop_DoWhileLoop;

public class B01_1_while {
    public static void main(String[] args) {

        // 1'den 100'e kadar olan sayilari (sinirlar dahil)
        // for loop ile hesaplayin

        int toplam=0;

        for (int i = 1; i <= 100 ; i++) {

            toplam+=i;
        }

        System.out.println("for loop ile toplam : " + toplam); // 5050


        toplam =0;
        int i = 1;

        while (i<=100){

            toplam += i ;

            i++;
        }

        System.out.println("while loop ile toplam : " + toplam); // while loop ile toplam : 5050
    }
}
