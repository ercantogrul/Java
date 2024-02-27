package day20_Constructor.DE20_Constructor;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class C01_Constructor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person kisi;
        ArrayList<Person> kisiler = new ArrayList<>();
        String cevap;
        do {

            Person sahis = veriOkuma();
            kisiler.add(sahis);
            System.out.print("devam mı?");
            cevap= scanner.next().toLowerCase().substring(0,1);
        } while (cevap.equals("e"));

        for (int i = 0; i <kisiler.size() ; i++) {
            kisi = new Person();
            kisi = kisiler.get(i);
          //  String isim = kisiler.get(i).isim;
//            System.out.println(kisi.isim+" "+kisi.sehir+" " +kisi.yas);
//            System.out.println(kisiler.get(i).isim+" "+kisiler.get(i).sehir+" " +kisiler.get(i).yas);
            System.out.println(kisi.toString());
            System.out.println(kisiler.get(i).toString());
            // her iki print satırı aynı işi yapar
        }

    }

    private static Person veriOkuma() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("İsmi giriniz : "); String isim  = scanner.next();
        System.out.print("Şehir giriniz: "); String sehir = scanner.next();
        System.out.print("Yaşı giriniz : "); int yas   = scanner.nextInt();
        Person pers = new Person(isim, yas, sehir);
        return pers;
    }
}
