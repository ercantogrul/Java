package day36_InterviewQuestions.Day04;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Q11_SurviveMonkey__ {
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
            int numberOfBananas =165;
            int survivalDays = 1;
            boolean monkeyAlive =true;

            do {
                numberOfBananas-=4;
                if (numberOfBananas>=0){
                    System.out.println("Bugün ="+ survivalDays+" .gün ve "+numberOfBananas+" adet muz kaldi");
                    survivalDays++;
                }else monkeyAlive=false;

            }while (numberOfBananas>=0);

            //ikinci yol======================
            int numberOfBananas1 =165;
            System.out.println(Stream.iterate(numberOfBananas1, p-> p>=4, p-> p-4)
                    .count() + " gün hayatta kalmistir");

        // üretilen sayilari (gün gün kalan muz sayisi) ****************
            Stream.iterate(numberOfBananas1, p-> p>=4, p-> p-4)
                    .forEach(p-> System.out.print(p+" "));
            System.out.println();


            // list ile yapalim
            List<Integer>list = new ArrayList<>();
            list=Stream.iterate(numberOfBananas1, p-> p>=4, p-> p-4).toList();
            System.out.println(list);
            System.out.println(list.size()+" gün hayatta kalmistir");





        }

}

