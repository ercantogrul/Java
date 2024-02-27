package Faruk_hoca_yeni_ilk5gun.DE05_IfStatementTernaryOperators.DE05_IfStatementTernaryOperators.tasks;

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


        // Code start here DO NOT CHANGE THE CODE BEFORE THIS LINE


    }
}
