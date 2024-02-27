package day08_Loops.DE08_Loops_ilk.L01_ForLoops.Tasks;

public class Task38___ {
    public static void main(String[] args) {
        /* aşağıdaki şekli oluşturunuz

              *
            * * *
          * * * * *
        * * * * * * *
      * * * * * * * * *
         */
        int n=5;

        for (int i = 1; i <=n ; i++) {
            for (int j = 0; j <= n-i; j++) {
                System.out.print(" ");

            }
            for (int k = 1; k <=2*i-1 ; k++) {
                System.out.print("*");

            }
            System.out.println();
        }





    }
}
