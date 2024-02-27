package day36_InterviewQuestions.Day02;

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
         Scanner scanner = new Scanner(System.in);
         System.out.println("array uzunluk :");
         int uzunluk = scanner.nextInt();

         int [] arr = new int[uzunluk];
         for (int i = 0; i < uzunluk; i++) {
             System.out.println(i+" . elemani giriniz ");
             arr[i]=scanner.nextInt();
         }
         System.out.println(Arrays.toString(arr));

         enB_enK_elemanFarki(arr);


         //ikinci yol stream ile
         int max = Arrays.stream(arr).max().getAsInt();
         int min = Arrays.stream(arr).min().getAsInt();
         int fark = max-min;
         System.out.println("fark = " + fark);

         // List ile cozelim
         List<Integer> list = Arrays.stream(arr).boxed().toList();
         // .boxed -> IntStream i Stream e çeviriyor
         max = list.stream().reduce(Math::max).get();
         min = list.stream().reduce(Math::min).get();
         System.out.println(max-min);


     }

    private static void enB_enK_elemanFarki(int[] arr) {
        int enB=arr[0];
        int enK =arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>enB){
                enB=arr[i];
            }
            if (arr[i]<enK){
                enK=arr[i];
            }
        }
        System.out.println("En Kücük deger:" + enK);
        System.out.println("En Büyük deger:" +enB);
        System.out.println("En büyük ve en kücük eleman farki :"+(enB-enK));



    }

}
