package asya_hoca_.sorular20_09;

import java.util.Scanner;

public class s3 {
    public static void main(String[] args) {
          /* Task->
             For the entered age data
             age <= 18      ==> not eligible to vote
             age >= 70      ==> can vote three times
             70 > age >= 50 ==> can vote twice
             50 > age >= 18 ==> can vote once,
             Create the code that prints...
         */

        Scanner scan = new Scanner(System.in);
        System.out.print(" yasinizi giriniz: ");
        int i = scan.nextInt();

        if (i>18) {
            if (i>=70){
                System.out.println("can vote three times");
            } else if (i>=50) {
                System.out.println("can vote twice");
            } else
                System.out.println("can vote once");
        }else System.out.println("not eligible to vote");





























    }
}
