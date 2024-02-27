package day35_Lambda.DE35_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class C04_mapToInt_sum_max_min {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList
                (11, 12, 7, 32,7 ,32, 41, 41, 32, 68, 41, 12, 7, 41, 43, 68, 32));
 //       list.stream().mapToInt(p->p*2).forEach(p-> System.out.print(p+" "));

        int toplam = list.stream().mapToInt(p->p).sum();
    //    System.out.println(toplam);
        long t = System.currentTimeMillis();
        for (int i = 0; i <100000000 ; i++) {
            int sayi = (int) (Math.random()*1000000);
            list.add(sayi);
        }
     //   int enBuyuk = list.stream().mapToInt(p->p).max().stream().sum();
        long t1 = System.currentTimeMillis();
        //int enBuyuk = list.stream().mapToInt(p->p).max().getAsInt();
        int enBuyuk=0;
        for (int i = 0; i < list.size() ; i++) {
            if (list.get(i)>enBuyuk) enBuyuk= list.get(i);
        }


        long t2 = System.currentTimeMillis();
        System.out.println("uretim süresi = "+(t1-t));
        System.out.println("en buyuk bulma suresi= "+(t2-t1));
        OptionalInt opInt = list.stream().mapToInt(p->p).max();

        System.out.println(enBuyuk); // en buyuk elemanı verir


    }
}
