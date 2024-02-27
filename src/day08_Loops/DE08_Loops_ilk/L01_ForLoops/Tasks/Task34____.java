package day08_Loops.DE08_Loops_ilk.L01_ForLoops.Tasks;

public class Task34____ {

    public static void main(String[] args) {

//        1 2 3 4 5 6
//         2 3 4 5 6
//          3 4 5 6
//           4 5 6
//            5 6
//             6


        int n = 6;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        
        //======while ile cözüm==================
        int i = 0;
        int n1 = 6;
        while (i < n1) {
            for (int k = 0; k <i ; k++) System.out.print(" ");
            int j = 1;
            while (j<=(n1-i)){
                System.out.print(i+j+" ");
                j++;
            }
            i++;
            System.out.println();

        }





    }
}


