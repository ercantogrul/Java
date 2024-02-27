package day13_ArrayList.DE13_ArrayList_ilk.Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task08_ortalamadanBuyukolanlar____ {
    public static void main(String[] args) {
        // Task-> Girilen sayıların içinde ortalamadan buyuk olanları print eden METHOD create ediniz.

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("kac elemanli bir Arraylist istiyorsunuz");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println(i + " . eleman");
            list.add(i, scan.nextInt());
        }
        System.out.println(list);

        ortalamadanBuyukolanlar(list, n);

    }

    private static void ortalamadanBuyukolanlar(ArrayList<Integer> list, int n) {
        int toplam = 0;

        for (int i = 0; i < list.size(); i++) {
            toplam += list.get(i);
        }
        System.out.println("toplam : " + toplam);
        int ortalama = toplam / n;
        System.out.println("ortalama : " + ortalama);

        List<Integer> yenilist = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > ortalama) {
                yenilist.add(list.get(i));
            }
        }
        System.out.println("ortalamadan buyuk olanlar : " + yenilist);

        //ikinci yöntem

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) <= ortalama) {
                list.remove(list.get(i));
                i--;
            }
        }System.out.println("ortalamadan buyuk olanlar : " + list);


    }


}
