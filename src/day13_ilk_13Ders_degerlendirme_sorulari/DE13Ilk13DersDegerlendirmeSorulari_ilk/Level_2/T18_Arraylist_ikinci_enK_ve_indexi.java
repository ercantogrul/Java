package day13_ilk_13Ders_degerlendirme_sorulari.DE13Ilk13DersDegerlendirmeSorulari_ilk.Level_2;

import java.util.ArrayList;
import java.util.Scanner;

public class T18_Arraylist_ikinci_enK_ve_indexi {
    /* rastgele 20 elemanlı  bir ArrayList üretin  (sayılar 1 ila 100 arasında olsun)
    bu arrayList in  en küçük 2.elemanını ve kaçıncı sırada olduğunu bulunuz

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("20 elemanli bir arraylist olusturun");

        ArrayList<Integer> list =new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add((int) (Math.random()*100+1));
        }
        System.out.println("ilk list: " + list);


        enKikinciElemanVebyeri(list);

    }

    private static void enKikinciElemanVebyeri(ArrayList<Integer> list) {
        int enK = Integer.MAX_VALUE;
        int ikincienK_Sayi = Integer.MAX_VALUE-1;
        int enKikinciidx = 0;
        int enKidx = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < enK) {
                enK = list.get(i);
                enKidx=i;
            }
        }
        System.out.println("enK sayi : "+ enK);


        for (int i = 0; i < list.size(); i++) {
            if (!(list.get(i) == enK) && list.get(i)<ikincienK_Sayi) {
                ikincienK_Sayi = list.get(i);
                enKikinciidx=i;
            }
        }
        System.out.println("ikincienK_Sayi : "+ ikincienK_Sayi);
        System.out.println("enKikinciidx : "+ enKikinciidx);






    }
}
