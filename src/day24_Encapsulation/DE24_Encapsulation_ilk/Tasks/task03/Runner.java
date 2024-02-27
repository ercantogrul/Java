package day24_Encapsulation.DE24_Encapsulation_ilk.Tasks.task03;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Runner {
    public static void main(String[] args) {

        Employees kisi = new Employees("Fernando", 80000, "11/23/2000");
        System.out.println(kisi);
        ageCalculator(kisi.getGeburtsdatum());

        Employees kisi2 = new Employees();
        kisi2.setName("Hasan");
        kisi2.setGeburtsdatum("13/2/2000");
        kisi2.setSalary(80000);
        System.out.println(kisi2);

        ageCalculator(kisi2.getGeburtsdatum());


    }

    public static void ageCalculator(String geburtsdatum) {
        Employees kisi = new Employees();

        LocalDate heute = LocalDate.now();
        LocalDate dogumTarihi = LocalDate.of(2000, 11, 23);
        int yilFarki = (int) ChronoUnit.YEARS.between(dogumTarihi, heute);
        System.out.println(yilFarki + " yasinda");


        if (yilFarki > 18) {
            System.out.println("Welcome to our company Fernando your salary is 80000.");
        } else if (yilFarki < 18) {
            System.out.println("come back when you are 18 years old.");
        } else
            System.out.println(" we can have inter with you after that you can have j12_Arrays.PassingArraysToMethods 80000 salary");

    }
}