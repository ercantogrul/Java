package day36_InterviewQuestions.Day01;

import java.util.Scanner;

public class Q03_PrimeNumber {
    /*
    Ask user enter a positive number and check if it is prime or not
    Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi giriniz :");
        int sayi = scanner.nextInt();

        int counter = 0;
        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0) {
                counter++;
            }
        }
        if (counter>2){
            System.out.println("Sayi asal degildir");
        }else {
            System.out.println("Sayi asaldir");
        }


    }


}
