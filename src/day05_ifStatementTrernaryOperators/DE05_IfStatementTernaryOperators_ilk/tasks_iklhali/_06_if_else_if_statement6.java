package day05_ifStatementTrernaryOperators.DE05_IfStatementTernaryOperators_ilk.tasks_iklhali;

import java.util.Scanner;

public class _06_if_else_if_statement6 {

    public static void main(String[] args) {

        /*      Altta int number klavyeden girilerek oluşturulmuştur.
                Eğer int number 0 yazdırılırsa "Im neutral",
                Eğer int number 0'dan büyükse "I m positive",
                Eğer int number 0'dan küçükse "I am negative" yazdırılsın.   */

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int number = scan.nextInt();

        //Kodu aşağıya yazınız.
        if (number == 0) {
            System.out.println("Im neutral");
        } else if ((number > 0)) {
            System.out.println("I m positive");
        }else {
            System.out.println("I am negative");
        }



    }
}
