package day10_MethodCreation.DE10_MethodCreation_ilk.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class s1 {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("lütfen bir tamsayi giriniz: ");
            int n = scan.nextInt();

            int [] fibonicci= new int [n];
            fibonicci [0] = 1;//
            for (int i = 1; i <n ; i++) {
                fibonicci[i]=fibonicci[i-1]+2;

            }System.out.print(Arrays.toString(fibonicci));



    }
}

