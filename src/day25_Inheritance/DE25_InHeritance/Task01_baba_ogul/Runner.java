package day25_Inheritance.DE25_InHeritance.Task01_baba_ogul;

import java.util.Arrays;

public class Runner {//step 5

    public static void main(String[] args) {
        Baba baba1 = new Baba();//
        baba1.isim = "Metin";
        baba1.yas = 45;
        baba1.yuzme();
        System.out.println(baba1);
        Baba.Vatandas = "Almanya";
        baba1.babaminTc();
        baba1.babaminTcGuncelle("23456");
        System.out.println(baba1);
        System.out.println("===================");

        Cocuk cocuk1 = new Cocuk("Leyla");
        cocuk1.isim = "Asya";
        cocuk1.yas = 12;
        cocuk1.yuzme();//babadan miras
        cocuk1.minecraft();// kendine ait
        cocuk1.getTc();// getter ile babanın Tc'sinin ilk 4 hanesine ulaşırız
        System.out.println(cocuk1);
        System.out.println("cocuk1.babaminTc() = " + cocuk1.babaminTc());

        Cocuk cocuk2 =new Cocuk("Hasan");
        Cocuk cocuk3 =new Cocuk("Ayse");




    }
}
