package day12_Arrays.DE12_Arrays_ilk.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task09_girisSirasina_gore_tersten_yazdir___ {
    public static void main(String[] args) {
        // Task -> Girilen 5 sayıyı , giriş sırasına göre tersten print eden code create ediniz
        Scanner scan = new Scanner(System.in);
        System.out.println("5 elemanli bir dizi olusturun");

        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.println(i+" . elemani giriniz");
            array[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(array));

        girisSirasina_gore_tersten(array);
        girisSirasina_gore_tersten3(array);

    }

    private static void girisSirasina_gore_tersten3(int[] array) {
        int[] arr2 = new int[array.length];//İkinci dizinin boş hali
        int j=0;//arr2 dizi için index
        for (int i = array.length-1; i >= 0; i--,j++) {
            arr2[j]=array[i];// 6 ilk karakter
        }
        System.out.println(Arrays.toString(arr2));//Dizinin ikinci hali
    }


    private static void girisSirasina_gore_tersten(int[] array) {
        int [] yeni = new int[5];
        for (int i = 0; i < array.length ; i++) {
            yeni[i] = array [(array.length-1)-i];

        } System.out.println("new Array : "+Arrays.toString(yeni));
    }
}
