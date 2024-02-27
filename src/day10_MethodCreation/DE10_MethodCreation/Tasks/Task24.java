package day10_MethodCreation.DE10_MethodCreation.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
/*
       task-> girilen sayıya kadar olan Fİbonacci dizisi elemalarını print eden METHOD create ediniz.
       Fibonacci dizisi :0, 1, 1, 2, 3, 5, 8, 13, 21, 34
*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç eleman olsun : ");
        int n = scanner.nextInt();
        fibonacciDizisiOlustur(n);


    }

    private static void fibonacciDizisiOlustur(int n) {
        int[] fibonacci = new int[n];
        fibonacci[0]=0;
        fibonacci[1]=1;

        for (int i = 2; i <n ; i++) {
            fibonacci[i] = fibonacci[i-1]+fibonacci[i-2];
        }
        System.out.println(Arrays.toString(fibonacci));
    }


}
