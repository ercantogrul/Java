package day35_Lambda.Task;

import java.util.ArrayList;
import java.util.List;

public class Task00 {/*
/* Rastgele 20 Integer(1 den 100 e kadar) elemandan oluşan bir List yapın
    a) Bu list in (stream kullanarak) tek basamaklı elemanlarını yazdırın
    b) Bu list in (stream kullanarak) tek basamaklı elemanlarını yazdırın (filter içinde motot kullanın)


     */

    public static void main(String[] args) {
        List<Integer> liest = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int sayi = (int) (Math.random() * 100 + 1);
            liest.add(sayi);
        }
        System.out.println(liest);

        System.out.println("____a______");
        liest.stream().filter(p->p<10).forEach(p-> System.out.print(p+" "));
        System.out.println();
        System.out.println("_______b______");
        liest.stream().filter(Task00::RakamlariAl).forEach(p-> System.out.print(p+" "));
    }

    private static boolean RakamlariAl(Integer p) {
        if (p<10)return true;
        else return false;
    }
}
