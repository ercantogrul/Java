package day24_Encapsulation.C02_Ornek1;

public class C01_Encapsulation {
    public static void main(String[] args) {

        Canli can = new Canli();

        // can.tur="10"; // dogrudan veri alma,ama private oldugu icin dogrudan veri alamayiz
        can.setTur("INSAN"); // kapsülleyerek veri alma
        String tur = "";
        //String tur = can.tur;  //dogrudan veri alma,ama private oldugu icin dogrudan veri alamayiz
        //System.out.println(tur);


        tur = can.getTur();  // kapsülleyerek veri alma
        System.out.println(tur);

        can.setTur("Imnsan");
        System.out.println(can.getTur());

       Canli2 can2 = new Canli2("Hayvan",2101);
       //üstteki islemde
        System.out.println(can2.getTur());


        int a = 5;
        int b = a; // bu su demek, get a sonra b ye set et


    }


}
