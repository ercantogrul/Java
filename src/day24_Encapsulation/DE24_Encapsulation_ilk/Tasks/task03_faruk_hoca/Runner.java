package day24_Encapsulation.DE24_Encapsulation_ilk.Tasks.task03_faruk_hoca;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

class Runner {
    /*
     Runner class'ın içinde;
   obj ile
    Name is Fernando
    dob is 11/23/2000
    Salary is 80000

    Eğer employee 18 yaşında büyükse, Welcome to our company Fernando your salary is 80000. yazdırınız.
    Eğer Fernando 18 yaşından küçükse, come back when you are 18 years old. yazdırınız.
    Eğer Fernando 18 yaşındaysa,  we can have inter with you after that you can have j12_Arrays.PassingArraysToMethods 80000 salary yazdırınız.

trick: ageCalculator isminde bir method için  Şuanki tarih - doğum yılı = employee age
     */
    public static void main(String[] args) {
        String name = "Fernando";
        String dob  = "12/06/2005";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate dogumT = LocalDate.parse(dob, formatter);
        LocalDate bugun  = LocalDate.now();
      //  System.out.println(dogumT);
        Period p1 = Period.between(dogumT,bugun);
      //  System.out.println(p1);
        int yas = p1.getYears();
        System.out.println(yas);
         maasHesapla(yas);

    }

    private static void maasHesapla(int yas) {

        if (yas > 18 ) System.out.println("18 yaşından buyuk");
        else if (yas<18) System.out.println("18 yasından kucuk");
        else System.out.println("18 yasında");

    }
}
