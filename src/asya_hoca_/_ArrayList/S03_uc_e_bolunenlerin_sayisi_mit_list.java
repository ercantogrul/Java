package asya_hoca_._ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class S03_uc_e_bolunenlerin_sayisi_mit_list {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int sayac = 0;
        for (int i = 0; i < 8; i++) {
            list.add(i, scan.nextInt());
            if (list.get(i) % 3 == 0 && list.get(i) != 0) {
                sayac++;
            }
        }
        System.out.println(list);
        System.out.println(sayac);

        ikinciyontem(list);  // güzel bir yöntem


    }

    private static void ikinciyontem(ArrayList<Integer> list) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kac sayi girmek istiyorsunuz : ");
        int n = scanner.nextInt();
        list = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number : ");
            list.add(scanner.nextInt());
        }
        // List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 3 == 0 && list.get(i)!= 0) {
                count++;
            }else {
                list.remove(list.get(i));
                i--;// in dex azaldigi icin tekrar
            }
        }
        System.out.println("count = " + count);
        System.out.println("newList = " + list);
    }
}
