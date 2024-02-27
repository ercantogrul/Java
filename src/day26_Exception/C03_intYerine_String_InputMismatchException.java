package day26_Exception;

import java.util.Scanner;

public class C03_intYerine_String_InputMismatchException {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sayi = scanner.nextInt(); // String girilirse InputMismatchException
    }
}
