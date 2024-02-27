package day21_StaticKeyword;

public class Static {
    int sayi; // instant variable
    static int sayi2; // class variable // tek veri alir
    // static class lar günes gibidir her yerden görülebilir ve her yerde kullanilabilir
    final static int haftaninGunu=7; // sabit hic degismez

    static {  //static block __aslinda bir method dur
        System.out.println("bu bir static blocktur");
    }

    public static void main(String[] args) {

        //static veriyi dogrudan cagirabiliriz,
        // int veriyi bir obje ile cagirdim
        Static veri1 = new Static();
        Static veri2 = new Static();
        veri1.sayi = 10;
        veri2.sayi = 210;


        sayi2 = 22;
        mtt();  // static method direk cegrilabilir
        System.out.println(sayi2);

        System.out.println("veri1.sayi = " + veri1.sayi);
        System.out.println("veri2.sayi = " + veri2.sayi);

        veri1.mtt2(); // static olmayan mtt2 yi Constructor obje ile cagrilir. direk cagrilamazlar
        // veri1 ve veri2 Constructor objelerin atandigi variable lardir


        //==önemli bir konu sorularda cikiyor=====================
        veri1.sayi =11;
        veri2.sayi =210;

        veri1.sayi2 =12;
        veri2.sayi2 =220;
        System.out.println(veri1.sayi+" "+ veri2.sayi);  //11 210
        System.out.println(veri1.sayi2+" "+ veri2.sayi2);  //220 220
        //static class variable tek veri alir dolayisiyla en son verilen 220 ikisindede görülür

        System.out.println("son: "+sayi2);





    }

    private static void mtt() {
        System.out.println(sayi2);
        sayi2++; // static int sayi2; her yerden cagrilabilinir
        //int sayi; burada cagrilamaz

    }
    private void mtt2(){
        System.out.println("non static");
        sayi2++; //// static int sayi2; her yerden cagrilabilinir
        sayi++;

    }
}
