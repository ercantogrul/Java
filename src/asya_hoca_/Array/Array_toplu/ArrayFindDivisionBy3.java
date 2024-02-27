package asya_hoca_.Array.Array_toplu;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFindDivisionBy3 {
    public static void main(String[] args) {
        /* task->
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
         kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
        */
        Scanner scanner=new Scanner(System.in);
        int[] arr=new int[8];
        for (int i = 0; i < 8; i++) {
            System.out.print("Dizinin elemanlarını giriniz");
            arr[i]=scanner.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%3==0){
                count++;
            }
        }
        System.out.println("There are "+count+" numbers");
    }
}
