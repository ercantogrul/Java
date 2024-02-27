package day05_ifStatementTrernaryOperators.DE05_IfStatementTernaryOperators_ilk.tasks_iklhali;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        /* Task->
         Kullanicidan 100 uzerinden notunu isteyin.
         Not’u harf sistemine cevirip yazdirin.
         50’den kucukse “D”,->1,2,3..49
         =50  <60 arasi “C”,->50,51,52,..59
         =60  <80 arasi “B”,->60,61,62,63..79
         =80’nin uzerinde ise “A”->80,81..100
         */



        Scanner scan = new Scanner(System.in);
        System.out.println(" yuz uzerinden notunuzu giriniz : ");
        int not = scan.nextInt();
        if (not>=80){
            System.out.println("sinav notu : "+ "A");
        } else if (not>=60) {
            System.out.println("sinav notu : "+ "B");
        } else if (not>=50) {
            System.out.println("sinav notu : " + "C");

        } else if (not<50 ) {
            System.out.println("sinav notu : " + "D");}

        String notOrtalamasi = not>=80 ? "sinav notu : "+ "A" : not >=60?  "sinav notu : "+ "B" : not>=50? "sinav notu : "+ "C" : "sinav notu : "+ "D";

    }









    }


