package asya_hoca_._ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class S02_enB_n_sayi {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i, scan.nextInt());
        }
        System.out.println(list);


        System.out.println(" n sayisi kadar maksimun  degerlerini bulan");
        int n = scan.nextInt();
        ArrayList<Integer> list2 = new ArrayList<>();  // dizinin en büyük n elemanini eklemek icin

        int count=0;
        while (count<0){
            int max =list.get(0);
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i)>max){
                    max=list.get(i);
                }

            }
            list2.add(max); // dizi
            System.out.println(list2);

        }





    }
}
