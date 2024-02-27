package day12_Arrays.DE12_Arrays_ilk.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task12_Karelerini_yazdirma {

    public static void main(String[] args) {
		/* TASK :
        given an int array and find the squares of the elements
        (Verilen bir int dizisi icin elemanlarin karelerini print eden code create ediniz.)
        Example:{2,6,4,5,8,9}
        output:{4,36,16,25,64,81}
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("6 elemanli bir dizi olusturun");

        int[] array = new int[6];
        for (int i = 0; i < array.length; i++) {
            System.out.println(i+" . elemani giriniz");
            array[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(array)); // {2,6,4,5,8,9}

        dizininKareleri(array);
        dizininKareleri2(array);


    }



    private static void dizininKareleri(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i]= (int) Math.pow(array[i],2);

        }
        System.out.println("dizi elemanlarinin karesi : "+Arrays.toString(array));
    }
    private static void dizininKareleri2(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i]= array[i]*array[i];

        }
        System.out.println("dizi elemanlarinin karesi : "+Arrays.toString(array));
    }
}
