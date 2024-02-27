package day35_Lambda.DE35_Lambda.TaskMapAndFilter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task02 {
    /* Rastgele 20 Integer(1 den 100 e kadar) elemandan oluşan bir List yapın
    stream yardım ile
   a) Bu list in tek elemanlarına, 1 ekleyin, çift elemalarını ise kaldırın (silin)
   b) aynısını stream içerisinde metot kullanarak yapın

     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <20 ; i++) {
            int sayi = (int) (Math.random()*100+1);
            list.add(sayi);
        }
        /*
        Random rnd = new Random();
        int sayi = rnd.nextInt(1,10);
        */

        System.out.println(list);
        list.stream().filter(p->p%2==1).map(p->p+1).forEach(p-> System.out.print(p+" "));
        System.out.println();
        list.stream().filter(Task02::ciftSil).map(Task02::birEkle).forEach(p-> System.out.print(p+" "));


    }

    private static int birEkle(Integer integer) {
        return integer+1;
    }

    private static boolean ciftSil(Integer integer) {
        return integer%2==1;
    }
}
