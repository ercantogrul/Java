package day08_Loops.DE08_Loops_ilk.L01_ForLoops;

public class C01_ForLoops {
    public static void main(String[] args) {
        // ey i Sıfırdan başla,
        // 10 dan küçük olduğu sürece { } parantezleri arasında dön,
        // her defasınd i 1 artsın
        int toplam = 0;
        // 1 den 10 kadar sayıların toplamını bulalım (1 ve 10 dahil)
        for (int i = 1; i <=10 ; i++) {
            toplam = toplam + i;
            System.out.println("i="+i+"    toplam="+toplam);
        }
        System.out.println("son toplam = "+toplam);
        // for ornekleri
        for (int i = 10; i >0 ; i--) {
            // 10 dan geriye doğru 1 e kadar gider
        }
        for (int i = 0; i <10 ; i+=3) {
            // 0 dan 9 kadar üçer üçer artarak döner
        }

        System.out.println("Bu loop kaç kez döner ? ");
        for (int i = 0; i <10 ; i++) {
            System.out.print(i+", ");
            i++;
        }
        System.out.println();
        System.out.println("Bu loop kaç kez döner 2 ? ");
        for (int i = 0; i <10 ; i++) {
            System.out.print(i+", ");
            if (i%3==0) i=10;
        }
        System.out.println();
        System.out.println("Bu loop kaç kez döner 3 ? ");
        for (int i = 0; i <10 ; i++) {
            System.out.print(i+", ");
            if (i%2==0) i *=2;
            System.out.println(i+", ");
        }
        // i=0,1,2,5,6


        System.out.println();
        System.out.println("Bu loop kaç kez döner 4 ? ");
        for (int i = 10; i <10 ; i--) {
            System.out.print(i+", ");
           // cevap : hiç dönmez
        }

        System.out.println();
        System.out.println("Bu loop kaç kez döner 4 ? ");
        for (int i = 10; i <11 ; i--) {
            System.out.print(i+", ");
            // cevap : sonsuz ( Integer.MIN_VALUE ya kadar)
        }





    }
}
