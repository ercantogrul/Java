package day05_ifStatementTrernaryOperators.DE05_IfStatementTernaryOperators_ilk.tasks_iklhali;

import java.util.Scanner;

public class _15_if_else_statement_with_logic_operators4__contains__ {

    public static void main(String[] args) {

        /*   String number oluşturulmuştur.
             Eğer String € karakterini kapsıyorsa "This is euro" yazdırın.
             Eğer String $ karakterini kapsıyorsa "This is dollar" yazdırın.
             Aksi halde (else) "no money" yazdırın.   */

        Scanner scan = new Scanner(System.in);
        String number = scan.nextLine();

        //Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.

        if (number.contains("€")) {
            System.out.println("This is euro");
        } else if (number.contains("$")) {
            System.out.println("This is dollar ");
        }else {
            System.out.println("no money");
        }

        // Ternary yoluyla cözüm// onemli=======

        String durum=number.contains("€")? "This is euro"
                :(number.contains("$")?("This is dollar") : "no money" );
        System.out.println(durum);
        //=============================

        String geld;
        System.out.println(geld=number.contains("€")? ("This is euro") :((number.contains("$")?("This is dollar") : "not geld" )));

        System.out.println(number.contains("€")? ("This is euro") :((number.contains("$")?("This is dollar") : "not geld" )));

        String sonuc = number.contains("€")? ("This is euro") : number.contains("$")?("This is dollar") : "not geld" ; // bu sekilde yap
        System.out.println(sonuc);




        }

    }

