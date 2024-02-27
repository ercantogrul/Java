package day13_ArrayList.DE13_ArrayList_ilk.Tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Task09__n_elemanlarinkareleri_toplami {
    public static void main(String[] args) {
  /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */

        ArrayList<String> list = new ArrayList<>();

        System.out.println("liste atamak içn sayı giriniz\nAgam yeter diyirsen 'q' gir ");
        int girilensayi =0;
        int i =0;
        int toplam = 0;

        do {
            System.out.println("liste atamak içn sayı giriniz ");
            Scanner input = new Scanner(System.in);
            girilensayi = input.nextInt();

            toplam+=(int) Math.pow(girilensayi,2);
            System.out.println("elemanlarinkareleri toplami : "+toplam);

            list.add(i, String.valueOf(girilensayi));
            System.out.println(list);
            i++;
        }while (girilensayi !='q');











    }
}
