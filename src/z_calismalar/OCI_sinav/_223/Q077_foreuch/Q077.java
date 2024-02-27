package z_calismalar.OCI_sinav._223.Q077_foreuch;

public class Q077 {
    //59. Given this array:
    //Which two code fragments, independently, print each element in this array? (Choose two.)
    public static void main(String[] args) {
        int[] intArr = {8, 16, 64, 128};


            // A________________________
//        for (int i : intArr){ // ilk elemani alir 8-- sonra index 8 i yazdirmak isteyecek dolayisiyla gives ArrayIndexOutOfBoundsException verir
//            System.out.println(intArr[i] +" "); // we can not use intArr[i] //--> gives ArrayIndexOutOfBoundsException
//        }
        /*
         for (int i = 0; i < intArr.length; i++) {  // bu sekilde olabilirdi
            System.out.println(intArr[i] +" ");
        }
         */

            // B______________________________
//        for (int i : intArr){
//            System.out.println(i +" "); // i sirayla elemanlari ifade eder
//        }
            // C____________________________
//        for (int i = 0 : intArr){
//            System.out.println(intArr[i] +" ");//--> gives error
//            i++;
//        }
            // D
//       for(int i = 0; i < intArr.length; i++) {
//           System.out.println(i + " ");//--> gives 0 1 2 3
//       }
            //E
//        for(int i = 0; i < intArr.length; i++) {
//            System.out.println(intArr[i] + " ");//--> gives 8 16 64 128
//        }

            // F
//        for(int i ; i < intArr.length; i++) {//--> gives error at this line
//            System.out.println(intArr[i] + " ");
//        }
    /*
    A. Option A
    B. Option B
    C. Option C
    D. Option D
    E. Option E
    F. Option F
    Answer: BE
     */



    }
}
