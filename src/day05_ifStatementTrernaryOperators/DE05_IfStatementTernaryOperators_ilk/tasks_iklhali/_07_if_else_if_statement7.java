package day05_ifStatementTrernaryOperators.DE05_IfStatementTernaryOperators_ilk.tasks_iklhali;

import java.util.Scanner;

public class _07_if_else_if_statement7 {

    public static void main(String[] args) {

 /*  Altta int number klavyeden girilerek oluşturulmuştur.
     Eğer, int number ikiye bölündüğünde geri kalanı 0'a eşit ise "number is a EVEN number" yazdırın.
     Eğer, int number ikiye bölündüğünde geri kalanı 0'a eşit değil ise "number is a ODD number" yazdırın.
*/
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int number = scan.nextInt();

        //Kodu aşağıya yazınız.
        if (number%2 == 0){
            System.out.println("cift sayidir");
        }else {
            System.out.println("tek sayidir");
        }






    }
}
