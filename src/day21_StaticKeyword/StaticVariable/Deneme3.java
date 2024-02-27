package day21_StaticKeyword.StaticVariable;

public class Deneme3 {
    static  int sayi=20;
    int yas = 40;

    public Deneme3() {
        sayi++;
        yas=10;
    }
    public static int method1 () {
        return 2*sayi;
    }

    public static void main(String[] args) {
        Deneme3 obj1= new Deneme3();
        Deneme3 obj2= new Deneme3();
        int sonuc= obj2.method1();

        System.out.println(obj2.yas+" "+obj2.sayi+" "+sonuc);  //10 22 44


    }
}
