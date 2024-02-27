package asya_hoca_.B02_Methodlar_2;

import java.util.Arrays;
import java.util.Scanner;

public class S01 {
    public static void main(String[] args) {
                /* Interview Question
    Write a Java program to reverse a string.
    Use for loop and create a method called reverseString */

        String str = "Merhaba Dünya";
        reverseString(str);


    }

    private static void reverseString(String str) {

        String[] str1 = str.split("");
        int n = str1.length;
        System.out.println(Arrays.toString(str1));
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(str1[i]);

        }
    }


}
