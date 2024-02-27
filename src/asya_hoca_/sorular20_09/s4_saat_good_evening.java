package asya_hoca_.sorular20_09;

import java.util.Scanner;

public class s4_saat_good_evening {
    public static void main(String[] args) {
           /* Input from user time like 12:23 check time and give message
        Ex:
        06 ~ 12 ==> good morning
        12 ~ 15 ==> good afternoon
        15 ~ 20 ==> good evening
        20 ~    ==> good night
             */


        Scanner scan =new Scanner(System.in);
        System.out.print("Lütfen saat giriniz : ");
        String saat= scan.nextLine();
        int sa = Integer.parseInt(saat.substring(0, 2));

        if (sa>6 && sa<12){
            System.out.println(" good morning");
        }else if (sa>=12 && sa<15) {
            System.out.println("good afternoon");
        } else if (sa>=15 && sa<20) {
            System.out.println("good evening");
        } else
            System.out.println("good night");





    }
}
