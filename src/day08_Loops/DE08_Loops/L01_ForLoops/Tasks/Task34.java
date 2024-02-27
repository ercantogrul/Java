package day08_Loops.DE08_Loops.L01_ForLoops.Tasks;

public class Task34 {

    public static void main(String[] args) {

//        1 2 3 4 5 6
//         2 3 4 5 6
//          3 4 5 6
//           4 5 6
//            5 6
//             6
        int i = 0;
        int n = 6;


        while (i < n) {
            for (int k = 0; k <i ; k++) System.out.print(" ");
            int j = 1;
            while (j<=(n-i)){
                System.out.print(i+j+" ");
                j++;
            }

            i++;
            System.out.println();

        }


    }
}


