package day36_InterviewQuestions.DE40InterviewQuestions.Day04;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Q11_SurviveMonkey {
    /*
    There is a lonely monkey in the island
    He needs to eat 4 bananas every day
    there are just 165 bananas in that island
    Create following variables and find how many days
    monkey can survive.
    Use do while loop, increment and decrement and if statements
    int numberOfBananas =165, survivalDays = 1;
    boolean monkeyAlive = true;
    */
    public static void main(String[] args) {
        int numberOfBananas = 165;


       // lamdaCozum(numberOfBananas);
        diziIle(numberOfBananas);
    }
    private static void cozum1(int numberOfBananas){
        int survivalDays = 1;
        boolean monkeyAlive = true;
        do {
            numberOfBananas -= 4;
            if (numberOfBananas >= 0) {
                System.out.println("Bugun " + survivalDays + ".gün ve " + numberOfBananas
                        + " adet muz kaldı");
                survivalDays++;
            } else monkeyAlive = false;
        } while (monkeyAlive);
    }
    private static void lamdaCozum(int numberOfBananas) {
        // esas çözüm bu
        System.out.println(
                Stream.iterate(numberOfBananas, p -> p >= 4, p -> p - 4)
                        .count() + " gün hayatta kalmıştır");
        // üretilen sayıları ( gun gun kalan muz sayısını
        Stream.iterate(numberOfBananas, p -> p >= 4, p -> p - 4)
                .forEach(p -> System.out.print(p+" "));

        System.out.println();
        // List ile yapalım
        List<Integer> list = new ArrayList<>();
        list =  Stream.iterate(numberOfBananas, p -> p >= 4, p -> p - 4).toList();
        System.out.println(list);
        System.out.println(list.size()+" gün hayatta kalmıştır");
    }
    private static void diziIle(int numberOfBananas){
        // lamda da ki cozum mantığını List ile yapalım
        List<Integer> list = new ArrayList<>();
        do {
            list.add(numberOfBananas);
            numberOfBananas-=4;
        } while (numberOfBananas>=4);
        System.out.println(list.size()+" gün hayatta kalmıştır");
    }

}

