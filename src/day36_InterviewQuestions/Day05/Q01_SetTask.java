package day36_InterviewQuestions.Day05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q01_SetTask {

    //  PART 1
    // create a method that accepts ArrayList<Integer> and Set<Integer> as parameters
    // and add all elements from ArrayList to Set

    // ArrayList<Integer> ve Set<Integer> öğelerini parametre olarak kabul eden bir yöntem oluşturun
    // ve tüm öğeleri ArrayList'ten Set'e ekleyin

    // PART 2
    // create a method that takes Set<Character> and varargs of char as parameters
    // and adds all chars to the set

    // Set<Character> ve char değişkenlerini parametre olarak alan bir yöntem oluşturun
    // ve tüm karakterleri sete ekleyin

    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        Set<Integer> hs = new HashSet<>();

        method(arrList,hs);

     //====================================================
        Set<Character> st =new HashSet<>();
        char[] ch = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'k'};

        method2(st,ch);

    }

    private static void method2(Set<Character> st, char[] ch) {
        String str = Arrays.toString(ch);
        str= str.substring(1,str.length()-1).replace(",","").replace(" ","");

        for (int i = 0; i < str.length(); i++) {
            Character xx = str.charAt(i);
            st.add(xx);
        }
        System.out.println(st);

    }
    private static void method(ArrayList<Integer> arrList, Set<Integer> hs) {
        arrList = new ArrayList<>(Arrays.asList(11,2,33,4,7));
        hs.addAll(arrList);
        System.out.println(hs);

    }
}
