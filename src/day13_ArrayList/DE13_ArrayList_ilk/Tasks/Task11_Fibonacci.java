package day13_ArrayList.DE13_ArrayList_ilk.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task11_Fibonacci {
    /* Task->
    Girilen bir tamsayıya kadar FIBONACCI dizisi oluşturun.
    1-1-2-3-5-8-13-21-34....
    */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int sayi = scan.nextInt();

        fibonacciDizisiOlustur(sayi);


    }

    private static void fibonacciDizisiOlustur(int n) {

        int[] fibonacci = new int[n];
        fibonacci[0]=1;
        fibonacci[1]=1;

        for (int i = 2; i <n ; i++) {
            fibonacci[i]=fibonacci[i-1]+fibonacci[i-2]; // fibonacci dizisinin i elemanina atama

        }
        System.out.println(Arrays.toString(fibonacci));





    }
}
