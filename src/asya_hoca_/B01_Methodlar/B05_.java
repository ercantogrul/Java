package asya_hoca_.B01_Methodlar;

import java.util.Scanner;

public class B05_ {
    public static void main(String[] args) {
        /*
        Exercise: Birthday Budget
You and a friend are going out for their birthday. You have decided to treat your friend, so you’re paying for the activity. However, since you have a fixed amount of money to spend on fun things, you need to track how much the outing will cost so you can update your budget.
Write a program to help yourself estimate what the total cost of the activity will be. Your program will estimate the cost by taking the cost of the activities for one person and estimating how much it will cost for two people.
Here’s what you know about your activities:
Brunch - you know you typically get cheap entrees, so you expect that your friend’s entree will be twice as expensive as yours
Movies - since a movie ticket is charged per person, you and your friend will cost the same
Cake - you like the triple-layer slices, but your friend likes cupcakes. Your friend’s cake will cost 1/3 as much as yours.
Your program should ask how much YOUR brunch cost, how much a movie ticket costs per person, and how much YOUR cake costs. It should then compute how much your friend’s costs will be based on the information above. Be sure your program takes the input in this exact order.
Then print how much brunch will cost (for both of you), how much movie tickets will cost (for both of you), and how much the cake will cost (for both of you). Then print the grand total for the day.
Your output should look something like this:
How much does brunch usually cost?
12.63
How much is a movie ticket for one person?
17.50
How much does a slice of triple-layered cake cost?
27.00
Brunch: $37.89
Movies: $35.0
Cake: $36.0
Grand Total: $108.89
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Yemek ücretini giriniz : ");
        double yemek = scanner.nextDouble();
        System.out.println("Sinema ücretini giriniz : ");
        double sinema = scanner.nextDouble();
        System.out.println("Pastane ücretini giriniz : ");
        double pastane = scanner.nextDouble();

        hesap(yemek,sinema,pastane);
    }

    private static void hesap(double yemek, double sinema, double pastane) {
        double toplamHesap = (yemek+yemek*2)+(sinema*2)+(pastane+pastane/3);
        System.out.println("toplamHesap = " + toplamHesap);
    }





}
