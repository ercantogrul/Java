package day08_Loops.DE08_Loops_ilk.L01_ForLoops.Tasks02;

public class Task02_07 {
    public static void main(String[] args) {
        // 1 ila 100 arasında rastgele üretilen 10000 adet int sayıdan
        // % kaçı tek sayıdır

        int counter = 0;
        for (int i = 0; i <10000 ; i++) {
            int sayi = (int) (Math.random()*100+1);
            if (sayi%2 == 1) counter++;
        }
        double tekYuzdesi = 100.0*counter/10000;
        System.out.printf("Tek Sayıların Yüzdesi = %5.2f",  tekYuzdesi);


        // Garbage collector = Çöp toplayıcı

        int sayacTekSayi =0;
        int sayacCiftS =0;
        for (int i = 0; i < 10000; i++) {
            int sayi = (int) (Math.random()*100+1);
            if(sayi%2==0){
                sayacCiftS++;
            }else
                sayacTekSayi++;
        }
        double tekyuzde =100* sayacTekSayi /10000;
        System.out.println("sayilardan tek sayi orani  %  " +tekyuzde+" dir");
        System.out.printf("Tek sayilarin yüzdesi =%5.2f",tekyuzde);

    }
}
