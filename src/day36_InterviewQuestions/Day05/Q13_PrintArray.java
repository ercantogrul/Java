package day36_InterviewQuestions.Day05;

import java.util.Arrays;
import java.util.List;

public class Q13_PrintArray {
    // Create a method which takes String array as a parameter
    // and prints all the element
    public static void main(String[] args) {
        String [] arabalar = {"Honda", "Toyota", "Porsche", "Tesla", "BMW"};
        String [] renkler = {"Mavi", "Kirmizi", "Mor", "Kahverengi", "Sari","Turuncu", "Yesil"};

        printElements(arabalar,renkler);

    }
    public static void printElements(String[] arabalar,  String[] renkler){
        for (int i = 0; i < arabalar.length; i++) {
            System.out.print(arabalar[i]+" ");
        }
        System.out.println();

        List<String> list =Arrays.stream(arabalar).toList();
        System.out.println(list);
        list.stream().forEach(a-> System.out.print(a+" "));
        System.out.println();


        for (int i = 0; i < renkler.length; i++) {
            System.out.print(renkler[i]+" ");
        }




    }


}
