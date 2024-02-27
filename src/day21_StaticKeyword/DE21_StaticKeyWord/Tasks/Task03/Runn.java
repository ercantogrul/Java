package day21_StaticKeyword.DE21_StaticKeyWord.Tasks.Task03;

import java.util.ArrayList;
import java.util.Scanner;

public class Runn {
    /*
      Task 03 ->
      Lesson Class :  fields : name, credit (1-10 arasında değer almalı)
      Student Class : fields : name, maxCredit, dersleri(Lesson class obj) saklayacak list
                     derslerin toplam kredi miktarını return eden  toplamKredisi method
      Runner Class :  3 adet  ders ve 1 adet öğrc (maxCredit=10) obj create ederek öğrencinin alabileceği ve
                         alamayacagı dersleri print eden code create ediniz

       */
    public static void main(String[] args) {

        Lesson matematik = new Lesson();
        matematik.lessonName = "Matematik";
        matematik.lessonCredit = 3;
        Lesson fizik = new Lesson("Fizik", 13);
        Lesson turkce = new Lesson("Turkce", 2);
        Lesson java = new Lesson("Java", 3);
        Lesson kimya = new Lesson("Kimya", 2);
        Lesson tarih = new Lesson("Tarih", 1);

        ArrayList<Lesson> lessons = new ArrayList<>();
        lessons.add(matematik);
        lessons.add(fizik);
        lessons.add(turkce);
        lessons.add(java);
        lessons.add(kimya);
        lessons.add(tarih);

        Ogrenciler ogrenci =new Ogrenciler();
        System.out.println("ogrenci.adSoyad = " + ogrenci.adSoyad);

        Student ogrenci1 = new Student("Hasan Ayan", 10);
        Student ogrenci2 = new Student("Ali Tas", 10);
        Student ogrenci3 = new Student("Ahmet Uz", 10);
        Student ogrenci4 = new Student("Mehmet Kara", 10);
        Student ogrenci5 = new Student("Beyza Ay", 10);
        Student ogrenci6 = new Student("Filiz Akin", 10);

        ArrayList<Student> ogrencilers = new ArrayList<>();
        ogrencilers.add(ogrenci1);
        ogrencilers.add(ogrenci2);
        ogrencilers.add(ogrenci3);
        ogrencilers.add(ogrenci4);
        ogrencilers.add(ogrenci5);
        ogrencilers.add(ogrenci6);
        System.out.println(ogrencilers);

        for (int j = 0; j < ogrencilers.size(); j++) {

            for (int i = 0; i < lessons.size(); i++) {
                int mevcutKredi = ogrencilers.get(j).toplamKredisi();

                if (mevcutKredi + lessons.get(i).lessonCredit <= ogrencilers.get(j).maxCredit) {
                    Scanner scan = new Scanner(System.in);
                    System.out.println("\n" + ogrencilers.get(j).adSoyad+"  "+ lessons.get(i).lessonName +" dersini almak istiyormusunuz  : ");
                    String secim = scan.next().toLowerCase();
                    if (secim.substring(0, 1).equals("e")) {
                        ogrencilers.get(j).dersListesi.add(lessons.get(i));
                        System.out.println(lessons.get(i).lessonName + " dersini sectiniz");
                    } else {
                        System.out.println(lessons.get(i).lessonName + " dersini secemediniz");
                    }
                }
            }
            // System.out.println(ogrencilers.get(j));
        }
        System.out.println(ogrencilers);






    }


}
