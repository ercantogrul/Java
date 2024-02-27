package day35_Lambda.DE35_Lambda;

import java.awt.*;
import java.util.List;

@FunctionalInterface
interface Iaa{
    void metot();

}
@FunctionalInterface
interface Iaa2{
    void metot2(int a);

}
@FunctionalInterface
interface Iaa3{
    int metot3(int a);

}
public class C01_Lamda {
    public static void main(String[] args) {
        Iaa aa = ()->{
            System.out.println("selamlar");
        };

        aa.metot();


        Iaa2 aa2 = (i)->{
            System.out.println("selam 2");
        };

        Iaa2 aa2_1 = i->{
            System.out.println("selam 2");
        };

        Iaa2 aa2_2 = i-> System.out.println("selam 2");

        Iaa3 aa3    = i->{ return i*2;};
        Iaa3 aa3_1  = i-> i*2;

        System.out.println(aa3.metot3(7));

        int sayi= (int) (Math.random()*5);

        switch (sayi) {
            case 0-> System.out.println("sıfır");
            case 1-> {
                System.out.println("bir");
            }
            case 2-> System.out.println("iki");
            case 3-> System.out.println("uc");

        }


    }

}
