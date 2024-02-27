package day36_InterviewQuestions.DE40InterviewQuestions.Day02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q005_DifferenceBetweenArrayLargestAndSmallest {
     /*  Create a function that takes an array and the difference between the largest
 and the smallest numbers.
 Ask user to enter array elements.
    kullanıcının girdigi bir array'in en buyuk elemani ile
    en kucuk elemanının  farkını bulan bir method create ediniz.
 */
     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("array uzunluk :");
//         int uzunluk = scanner.nextInt();
         int [] arr = {5,7,1,8,0,22,3,55,1};
         int max = Arrays.stream(arr).max().getAsInt();
         int min = Arrays.stream(arr).min().getAsInt();
         System.out.println(max-min);
         // List ile cozelim
         List<Integer> list = Arrays.stream(arr).boxed().toList();
         // .boxed -> IntStream i Stream e çeviriyor
         max = list.stream().reduce(Math::max).get();
         min = list.stream().reduce(Math::min).get();
         System.out.println(max-min);
     }

}
