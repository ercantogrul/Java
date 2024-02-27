package day24_Encapsulation.C01_Ciftlik;

public class CiftlikRunner {
    public static void main(String[] args) {

        Ciftlik hayvan = new Ciftlik();

        hayvan.setAyakSayisi(5);
        System.out.println(hayvan.getAyakSayisi());
        hayvan.setAyakSayisi(4);
        System.out.println(hayvan.getAyakSayisi());
        System.out.println();


        hayvan.setAyakSayisi(3); // 3 gönderdik direk method dan cikti aldik
        //hatali giris yaptiniz
        int ayakSayisi;
        ayakSayisi = hayvan.getAyakSayisi();
        System.out.println("..." + ayakSayisi);  //...3
        System.out.println(hayvan.getAyakSayisi()); //3

        hayvan.setHayvaninCinsi("tavuk");
        hayvan.setYasi(2);
        hayvan.setAyakSayisi(2);
        System.out.println(hayvan);

        hayvan.setHayvaninCinsi("keci");
        hayvan.setYasi(7);
        hayvan.setAyakSayisi(5);
        System.out.println(hayvan);


        Ciftlik hayvan2 = new Ciftlik("koyun", 5, 4);
        System.out.println(hayvan2);


    }
}

