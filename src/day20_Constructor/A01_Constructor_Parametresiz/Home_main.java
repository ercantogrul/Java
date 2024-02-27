package day20_Constructor.A01_Constructor_Parametresiz;

public class Home_main {
    public static void main(String[] args) {

        //new varsa Constructor vardir
        Home home1 =new Home();  //Constructor obje creat edildi
        //home1. objesinden Home daki variablelre ve methodlara ulasabiliriz
        System.out.println(home1.renk);
        System.out.println("home1.metreKare : " + home1.metreKare+",  yil : "+home1.yil+",  renk : "+home1.renk); //home1.metreKare : 250,  yil : 2020,  renk : White
        home1.test();  //test yapmak iyidir____ method dan cikti aldi
        System.out.println();


        Home home2 = new Home(270); // parametreli bir obje olustururken muhakkak parametreli bir Constructor yapmak zorundayiz
        System.out.println("home2.metreKare = " + home2.metreKare);  //270
        System.out.println("home2.yil = " + home2.yil);  //2020
        //POJO class da   this.yil=yil; seklinde tanimlanmadigi icin ilk tanimlandigi degeri alir
        System.out.println("home2.renk = " + home2.renk); //White
        //POJO class da   this.renk=renk; seklinde tanimlanmadigi icin ilk tanimlandigi degeri alir
        System.out.println();


        Home home3 = new Home(210,2024); // 2 parametreli bir obje olustururken muhakkak 2 parametreli bir Constructor yapmak zorundayiz
        System.out.println("home3.yil = " + home3.yil);
        System.out.println("home3.metreKare = " + home3.metreKare);//250
        //POJO class da   this.metreKare=metreKare; aktif olmadigi zaman ilk tanimlandigi degeri alir
        System.out.println();


        Home home4 = new Home(213,2023,"red"); // 3 parametreli bir obje olustururken muhakkak 3 parametreli bir Constructor yapmak zorundayiz
        System.out.println("home4.metreKare = " + home4.metreKare); //213
        System.out.println("home4.yil = " + home4.yil);
        System.out.println("home4.renk = " + home4.renk);
        home4.test();


    }
}
