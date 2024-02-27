package z_calismalar.ch01_JavaIntro.soru_104;

import java.time.LocalDate;

public class B extends A {
    public void test(){
        System.out.println("B ");;
    }

    public static void main(String[] args) {
        Base b1 = new B();
        Base b2 =  new A();
        Base b3 = new B();
        Base b4 = b3;
        b1 = (Base)b2;
        b1.test();
        b4.test();


    }
}
