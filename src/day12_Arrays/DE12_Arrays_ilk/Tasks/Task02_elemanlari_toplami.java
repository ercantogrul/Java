package day12_Arrays.DE12_Arrays_ilk.Tasks;

import java.util.Scanner;

public class Task02_elemanlari_toplami {
    public static void main(String[] args) {
        //task-> girilen int array elemanları toplamını print eden code create ediniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("kac elemanli bir dizi olusturmak istiyorsunuz?");
        int n = scan.nextInt();
        int[] array = new int[n];
        int toplam =0;

        for (int i = 0; i < array.length; i++) {
            System.out.println(i+ ". elemani giriniz");
            array[i] = scan.nextInt();

            toplam +=array[i];

        }
        System.out.println(toplam);


    }
}
