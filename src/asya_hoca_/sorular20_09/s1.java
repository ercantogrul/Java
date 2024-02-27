package asya_hoca_.sorular20_09;

import java.util.Scanner;

public class s1 {
    public static void main(String[] args) {

        /* Task ->
      Input from user Y,M,N letter
      Print
         OUTPUT : YES ; NO ; MAYBE
      ıf user input another letter
      Print
         OUTPUT : INVALID
     */
        Scanner scan = new Scanner(System.in);
        System.out.print(" harf giriniz: ");
        String str = scan.next();

        if (str.toLowerCase().equalsIgnoreCase("y")) {
            System.out.println("yes");

        } else if (str.toLowerCase().equalsIgnoreCase("m")) {
            System.out.println("no");

        } else if (str.toLowerCase().equalsIgnoreCase("n")) {
            System.out.println("maybe");

        }else System.out.println("invalid");


    }
}
