package day09_Break_Continue.DE09_BreakContinue;

public class C02_Continue {
    public static void main(String[] args) {
        // rast gele 100 adet sayı üretin 7 ye tam bölünebilenleri ekrana yazdırın
        for (int i = 0; i <100 ; i++) {
            int sayi= (int) (Math.random()*100);
            if (sayi%7 != 0) {
                continue;
                // burayı da atlar
            }
            System.out.print(sayi+" ");

            // continue buraya atar
        }
        // break buraya atar
    }
}
