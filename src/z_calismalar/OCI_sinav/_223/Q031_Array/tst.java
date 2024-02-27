package z_calismalar.OCI_sinav._223.Q031_Array;

import java.util.Arrays;

public class tst {
    public static void main(String[] args) {

        int array2 [] = new int[5];
        System.out.println(Arrays.toString(array2)); //[0, 0, 0, 0, 0]

        String st [] = new String[3];
        System.out.println(Arrays.toString(st));  // [null, null, null]

        int [][] scoros = new int[5][];
        System.out.println(Arrays.deepToString(scoros)); // [null, null, null, null, null]
    }
}
