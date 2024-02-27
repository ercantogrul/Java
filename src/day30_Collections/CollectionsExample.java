package day30_Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionsExample {
    public static void main(String[] args) {

        ArrayList<String> l1=new ArrayList<>(Arrays.asList("A","d","12"));
        ArrayList<Object>l2=new ArrayList<>();
        l2.add(12);
        l2.add("ALi");
        l2.add('c');
        System.out.println("l2 = " + l2);
        int[] arr={1,2,3,4};
        l2.add(Arrays.toString(arr));
        System.out.println("l2 = " + l2);
    }
}
