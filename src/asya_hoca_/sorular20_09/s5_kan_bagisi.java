package asya_hoca_.sorular20_09;

import java.util.Scanner;

public class s5_kan_bagisi {
    public static void main(String[] args) {
          /*
                For user's age and weight information
        under 18 years of age                        ==>  cannot donate blood.
        over 18 years old and weighs less than 50 kg ==>  cannot donate blood.
        over 18 years old and weighs 50 or more kg   ==>  can donate blood.
        Create code that prints.
         */

        Scanner scan =new Scanner(System.in);
        System.out.print("yasinizi giriniz : ");
        int yas = scan.nextInt();
        System.out.println("kilonuzu girtiniz: ");
        int kilo = scan.nextInt();

        if(yas>=18) {
            if (kilo<50) {
                System.out.println("cannot donate blood");
            } else
                System.out.println("can donate blood");
        }else System.out.println("cannot donate blood.");



































    }
}
