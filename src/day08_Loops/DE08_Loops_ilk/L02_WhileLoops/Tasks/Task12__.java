package day08_Loops.DE08_Loops_ilk.L02_WhileLoops.Tasks;

import java.util.Scanner;

public class Task12__ {

    public static void main(String[] args) {
		/*
		 task->girilen bir metinde harf rakam ve özel karakter sayısını print eden code create ediniz.
		do-While loop
		 */

        Scanner scan = new Scanner(System.in);
        //System.out.println("bir metin giriniz: ");
      //  String str = scan.nextLine();  //In Deutschlan gibt es 12462734+'?"$% so viel interesante manschen.

        String str1 = "AsyaCool!'34%&/(";
        int digit = 0;
        int letter = 0;
        int charater = 0;
        /*
         for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);

            if (c >= '0' && c <= '9') {
                digit ++;
            } else if (c >= 'a' && c <= 'z') {
                letter ++;
            } else if (c >= 'A' && c <= 'Z') {
                letter ++;
            } else {
                charater ++;
            }
        }
        System.out.println("digit:"+digit);
        System.out.println("charater:"+charater);
        System.out.println("letter:"+letter);
         */

        //====================do while===================

        int n= str1.length();
        int i=0;

        do {
            char c = str1.charAt(i);
            if (c >= '0' && c <= '9') {
                digit ++;
            } else if (c >= 'a' && c <= 'z') {
                letter ++;
            } else if (c >= 'A' && c <= 'Z') {
                letter ++;
            } else {
                charater ++;
            }

            i++;
        } while (i< n);

        System.out.println("digit:"+digit);
        System.out.println("charater:"+charater);
        System.out.println("letter:"+letter);


    }

}
