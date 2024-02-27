package day08_Loops.DE08_Loops_ilk.L01_ForLoops.Tasks;

public class Task20___zor {

    public static void main(String[] args) {


//        1
//        2 6
//        3 7 10
//        4 8 11 13
//        5 9 12 14 15   şekli print eden code create ediniz.

        int n =5;
        for (int i = 1; i <=n ; i++) {
            int sayi =i;
            for (int j = 1; j <=i ; j++) {
                System.out.print(sayi+" ");
                sayi+=(n-j);

            }
            System.out.println();
        }





    }
}
