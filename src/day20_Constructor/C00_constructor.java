package day20_Constructor;

import java.util.Scanner;

public class C00_constructor {
    public static void main(String[] args) {

        Person kisi = new Person();

        kisi.isim="hasan";
        kisi.sehir="hatay";
        kisi.yas=45;
        System.out.println(kisi.isim+" "+kisi.sehir+" "+kisi.yas);

        kisi=new Person();
        kisi =veriOkuma();
        System.out.println(kisi.isim+" "+kisi.sehir+" "+kisi.yas);



    }

    private static Person veriOkuma() {

        Person pers = new Person();
        Scanner scanner = new Scanner(System.in);
        System.out.print("İsmi giriniz : "); pers.isim  = scanner.next();
        System.out.print("Şehir giriniz: "); pers.sehir = scanner.next();
        System.out.print("Yaşı giriniz : "); pers.yas   = scanner.nextInt();

        return pers;

    }
}
