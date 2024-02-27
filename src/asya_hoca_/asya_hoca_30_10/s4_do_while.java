package asya_hoca_.asya_hoca_30_10;

import java.util.Scanner;

public class s4_do_while {
    public static void main(String[] args) {
/*Task->
     Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
     ve x girildiğinde ise "Program bitti" print eden code create ediniz
     */
        Scanner scan = new Scanner(System.in);
        String ch;

        do{
            System.out.println("Program calisiyor: ");
            ch = scan.nextLine();

        }while (!ch.equalsIgnoreCase("x"));
        System.out.println("program bitti");

        //===============================================================



    }
}
