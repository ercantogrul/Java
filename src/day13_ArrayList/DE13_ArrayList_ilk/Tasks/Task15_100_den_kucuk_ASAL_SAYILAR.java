package day13_ArrayList.DE13_ArrayList_ilk.Tasks;

import java.util.ArrayList;
import java.util.List;

public class Task15_100_den_kucuk_ASAL_SAYILAR {

    /* TASK :
    100 den kucuk asal sayilari print eden  code create ediniz.
     */
    public static void main(String[] args) {
        List<Integer> asalSayilar = new ArrayList<>();


        for (int i = 2; i < 100; i++) {
            int sayac =1;
            for (int j = 2; j< i; j++) {

                if (i % j == 0) {
                    sayac=0;
                    break;
                }
            }
            if (sayac==1){
                asalSayilar.add(i);
            }

        }
        System.out.println(asalSayilar);

    }
}
