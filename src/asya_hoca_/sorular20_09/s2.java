package asya_hoca_.sorular20_09;

import java.util.Scanner;

public class s2 {
    public static void main(String[] args) {
               /* Task->
    Input from user : qa, dev, ba, pm
    qa => print "you are Quality Analyst."
    dev => print "you are Developer."
    ba => print "you Business Analyst."
    pm => print "you are Project Manager."
      */
        Scanner scan = new Scanner(System.in);
        System.out.print(" harf giriniz: ");
        String str = scan.next();

        if (str.toLowerCase().equalsIgnoreCase("qa")) {
            System.out.println("you are Quality Analyst.");

        } else if (str.toLowerCase().equalsIgnoreCase("dev")) {
            System.out.println("you are Developer");

        } else if (str.toLowerCase().equalsIgnoreCase("ba")) {
            System.out.println("you Business Analyst");

        } else if (str.toLowerCase().equalsIgnoreCase("pm")) {
            System.out.println("you are Project Manager ");

        }else System.out.println("hatali ghiris yaptiniz");


    }
}
