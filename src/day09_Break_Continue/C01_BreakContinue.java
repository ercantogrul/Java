package day09_Break_Continue;

public class C01_BreakContinue {
    public static void main(String[] args) {
        //rastgele 1 ile 100 arasinda 50 sayisini bulana kadar sayilar üretiniz,
        // kac sayi ürettikten sonra 50 sayisi bulunuyor

        int conter =0;

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            int sayi = (int) (Math.random()*100);
            if (sayi==50) break;
            else conter++;

        }
        System.out.println(conter);











    }
}
