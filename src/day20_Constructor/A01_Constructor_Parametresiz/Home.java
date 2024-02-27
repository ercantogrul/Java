package day20_Constructor.A01_Constructor_Parametresiz;

public class Home {
    //POJO class
    public int yil=2020;
    public String renk="White";
    public int metreKare =250;

    public Home() {  // Class ismi ile ayni olmak zorundadir (yukarda.. class Home)
                     // bu parametresiz constructor yapisi ile main method da obje olusturabiliyoruz
                     // parametresiz bir obje ( Home home1 =new Home(); ) olustururken bunu yazmak zorunda degiliz arka planda yazmasaniz da var
                     // ama Parametreli bir obje olusturacak olursak bunu yazmak zorundayiz

        this(200);  // tek parametreli constructor u cagiriyor ve
        //(int metreKare) ye 200 veriyor

    }
    public Home(int metreKare){
        //eger parametreli bir Constructor creat ederseniz
        //parametresiz (default) olan Constructori yazmak zorundasiniz
        // (Home home2 = new Home(200);) home2 variable metrekare 200 ü bu Constructora yollamis, dolayisiyla bu Constructor calisir.
        //buraya gönderilen degerin aktif olmasi icin this. kullanilir.
        this.metreKare=metreKare;
        System.out.println("parametreli Constructor :::");
    }
    public Home(int metreKare,int yil){ // 2 parametreli Constructor
        this.yil=yil;
        //this.metreKare=metreKare; aktif olmadigi zaman ilk tanimlandigi degeri alir

        System.out.println("2 parametreli Constructor ");
    }
    public Home(int metreKare,int yil,String renk){  //3 parametreli Constructor

        this.renk=renk;
        this.yil=yil;
        this.metreKare=metreKare;

        System.out.println("3 parametreli Constructor ");
    }

    public void test(){  // bir method olusturuldu
        System.out.println("test yapmak iyidir____");
    }

}


