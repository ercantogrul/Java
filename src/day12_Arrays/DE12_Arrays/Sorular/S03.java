package day12_Arrays.DE12_Arrays.Sorular;

import java.util.Arrays;
import java.util.Scanner;


public class S03 {
    public static void main(String[] args) {
        /* Soru - 1 : 10 elemanlı bir int list dizisi oluşturun ve içerisini
        1 ila 100 arasında rastgele sayılarla doldururun ve diziyi yazdırın
         */
        int[] list = new int[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = (int) (Math.random() * 100 + 1);
        }
        System.out.println(Arrays.toString(list));
//        Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i < list.length ; i++) {
//           list[i] = scanner.nextInt();
//        }
        // Soru 2 - list dizsinin en büyük elemanını bulunuz
        int enB = list[0];
        for (int i = 0; i < list.length; i++) {
            if (list[i] > enB) enB = list[i];
            //     enB = Math.max(enB,list[i]); üsteki satır yerine bu da olur
        }
        System.out.println("enB = " + enB);
        // Soru 3 - list dizsinin en büyük elemanının yerini  bulunuz
        // yani kaçıncı sırada olduğunu, yani index ini
        enB = list[0];
        int enBidx = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] > enB) {
                enB = list[i];
                enBidx = i;
            }
        }
        System.out.println(enBidx);
        // soru 4 : bu bulunduğunuz en büyük eleman ile 0. elemanı yer değiştiriniz
        int temp = list[0];
        list[0]  = list[enBidx];
        list[enBidx] = temp;
    }
}
