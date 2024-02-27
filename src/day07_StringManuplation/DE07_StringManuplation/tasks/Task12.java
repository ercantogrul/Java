package day07_StringManuplation.DE07_StringManuplation.tasks;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
       /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimelik  ismi
         Örn. "Haluk bilgin Java" -> H.B.J.  şeklinde print eden code create ediniz.
        */
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine().trim();

        int i1 = name.indexOf(" ");
        int i2 = name.lastIndexOf(" ");

        System.out.print(name.substring(0,1).toUpperCase()+".");       // H.
        System.out.print(name.substring(i1+1,i1+2).toUpperCase()+"."); // B.
        System.out.print(name.substring(i2+1,i2+2).toUpperCase()+"."); // J.

        // ""halUK" stringini Haluk şekline dönderin
        System.out.println();
        String ss= "haLUk";
        System.out.println(ss.substring(0,1).toUpperCase()+ss.substring(1).toLowerCase());


    }
}
