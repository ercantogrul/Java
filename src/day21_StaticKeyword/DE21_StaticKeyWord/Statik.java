package day21_StaticKeyword.DE21_StaticKeyWord;
/*
       => Class'in icinde methodlarin disinda olusturulan variable'lara "instance variable" denir.
       => Class'in icinde methodlarin disinda olusturulan static variable'lara "Class variable" denir.
       => Instance variable'lar gibi Class variable(Static variable)'lar initial edilmezse(ilk değere ataması) default value ataması yapılır
       => Static variable'lar call etmek  icin object olusturmaya gerek yoktur.
       => Bulunduğu  class icinden static yapılara  ulasilabilir.Farklı class'lardan ClassName.staticYapı class name ile call edilir.
            farklı class'da obj name ile değl class name ile call edilir.
       => Instance variable(Object Variable)'lar call etmek icin object create edilmesi zorunludur.Object olusturmadan
          instance variable'a ulasilamaz.
       => Static variable'lara object ile call edilebilir ama tavsiye edilmez.
       => Eger static variable'lara object ile call edilirse Java  sari alt cizgi ikaz eder->.BAD PRACTICE
       =>  static keyword hafıza opt. için kullanılır ve memory'de 1 kez oluşturulur

            bir obj static variable değeri değişirse tüm obj variable değeri değişir
            static obj den bağımsızdır class'a bağımlı Class'ın malıdır.

            Trick-> bir variable, methoda doğrudan calss name ile obj olmadan call etmek için static olmalıdır..
   */

public class Statik {
    int sayi; // instant varaiable
    static int sayi2; // class variable
    final static int haftaninGunu=7; // sabit hiç değişmez
    static { // static block
        System.out.println("bu bir static blocktur");
    }

    public static void main(String[] args) {

        Statik veri1 = new Statik();
        Statik veri2 = new Statik();

        veri1.sayi  = 11;

        veri2.sayi  = 210;
        veri1.sayi2 = 12;
        System.out.println(veri2.sayi2);
        veri2.sayi2 = 220;
        System.out.println("dogrudan yazdıralım "+sayi2);



        System.out.println(veri1.sayi+" "+ veri2.sayi);
        System.out.println(veri1.sayi2+" "+ veri2.sayi2);

      // anaMetot();


    }
    private static void anaMetot(){
        Statik veri1 = new Statik();
        Statik veri2 = new Statik();

        veri1.sayi = 10;
        Arac.stModel="ljffjkl";

        mtt();
        System.out.println(sayi2);
        veri2.sayi = 210;
        System.out.println("veri1.sayi = " + veri1.sayi);
        System.out.println("veri2.sayi = " + veri2.sayi);
        veri1.mtt2();
    }

    private static void mtt(){
        System.out.println(sayi2);
        sayi2++;
    }
    private void mtt2(){
        System.out.println("non static");
        Statik veri1 = new Statik();



    }

}
