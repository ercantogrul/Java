package day20_Constructor;

import java.util.ArrayList;
import java.util.Scanner;

public class C02_Constructor_Student {
    public static void main(String[] args) {
        ArrayList<Student> ogrler =new ArrayList<>();

        Student ogrenci = new Student("Ahmet","Kas","3S",4.45,778866,"var");
        ogrler.add(ogrenci);
        ogrenci = new Student("Hasan","Yas","3B",83.45,778867,"var");
        ogrler.add(ogrenci);
        ogrenci = new Student("Kamil","Yerli","4A",0,778867,"var");
        ogrler.add(ogrenci);

        for (int i = 0; i < ogrler.size(); i++) {
            System.out.println(ogrler.get(i));

        }




    }




}
