package day07_StringManuplation.DE07_StringManuplation_ilk.tasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
      /* TASK :
       Kullanıcıdan tek seferde alınan ad soyadı ifadeyi
      ad ve soyadı ayrı ayrı print eden code create ediniz
       */
        Scanner scan = new Scanner(System.in);
        System.out.println("adinizi ve soyadinizi giriniz");
        String str1 = scan.nextLine();
        int bosluk = str1.indexOf(" ");

        System.out.println(str1.substring(0,bosluk));
        System.out.println(str1.substring(bosluk+1));
        System.out.println(str1.substring(0,bosluk)+"\n"+str1.substring(bosluk+1) );
        //System.out.println(str1.substring(bosluk));                 // bu haliyle bosluk da dahil oldugu icin bosluk+soyad olur









    }
}
