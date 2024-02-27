package day07_StringManuplation.DE07_StringManuplation_ilk.tasks03;

import java.util.ArrayList;
import java.util.Scanner;

public class Task03_05 {
    public static void main(String[] args) {

        var a = 12;
        System.out.println(a);
        var sb = new StringBuilder().repeat("a1",20);
        System.out.println(sb);
        ArrayList<Integer> liste = new ArrayList<>();
        liste.add(1);
        System.out.println(liste);

        // verilen String teki tüm boşlukları , regex kullanarak yıldıza çeviriniz


        Scanner scan = new Scanner(System.in);
        System.out.println("bir veri giriniz: ");
        String str1 = scan.nextLine();
        System.out.println(str1.replaceAll(" ","*"));






    }
}
