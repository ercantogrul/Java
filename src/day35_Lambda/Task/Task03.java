package day35_Lambda.Task;

import java.util.ArrayList;
import java.util.List;

public class Task03 {
    /* Rastgele 20 Integer(1 den 100 e kadar) elemandan oluşan bir List yapın
  stream yardım ile
 a) Bu list in tek elemanlarını, 2 ile çarpın, çift elemalarını ise 2 ye bölün
 b) aynısını stream içerisinde metot kullanarak yapın

   */
    public static void main(String[] args) {

        List<Integer> liest = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int sayi = (int) (Math.random() * 100 + 1);
            liest.add(sayi);
        }
        System.out.println(liest);

        System.out.println("\ntek olanlar iki ile carpildi, cift olanlar 2 ye bölündü tek satirda");
        liest.stream().map(p->p%2==1? (p*2):(p/2)).forEach(p-> System.out.print(p+" "));
        System.out.println("___________");
        liest.stream().map(Task03::tekCift).forEach(p-> System.out.print(p+" "));
        System.out.println("================");



        //=========================tek tek  tercih edilmeyen yöntem==============================
        liest.stream().filter(p->p%2==1).forEach(p-> System.out.print((p*2)+" "));
        System.out.println( "\ncift olanlar ikiye bölundu");
        liest.stream().filter(p->p%2==0).forEach(p-> System.out.print((p/2)+" "));
        //veya
        System.out.println("\nmethod ile tek olanlar iki ile carpildi");
        liest.stream().filter(p->p%2==1).map(p->p*2).forEach(p-> System.out.print((p)+" "));
        System.out.println("\nmethod ile cift olanlar ikiye bölündü");
        liest.stream().filter(p->p%2==0).map(p->p/2).forEach(p-> System.out.print((p)+" "));

        //method ile
        System.out.println();
        liest.stream().filter(Task03::tekElemanlariIkiilecarp).forEach(p-> System.out.print(p*2+" "));
        System.out.println();
        liest.stream().filter(Task03::tekElemanlariIkiilecarp).map(p->p*2).forEach(p-> System.out.print(p+" "));


    }

    private static Object tekCift(Integer p) {
        return p%2==1? (p*2):(p/2);
    }

    private static boolean tekElemanlariIkiilecarp(Integer p) {
        if (p%2==1)return true;
        else return false;

    }
}
