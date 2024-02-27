package day08_Loops.DE08_Loops.L01_ForLoops.Tasks02;

public class Task02_05 {
    public static void main(String[] args) {
        // 1 ila 10 arasında rastgele üretilen n adet sayının  çift olanlarını ekrana yazınız
        int n = 20; // n scanner ile okutulmalı
        for (int i = 0; i <n ; i++) {
            int sayi = (int) (Math.random()*10+1);
            if (sayi%2 == 0) System.out.print(sayi+" ");
        }
    }
}
