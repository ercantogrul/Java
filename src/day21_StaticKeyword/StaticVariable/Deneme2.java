package day21_StaticKeyword.StaticVariable;

public class Deneme2 {
    static  int sayi=20;
    int yas = 40;

    public Deneme2() {
        sayi++;
        yas++;
    }
    public static int method1 () {
        return sayi;
    }
    public  int method2 () {
        return yas;
    }

    public static void main(String[] args) {
        Deneme2 obj1= new Deneme2(); //41 21
        Deneme2 obj2= new Deneme2(); //41 22
        Deneme2 obj3= new Deneme2(); //41 23

        System.out.println(obj3.yas+" "+obj3.sayi);


    }
}
