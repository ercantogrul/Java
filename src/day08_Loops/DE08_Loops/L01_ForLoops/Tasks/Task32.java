package day08_Loops.DE08_Loops.L01_ForLoops.Tasks;

public class Task32 {
    public static void main(String[] args) {
        /*

        *
        * *
        * * *
        * * * *
        * * *
        * *
        *
        şeklipriint eden code create ediniz
        n=4 , n değişebilir
         */
        // ipucu : artis ve azalis kisimlarini 2 ayri nested loop ile yapmalisiniz
        int n = 9;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <n ; i++) {
            for (int j = 1; j <=(n-i) ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n\n");
// 2.yol
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <n ; i++) {
            for (int j = n-i; j >0 ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n\n");
// 3.yol
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        int n2=n;
        for (int i = 1; i <n ; i++) {
            for (int j = 1; j<n2 ; j++) {
                System.out.print("* ");
            }
            n2--;
            System.out.println();
        }


    }
}
