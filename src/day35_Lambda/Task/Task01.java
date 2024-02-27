package day35_Lambda.Task;

import java.util.ArrayList;
import java.util.List;

public class Task01 {
    /* Rastgele 20 Integer(1 den 100 e kadar) elemandan oluşan bir List yapın
    a) Bu list in (stream kullanarak) tek olan elemanlarını yazdırın
    b) Bu list in (stream kullanarak) tek olan elemanlarını yazdırın (filter içinde motot kullanın)


     */
    public static void main(String[] args) {
        List<Integer> liest = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int sayi = (int) (Math.random() * 100 + 1);
            liest.add(sayi);
        }
        System.out.println(liest);
        //a
        System.out.println("   a  ");
        liest.stream().filter(p -> p % 2 == 1).forEach(p -> System.out.print(p + " "));

        //b esas cevap
        System.out.println("  \n b   ");
        liest.stream().forEach(Task01::tekseYazdir);
        // c filter icerisinde bir method cagiriyorsak bpplean return tipi olmak zorunda
        System.out.println("   \n c   ");
        liest.stream().filter(Task01::tekseYazdir2);
        //liest= liest.stream().filter(Task01::tekseYazdir2).toList();
        liest.stream().filter(Task01::tekseYazdir2).forEach(p -> System.out.print(p + " "));;
        System.out.println();

       // System.out.println(liest);
        System.out.println("  map  ");
        liest.stream().map(Task01::tekseYazdir2).forEach(p -> System.out.print(p + " "));;
        System.out.println("\n____________");
        liest.stream().filter(Task01::tekseYazdir2).map(p->p+1).forEach(p-> System.out.print(p+" "));





    }

    private static boolean tekseYazdir2(int p) {
        if (p % 2 == 1) {
           // System.out.print(p+" ");
            return true;
        } else return false;

    }

    private static void tekseYazdir(int p) {
        if (p % 2 == 1) System.out.print(p + " ");
    }

}
