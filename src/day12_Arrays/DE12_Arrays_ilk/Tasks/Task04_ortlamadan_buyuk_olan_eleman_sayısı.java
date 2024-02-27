package day12_Arrays.DE12_Arrays_ilk.Tasks;

import java.util.Scanner;

public class Task04_ortlamadan_buyuk_olan_eleman_sayısı {
    public static void main(String[] args) {
        // task-> girilen bir int array elamanlarından  ortlamadan buyuk olan eleman sayısını print eden code create ediniz

        Scanner scan = new Scanner(System.in);
        System.out.println("kac elemanli bir dizi olusturmak istiyorsunuz?");
        int n = scan.nextInt();
        int[] array = new int[n];
        int toplam = 0;
        int ortalama = 0;

        for (int i = 0; i < n; i++) {
            System.out.println(i + ". elemani giriniz");
            array[i] = scan.nextInt();
            toplam += array[i];
            ortalama = toplam / n;

        }
        System.out.println("ortalama : "+ ortalama);

        ortlamadanbuyukolanelemansayisi(array,ortalama);

    }

    private static void ortlamadanbuyukolanelemansayisi(int[] array, int ortalama) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > ortalama) {
                counter++;
            }
        }System.out.println("ortlamadan buyuk olan eleman sayısı " + counter);

    }


}
