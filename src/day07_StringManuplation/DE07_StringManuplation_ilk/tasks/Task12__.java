package day07_StringManuplation.DE07_StringManuplation_ilk.tasks;

import java.util.Scanner;

public class Task12__ {
    public static void main(String[] args) {
       /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimelik  ismi
         Örn. Haluk Bilgin Java -> H.B.J.  şeklinde print eden code create ediniz.
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("adinizi  giriniz");
        String name = scan.nextLine();
        int ilkB = name.indexOf(" ");
        int ikinciB = name.lastIndexOf(" ");

        System.out.print(name.substring(0,1).toUpperCase()+".");             // önce parcayi aldi sonra buyuttü.
        System.out.print(name.substring(ilkB+1,ilkB+2).toUpperCase()+".");     // ilk boslukdan sonra ki karakteri al büyüt
        System.out.print(name.substring(ikinciB+1,ikinciB+2).toUpperCase()+".");  //



        // ==============================
        System.out.println();

        String ss = "haLUk";
        System.out.println(ss.substring(0,1).toUpperCase()+ss.substring(1).toLowerCase());






    }
}
