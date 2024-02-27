package day07_StringManuplation.DE07_StringManuplation_ilk.tasks;

import java.util.Scanner;

public class Task04__a_yi_b_nin_ortasina_yerlestirmek {
    public static void main(String[] args) {

        /*
         Task->
         Girilen iki kelimeden ilki çift sayıda karakter içeriyorsa 2. kelimeyi 1. kelimenin ortasına print eden
         ilk kelime tek sayıda karakter içeriyorsa "kelime2 kelime1 eklenemez" print eden code create ediniz
         name1= Java
         name2= haluk
         Print ==> Jahalukva
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir kelime giriniz");
        String str1 = scan.nextLine();
        System.out.println("lütfen 2. kelime giriniz");
        String str2 = scan.nextLine();
        int yari = str1.length()/2;

        String ilkP = str1.substring(0,yari);
        String ikinciP = str1.substring(yari);

        if (str1.length()%2==0) {
            System.out.println(ilkP + str2 + ikinciP);
        }else System.out.println("kelime2 kelime1 eklenemez");


      /*  System.out.println("lütfen 2. kelime giriniz");
        String str2 = scan.nextLine();
        if ( str1.length()%2==0) {
            int yari = str1.length()/2;
            String ilkParca =str1.substring(0,yari);
            String sonParca = str1.substring(yari);
            System.out.println(ilkParca+str2+sonParca);
        }else System.out.println("kelime2 kelime1 eklenemez");
        */











    }
}
