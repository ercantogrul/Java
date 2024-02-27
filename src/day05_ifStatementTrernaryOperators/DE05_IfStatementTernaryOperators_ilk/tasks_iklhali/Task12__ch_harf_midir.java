package day05_ifStatementTrernaryOperators.DE05_IfStatementTernaryOperators_ilk.tasks_iklhali;

import java.util.Scanner;

public class Task12__ch_harf_midir {

    public static void main(String[] args) {
        /*
          TASK -> girilen bir karakterin harf  olup olmadığını  kontrol eden code create ediniz..
charechter istalpepatic
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("bir karakter giriniz");
        char ch = scan.next().charAt(0);

        if (ch >= 'a' && ch <='z' || ch >= 'A' && ch <='Z' ){
            System.out.println("ch bir harftir");
        }else
            System.out.println("ch bir harf degildir");



    }
}
