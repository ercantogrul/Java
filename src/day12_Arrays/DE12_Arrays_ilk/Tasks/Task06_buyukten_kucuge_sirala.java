package day12_Arrays.DE12_Arrays_ilk.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task06_buyukten_kucuge_sirala {
    public static void main(String[] args) {
        // Task-> verilen bir int arrayi elemanlarını buyukten kucuge siralayip return eden METHOD create ediniz

        Scanner scan = new Scanner(System.in);
        System.out.println("olusturmak istediginiz int dize eleman sayisini giriniz ");
        int n = scan.nextInt();
        int [] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.println(i+ ". eleman");
            array[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);

        buyuktenKucuge (array);
        buyuktenKucuge2 (array);
    }

    private static void buyuktenKucuge2(int[] array) {
        int [] yeniArray = new int[array.length];
        int n = array.length;
        for (int i = n - 1, j = 0; i >= 0 ; i--, j++) {
            yeniArray[j] = array[i];

        } System.out.print("Yeni Array = "+Arrays.toString(yeniArray));
    }

    private static void buyuktenKucuge(int[] array) {
        int [] yeni = new int[array.length];
        int n = array.length;
        for (int i = 0; i <n ; i++) {
            yeni[i] = array[(array.length-1)-i];

        }
        System.out.println("yeni array :"+ Arrays.toString(yeni));

    }





}
