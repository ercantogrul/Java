package asya_hoca_._ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class S02__ {
    public static void main(String[] args) {
        /*
         * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
         * not kisa metodlar kullamayiniz
         * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
         */

        ArrayList<Integer> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int sayac = 0;

        for (int i = 0; i < 8; i++) {
            System.out.println("list in " + i + " .elemani");
            list.add(i, scan.nextInt());

        }
        System.out.println(list);

        System.out.println(" n sayisi kadar maksimun  degerlerini bulan");
        int n = scan.nextInt();
        int enB = 0;

        for (int i = 0; i < n; i++) {
            enB = 0;
            for (int j = 0; j < list.size(); j++) {

                if (list.get(j) > enB) enB = list.get(j);

            }
            System.out.println("en büyük "+n+ " adet sayi"+enB);
            list.remove(list.indexOf(enB));


        }



    }
}
