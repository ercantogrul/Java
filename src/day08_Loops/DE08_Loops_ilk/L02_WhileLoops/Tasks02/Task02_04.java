package day08_Loops.DE08_Loops_ilk.L02_WhileLoops.Tasks02;

import java.util.Scanner;

public class Task02_04 {
    public static void main(String[] args) {
        // n1 den n2 kadar, tek ve çift sayıların toplamını bulan program yazınız

        Scanner scan =new Scanner(System.in);
        System.out.println("Bitte gebe eine Nummer ein");
        int n1 =scan.nextInt();
        System.out.println("Bitte gebe zweite Nummer ein");
        int n2 =scan.nextInt();
        int toplamC=0;
        int toplamT=0;
        int max =n1>n2? n1:n2;
        int min =n1>n2? n2:n1;


        while (min<max) {
            if (min%2==0){
                System.out.print(min+", ");
                toplamC+=min;
            }else {
                System.out.println();
                System.out.print(min + ", ");
                toplamT += min;
            }
            min++;
        }
        System.out.println();
        System.out.println("cift sayilar: "+toplamC+", ");
        System.out.println("tek sayilar: "+toplamT+", ");




    }
}