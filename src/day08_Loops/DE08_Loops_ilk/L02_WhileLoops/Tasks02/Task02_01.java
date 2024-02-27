package day08_Loops.DE08_Loops_ilk.L02_WhileLoops.Tasks02;

import java.util.Scanner;

public class Task02_01 {
    public static void main(String[] args) {
        // verilen n sayısından 1 e kadar ekrana yan yana yazdırın,
        Scanner scan =new Scanner(System.in);
        System.out.println("Bitte gebe eine Nummer ein");
        int n =scan.nextInt();

        int i =n;
        while (i>1){
            System.out.print(i+", ");
            i--;
        }
















    }

}
