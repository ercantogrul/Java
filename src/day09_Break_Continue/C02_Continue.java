package day09_Break_Continue;

public class C02_Continue {
    public static void main(String[] args) {
        // rast gele 100 adet sayi üretin 7 ile tam bülünenleri ekrana yazdirin

        for (int i = 0; i < 100; i++) {
            int sayi = (int) (Math.random()*100);
            if (sayi%7 !=0) continue;  // for un icinde bulundugu sadece o turu bitiriyor

            System.out.print(sayi+" "); // continue buraya atar

        }
        // break buraya atar



    }
}
