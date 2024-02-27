package day13_ArrayList.DE13_ArrayList_son;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class C09_equals {
    //equals()-> iki listin hem index hem de value (değer) eşitliğini kontrol eder true/false return eder
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(3,6,3,2));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(3,6,3,2));
        list1.add(4);
        if (list1.equals(list2)) System.out.println("eşittirler");
        else System.out.println("farklıdırlar");
    }


}
