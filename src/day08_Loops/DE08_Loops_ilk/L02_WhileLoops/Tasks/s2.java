package day08_Loops.DE08_Loops_ilk.L02_WhileLoops.Tasks;

import java.util.Scanner;

public class s2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("bir tam sayi giriniz: ");
        int sayi1 = sc.nextInt();
        System.out.println("ikinci tam sayi giriniz: ");
        int sayi2 = sc.nextInt();


        int max = sayi1>sayi2? sayi1:sayi2;
        int min = sayi1>sayi2? sayi2:sayi1;

        min =min+1;
        while ((min)<=max){
            System.out.print(min+", ");
            min++;
        }




    }
}
