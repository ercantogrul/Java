package asya_hoca_.Array.Array_toplu;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAvg {
    public static void main(String[] args) {
        /*
         * write a java program that calculates the average value of array elements
         * Print elements that are greater than avarage
         * (dizi elemanlarinin ortalama degerini hesaplayan ve
         * ortalamadan buyuk olan elemanlari yazdıran bir java programi yazin)
         * input[]= {1,2,3,4,5,6,7}
         * Output1 : 4
         * Output2 : 5,6,7
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Kaç elemanlı dizi oluşturulacak:");
        int n=scanner.nextInt();//dizinin eleman sayısı

        int[] arr=new int[n];


        for (int i = 0; i < arr.length; i++) {//arr.fori
            System.out.println("Dizinin elemanlarını giriniz:");
            arr[i]=scanner.nextInt();//Kullanıcıdan sıra ile elemenlar alınır
        }

        System.out.println(Arrays.toString(arr));

        average(arr);//5,
        bigger(arr,average(arr));



    }

    private static void bigger(int[] arr, int ort) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>ort){//dizinin elemanları ile ortalamayı karşılaştırır
                System.out.println(arr[i]+",");
            }
        }

    }

    private static int average(int[] arr) {//return type int ortalamayı döndürür
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];//diizinin tüm elemanları toplama
        }
        return sum/ arr.length;//dizinin ortalamasını aldık //

    }


}
