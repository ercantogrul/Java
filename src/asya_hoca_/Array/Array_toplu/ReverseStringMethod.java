package asya_hoca_.Array.Array_toplu;

import java.util.Scanner;

public class ReverseStringMethod {
    public static void main(String[] args) {
        /* Interview Question
    Write a Java program to reverse a string.
    Use for loop and create a method called reverseString */

        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();//melek

        reverseString(str);


    }

    private static String reverseString(String str) {//melek
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);// kel..

        }
        System.out.println(reverse);
        return reverse;
    }
}