package day20_Constructor;

import java.util.ArrayList;
import java.util.Scanner;

public class C01_Constructor__Person {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Person kisi;
        ArrayList<Person> kisiler = new ArrayList<>();
        String cevap;

        do {
            kisi = new Person();
            kisi = veriOkuma();
            kisiler.add(kisi);
            System.out.println("devam mi?");
            cevap=scan.next().toLowerCase().substring(0,1);
        } while (cevap.equals("e"));

        for (int i = 0; i < kisiler.size(); i++) {
            kisi = new Person();
            kisi = kisiler.get(i);
            System.out.println(kisi.isim+" "+kisi.sehir+" "+kisi.yas);
            System.out.println(kisiler.get(i).isim+" "+kisiler.get(i).sehir+" "+ kisiler.get(i).yas); //iki print de ayni isi yapar

        }



    }

    private static Person veriOkuma() {

        Person pers = new Person();
        Scanner scanner = new Scanner(System.in);
        System.out.print("İsmi giriniz : ");pers.isim = scanner.next();
        System.out.print("Şehir giriniz: ");pers.sehir = scanner.next();
        System.out.print("Yaşı giriniz : ");pers.yas = scanner.nextInt();

        return pers;

    }
}
