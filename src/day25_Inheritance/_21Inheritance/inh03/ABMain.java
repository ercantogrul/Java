package day25_Inheritance._21Inheritance.inh03;

public class ABMain {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("a olusturdugunda = " + A.mesaj);

        B b = new B();
        System.out.println("b olusturdugunda = " + B.mesaj);

        System.out.println("b den sonra a nin durumu = " + A.mesaj);

        /*  Static degiskenkerin oldugu classlardan olusturulan subclasslardan
        static degiskenin degeri degistirildiginde süper classdaki deger de degisir.
        cunku static degiskenler hafizada tek bir deger gosterir. */
    }
}
