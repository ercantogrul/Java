package asya_hoca_._ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S17_kelime_harf_uzunlugu {
    public static void main(String[] args) {
        //Kullanicidan bir cumle isteyin ve kelime sayisini yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir cümle olusturunuz");
        String str = scan.nextLine();

        String[] arr = str.split(" ");
        int uzunluk = arr.length;
        System.out.println(uzunluk);

        //2.yol====list======

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cumle giriniz : ");
        String str2 = scanner.nextLine();

        List<String> list = new ArrayList<>();
        list.addAll(List.of(str.split(" ")));
        System.out.println("kelime sayisi= " + list.size());


        // 2.yol her kelimedeki harf uzunlugu ===list

        List<String> list1 = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Bir cümle giriniz");
        String str1 = input.nextLine();

        list.addAll(List.of(str.split(" ")));

        System.out.println("list = " + list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + 1 + ".kelimenin uzunlugu : " + list.get(i).length());

        }
    }
}