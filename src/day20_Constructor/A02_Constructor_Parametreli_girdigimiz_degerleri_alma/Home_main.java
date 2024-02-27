package day20_Constructor.A02_Constructor_Parametreli_girdigimiz_degerleri_alma;

import day20_Constructor.A01_Constructor_Parametresiz.Home;

public class Home_main {
    public static void main(String[] args) {
        //parametreli Constructor
        //this(); Constructor call eden keyword

        //new varsa Constructor vardir
        Home home1 =new Home();
        //home1. objesinden Home daki variablelre ve methodlara ulasabiliriz
        System.out.println("home1.metreKare : " + home1.metreKare);



        Home home2 = new Home(200); // parametreli bir obje olustururken muhakkak parametreli bir Constructor yapmak zorundayiz
        System.out.println("home2.metreKare = " + home2.metreKare);



        Home home3 = new Home(200,2023,"White"); // 3 parametreli bir obje olustururken muhakkak 3 parametreli bir Constructor yapmak zorundayiz
        System.out.println("home3.renk = " + home3.renk);  //parametrelerdeki verileri gönderdik this araciligi ile geri aldik
        System.out.println("home3.yil = " + home3.yil);
        System.out.println("home3.metreKare = " + home3.metreKare); //home3.metreKare = 200


    }
}
