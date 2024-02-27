package day20_Constructor.A02_Constructor_Parametreli_girdigimiz_degerleri_alma;

public class Home {
    //POJO class
    public int yil=2020;
    public String renk="red";
    public int metreKare =250;

    public Home() {  // Class ismi ile ayni olmak zorundadir (yukarda.. class Home)
        this (200); //Constructor cagir bana
        //yani parametresit Constructor icerisinde pm li bir Constructor cagiriyoruz.
        // yani bir pm li Constructor a gidip orada atamalar yapip sonucu aliriz
        System.out.println("pm siz Constructor");
    }
    public Home(int metreKare){ //1 parametreli Constructor

        this.metreKare=metreKare;
        System.out.println("parametreli Constructor ");
    }

    public Home(int metreKare,int yil){ // 2 parametreli Constructor

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





