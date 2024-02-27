package day12_Arrays.DE12_Arrays_ilk.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task03_dize2_3_4yerine3_4_2 {

    public static void main(String[] args) {
		
		 /*
       Task-> Verilen  bir arrayin tum elemanlarini
        bir sonraki konuma print eden code create ediniz
       input:  [1,2, 3]
        output [2, 3, 1]
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("kac elemanli bir dizi olusturmak istiyorsunuz?");
        int n = scan.nextInt();
        int[] array = new int[n];
        int toplam =0;

        for (int i = 0; i < array.length; i++) {
            System.out.println("dizinin elemanlarini giriniz");
            array[i] = scan.nextInt();

        }System.out.println(Arrays.toString(array)); //{2,3,4,5}

        method1(array);
        method2(array);


    }

    private static void method2(int[] array) {
        int [] yeniDizi = new int[array.length];

        for (int i = 1; i < array.length; i++) {
            yeniDizi[i-1] = array[i];

        }
        yeniDizi[array.length-1]=array[0];
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(yeniDizi));

    }

    private static void method1(int[] array) {
        int [] yeni = new int[array.length];
        System.out.println(Arrays.toString(yeni)); //{null,null,null,null}

        for (int i = 0; i < array.length ; i++) {
            if (i==array.length-1){
                yeni[i] =array[0];
            }else
                yeni [i] = array[i+1];
        }
        System.out.println(Arrays.toString(yeni));
    }

}
