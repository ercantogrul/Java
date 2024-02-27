package asya_hoca_.Projects.KahveMakinasi;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        KahveMakinasi kahve = new KahveMakinasi();
        kahve.Kahvemiz();
        kahve.menu();  //diger methodlari POJO class icerisine sirayla eklendi

        System.out.println(kahve.sutEklansinMi+" "+kahve.sekerEklensinMi+" "+kahve.kahveBoyLIstesi.get(kahve.kahveBoy)+
                kahve.kahveListesi.get(kahve.kahveSecimi-1)+" hazirdir afiyet olsun ");
        System.out.println(kahve);


    }


}
