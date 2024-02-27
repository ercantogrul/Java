package day36_InterviewQuestions.Day01;

import java.util.Scanner;

public class Q07_IsDigit {
    /* Create a method that accepts a String as parameter and finds the sum of digits in that String.
    Example:
    input : J4\/4 1$ 34$¥
    output : 16

    Hint:
    Character.isDigit()
    Integer.valueOf()
   */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = input.nextLine();

        // birinci yol

        str= str.trim().replaceAll("\\D","");

        int sayi= Integer.parseInt(str);
        int toplam =0;
        while (sayi>0){
            int rakam =sayi%10;
            toplam =toplam+rakam;
            sayi = sayi/10;
        }
        System.out.println(toplam);


    // ikinci yol cok kolay
        int toplam1=0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)))
                toplam1+= Integer.parseInt(""+str.charAt(i));
        }
        System.out.println(toplam1);

    }




}
