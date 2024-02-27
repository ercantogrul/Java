package day08_Loops.DE08_Loops_ilk.L02_WhileLoops.Tasks02;

import java.util.Scanner;

public class Task02_07 {
    public static void main(String[] args) {
        // rast gele 10 adet sayı üretiniz [1,100], bu sayılardan çift olanların sayısını bulunuz
        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen rast gele bir sayi giriniz ");
        int i=1;
        int counter =0;
        while (i<=10){
            System.out.println(i+". sayi");
            int sayi = (int) (Math.random()*99+1);
            System.out.println(sayi);
            if(sayi%2==0){
                counter+=1;
            }
            i++;

        }
        System.out.println("cift sayilarin sayisi :"+counter);



    }
}
