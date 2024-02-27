package day10_MethodCreation.DE10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task23 {


    public static void main(String[] args) {
        /*
        Task-> vucüt kitleendexini print eden METHOD create ediniz
        vki->kg(mt*mt)
     18,5 kg/m2 veya daha düşük değerler = Zayıf.
     18,5 ve 24,9 kg/m2 arasındaki değerler = Normal ağırlıkta.
     25,0 ve 29,9 kg/m2 arasındaki değerler = Kilolu.
     30,0 ve üstü =  obezite.

         */
        Scanner input = new Scanner(System.in);
        System.out.print("Boyunuz m olarak ");
        double boy = input.nextDouble();
        System.out.println("Kilonuz ? ");
        double kilo = input.nextDouble();
        vkeHesapla(boy,kilo);


    }//main sonu

    private static void vkeHesapla(double boy, double kilo) {
        sonucuYazkilo(kilo / (boy*boy));
    }

    private static void sonucuYazkilo(double vke) {
        if (vke<=18.5) System.out.println("zayıf");
        if (vke>18.5 && vke<25) System.out.println("normal ağırlıkta");
        if (vke>=25 && vke<30) System.out.println("kilolu");
        if (vke>=30) System.out.println("obez");
    }


}
