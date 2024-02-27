package day20_Constructor.DE20_Constructor_ilk;

import java.util.ArrayList;

public class Stu {
    public static void main(String[] args) {
        // altta ogrenci variable (obje sine) ina verileri attık
        ArrayList<Student> ogrler = new ArrayList<>();
        Student ogrenci = new Student("Ahmet","Kaş","3S",3.45,778866,"var");
        ogrler.add(ogrenci);
        ogrenci = new Student("Hasan","Yaş","3B",83.45,778867,"var");
        ogrler.add(ogrenci);
        ogrenci = new Student("Kamil","Yerli","3B",0,778860,"var");
        // yasin beyin sorusu boyle olabilir
        int ortalama=80;
        ogrenci = new Student(ogrenci.ad, ogrenci.soyad, ogrenci.sinif,ortalama,ogrenci.okulNo,ogrenci.sosyalFaaliyet);
        ogrler.add(ogrenci);
        //veya
        ogrenci = new Student("Faruk","Yaman","3B",0,778820,"");
        ogrenci.ortalama=55;
        ogrenci = new Student(ogrenci);
        ogrler.add(ogrenci);
        // şeklinde olabilir (bunun için ek bir constractor yazmam gerekti.)
        for (int i = 0; i <ogrler.size() ; i++) {
            System.out.println(ogrler.get(i));
        }


    }
}
