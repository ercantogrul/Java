package day05_ifStatementTrernaryOperators.DE05_IfStatementTernaryOperators_ilk.tasks_iklhali;

import java.util.Scanner;

public class _19_school_grade {

    public static void main(String[] args) {

        /*  Task->
        Bir öğrencinin notunu belirleyen bir Java programı yazın.
    Program üç tür puan (sınav, ara sınav ve final puanı) okuyacak ve notu aşağıdaki kurallara göre belirleyecektir:

        Eğer ortalama not >=90% =>not=A
        Eğer ortalama not >= 70% ve<90% => not=B
        Eğer ortalama not >=50% ve <70% =>not=C
        Eğer ortalama not <50% =>note=F

        Aşağıdaki örnek çıktıya bakın:
        int Quiz_score: 80
        int mid_term_score: 68
        int Final_score: 90
        print (Your grade is B)
                  (Notunuz B'dir) */

        Scanner input = new Scanner(System.in);
        System.out.println("agam vize notu giresen : ");
        int vizeNot = input.nextInt();

        System.out.println("agam ara sınav notu giresen : ");
        int araSinavNot = input.nextInt();

        System.out.println("agam final notu giresen : ");
        int finalNot = input.nextInt();

        int notOrtalama = (int)(vizeNot*0.2 + araSinavNot*0.3 + finalNot*0.5);
        System.out.println("notOrtalama :" + notOrtalama );


        // Code start here DO NOT CHANGE THE CODE BEFORE THIS LINE

        if (notOrtalama >= 90) {System.out.println("A");}
        if (notOrtalama >=70) {System.out.println("B");}
        if (notOrtalama >= 50) {System.out.println("C");}
        if (notOrtalama <50) {System.out.println("F");}


    }
}
