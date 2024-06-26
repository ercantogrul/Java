package day36_InterviewQuestions.J40__InterviewQuestions.Day02;

import java.util.Arrays;
import java.util.Scanner;

public class Q005_DifferenceBetweenArrayLargestAndSmallest {
     /*  Create a function that takes an array and the difference between the largest
 and the smallest numbers.
 Ask user to enter array elements.
    kullanıcının girdigi bir array'in en buyuk elemani ile
    en kucuk elemanının  farkını bulan bir method create ediniz.
 */
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("array uzunluk :");
         int uzunluk = scanner.nextInt();
         int [] arr = new int[uzunluk];
         for (int i = 0; i < uzunluk; i++) {
             System.out.print("arrayin " + (i+1) + ".elemani :");
             arr[i] = scanner.nextInt();
         }
         Arrays.sort(arr);
         System.out.println(Arrays.toString(arr));
         System.out.println("Fark = " + (arr[uzunluk-1]-arr[0]));
         cozumLamda();
     }
     private static void cozumLamda() {
         int [] arr = {4,7,1,3,9,11,3,0,33};
         int max = Arrays.stream(arr).max().getAsInt();
         int min = Arrays.stream(arr).min().getAsInt();
         System.out.println(max-min);
     }

}
