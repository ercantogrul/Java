package day25_Inheritance.DE25_InHeritance.Task01_rasit_hoca;

public class Runner {//step 5

    public static void main(String[] args) {
        Baba baba1 = new Baba();
        baba1.isim="Rasit";
        baba1.yas=40;
        baba1.yuzme();

        System.out.println("baba1 = " + baba1);
        baba1.setTc("54321");
        System.out.println("baba1 = " + baba1);


        Cocuk cocuk1 = new Cocuk();
        cocuk1.isim="Salih";
        Cocuk cocuk2 = new Cocuk();
        cocuk2.isim="Suat";
        Cocuk cocuk3 = new Cocuk();
        cocuk3.isim="Ayse";

        baba1.list.add(cocuk1);
        baba1.list.add(cocuk2);
        baba1.list.add(cocuk3);

        for (Cocuk eleman: baba1.list) {
            System.out.println(eleman);
            System.out.println();
        }


    }
}
