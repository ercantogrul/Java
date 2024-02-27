package z_calismalar.OCI_sinav._223.Q025_t__Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Q025_1_List {
    public static void main(String[] args) {
        ArrayList<Integer > list = new ArrayList<>(Arrays.asList(1,2,3,4));
        ArrayList<Integer > list2 = new ArrayList<>(Arrays.asList(5,6));
        System.out.println(list); //[1, 2, 3, 4]
        list=list2;
        System.out.println(list);  //[5, 6]
    }
}
