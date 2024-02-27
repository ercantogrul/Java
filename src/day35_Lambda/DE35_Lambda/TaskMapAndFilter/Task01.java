package day35_Lambda.DE35_Lambda.TaskMapAndFilter;

import java.util.ArrayList;
import java.util.List;

public class Task01 {
    /* Rastgele 20 Integer(1 den 100 e kadar) elemandan oluşan bir List yapın
    a) Bu list in (stream kullanarak) tek basamaklı elemanlarını yazdırın
    b) Bu list in (stream kullanarak) tek basamaklı elemanlarını yazdırın (filter içinde motot kullanın)


     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int sayi = (int) (Math.random() * 100 + 1);
            list.add(sayi);
        }
        System.out.println(list);
        // a)
        list.stream().filter(p->p<10).forEach(p-> System.out.print(p+" "));
        System.out.println();
        list.stream().filter(Task01::rakamlariAL).forEach(p-> System.out.print(p+" "));


    }

    private static boolean rakamlariAL(Integer p) {
        return p < 10;

    }


}
