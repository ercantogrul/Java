package day12_Arrays.DE12_Arrays.Tasks;

import java.util.Arrays;

public class Task21 {

    public static void main(String[] args) {
		/* TASK :
		ayna check sorusu: verilen Arrayın Ayna array olmasını kontrol eden code create ediniz
		 input : int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 1 };
		 output : verilen array simetriktir
		 */
        int[] arr1 = { 11, 12, 13, 14, 15, 34, 33, 32, 31 };

//        metot1(arr1);
//        metot2(arr1);
//        metot3(arr1); // best practice
//        metot4(arr1); //
        metot5(arr1); //

    }
    private static void metot5(int[] dizi) {
        int yarisi= dizi.length/2;
        int n= dizi.length;
        int[] ilkParca = new int[yarisi];
        int[] sonParca = new int[yarisi];
        System.out.println(Arrays.toString(dizi));
        for (int i = 0,j= dizi.length-1; i <sonParca.length ; i++,j--) {
            System.out.println(i+","+j);
            ilkParca[i] = dizi[i];
            sonParca[i] = dizi[j];
        }
        if (Arrays.equals(ilkParca, sonParca))  System.out.println("Dizi simetriktir");
        else System.out.println("Simetrik değildir");
    }
//   { 11, 12, 13, 14, 15, 14, 13, 12, 11 };
    private static void metot4(int[] dizi) {
        int yarisi= dizi.length/2;
        int n= dizi.length;
        int[] ilkParca = Arrays.copyOf(dizi,yarisi);
        int[] sonParca = new int[yarisi];

        for (int i = 0; i <sonParca.length ; i++) {
            sonParca[i] = dizi[n-1-i];
        }

//        System.out.println(Arrays.toString(ilkParca));
//        System.out.println(Arrays.toString(sonParca));
        if (Arrays.equals(ilkParca, sonParca))  System.out.println("Dizi simetriktir");
        else System.out.println("Simetrik değildir");
    }

    private static void metot3(int[] arr1) {
        int n = arr1.length;
        boolean bb = true;
        for (int i = 0; i <n/2 ; i++) {
            int basT = i;
            int sonT = n-1-i;
        //    System.out.println(basT+","+sonT);
            if (arr1[basT] != arr1[sonT]) {
                bb=false;
            }
        }
        if (bb) System.out.println("Dizi simetriktir");
        else System.out.println("Simetrik değildir");
    }
    private static void metot2(int[] arr1) { // cozum 2
        int n = arr1.length;
        int counter=0;
        for (int i = 0; i <n/2 ; i++) {
            int basT = i;
            int sonT = n-1-i;
          //  System.out.println(basT+","+sonT);
            if (arr1[basT] == arr1[sonT]) {
                counter++;
            }
        }
        if (counter==n/2) System.out.println("Dizi simetriktir");
        else System.out.println("Simetrik değildir");

    }
    private static void metot1(int[] arr1) {
        int n = arr1.length;
        int counter=0; // boolean bb = true
        for (int i = 0; i <n/2 ; i++) {
            int basT = i;
            int sonT = n-1-i;
            System.out.println(basT+","+sonT);
            if (arr1[basT] != arr1[sonT]) {
                counter++; // bb=false
            }
        }
        if (counter==0) System.out.println("Dizi simetriktir");
        else System.out.println("Simetrik değildir");
        // if (bb)
    }
}

