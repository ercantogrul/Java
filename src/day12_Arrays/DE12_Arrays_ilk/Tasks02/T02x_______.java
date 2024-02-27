package day12_Arrays.DE12_Arrays_ilk.Tasks02;

import java.util.Arrays;

public class T02x_______ {
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
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i; j < arr.length ; j++) {

            }
        }
        // 2.sıralama yöntemi (buble sort, kabarcık sıralama
        // {21, 27, 46, 79, 44, 2, 1, 80};
        // {21, 27, 46, 44, 2, 1, 79, 80};
        //

        //bubbelSort(arr);
        selectionsSort(arr);


    }

    private static void selectionsSort(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[i]<arr[i+1]) {
                    int temp = arr[i];
                    arr[i]=arr[j+1];
                    arr[i+1]=temp;
                }
            }System.out.println(Arrays.toString(arr));
        }

    }


    private static void bubbelSort(int[] dizi) {  // diziyi kücükten büyüge dogru siralar
        System.out.println(Arrays.toString(dizi));
        for (int j = 0; j < dizi.length; j++) {
            for (int i = 0; i < dizi.length-1; i++) {  // -j  yazarak her defasinda buyuk olanin indexini sorgulamaya gerek yoktur
                if (dizi[i]>dizi[i+1]) {
                    int temp = dizi[i];
                    dizi[i]=dizi[i+1];
                    dizi[i+1]=temp;
                }
            }
            System.out.println(Arrays.toString(dizi));
        } System.out.println(Arrays.toString(dizi));


    }


}
