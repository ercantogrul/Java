package day12_Arrays.DE12_Arrays.Tasks02;

import java.util.Arrays;

public class T02x {
    public static void main(String[] args) {
        int[] arr = {21, 12, 46, 79, 44, 2, 1, 8};
        // Arrays.sort kullanmadan diziyi sıralayınız
        // selection sort , seçmli sıralama
        // int[] arr3 = {21, 27, 46, 79, 44, 2, 1, 80};
        // int[] arr3 = {1, 27, 46, 79, 44, 2, 21, 80};
        // int[] arr3 = {1, 2, 46, 79, 44, 27, 21, 80};
        // int[] arr3 = {1, 2, 21, 27, 44, 79, 46, 80};
        // int[] arr3 = {1, 2, 21, 27, 44, 79, 46, 80};
        // int[] arr3 = {1, 2, 21, 27, 44, 46, 79, 80};

        // 2.sıralama yöntemi (buble sort, kabarcık sıralama
        // {21, 27, 46, 79, 44, 2, 1, 80};
        // {21, 27, 46, 44, 2, 1, 79, 80};
        //
        bubbleSort(arr);
        selectionSort(arr);

    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i; j < arr.length ; j++) {

            }
            // en kucuk ile i. eleman değişecek
        }
    }

    private static void bubbleSort(int[] dizi) { // diziyi küçükten büyüğe sıralıyoruz
        System.out.println(Arrays.toString(dizi));
        for (int j = 0; j < dizi.length ; j++) {
            for (int i = 0; i < dizi.length-1-j ; i++) {
                if (dizi[i]>dizi[i+1] ) {
                    int temp = dizi[i];
                    dizi[i]  = dizi[i+1];
                    dizi[i+1]= temp;
                }
            }
            System.out.println(Arrays.toString(dizi));
        }

       
    }


}
