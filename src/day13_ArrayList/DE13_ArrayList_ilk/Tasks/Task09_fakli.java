package day13_ArrayList.DE13_ArrayList_ilk.Tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Task09_fakli {
    public static void main(String[] args) {
  /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("kac elemanli bir Arraylist istiyorsunuz");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println(i + " . eleman");
            list.add(i, scan.nextInt());
        }
        System.out.println(list);
        int toplam =0;
        for (int i = 0; i < list.size(); i++) {
            toplam+= (int) Math.pow(list.get(i),2);

        }
        System.out.println("elemanlarinkareleri toplami : "+toplam);












    }
}
