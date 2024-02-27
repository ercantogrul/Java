package day10_MethodCreation.DE10_MethodCreation_ilk.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task24_fibonic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir tamsayi giriniz: ");
        int n = scan.nextInt();



        int [] fib= new int [n];// 10 elemanli bir dizi olusturduk
        fib [0] = 1;// 0. elemanini basta belirledik
        fib [1] = 1;// 0. elemanini basta belirledik

        for (int i = 2; i <n ; i++) {

            fib[i]=fib[i-1]+fib[i-2];// burada her seferinde yeni yerlere elelanlara atadik
            // i=2 iken i-1=1 ve i-2=0 .. 2. terim fibonacci[2]=1

        }System.out.print(Arrays.toString(fib));
    }
}
