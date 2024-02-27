package day08_Loops.DE08_Loops.L01_ForLoops.Tasks02;

public class Task02_02 {
    public static void main(String[] args) {
        // verilen n adet sayıdan en küçüğünü bulan code create ediniz
        int n = 20;
        int sayi = (int) (Math.random()*100);
        System.out.print(sayi+",");
        int kucuk=100;

        for (int i = 1; i <n ; i++) {
            sayi = (int) (Math.random()*100);
            System.out.print(sayi+",");
            if (sayi<kucuk) kucuk=sayi;
        }

        System.out.println();
        System.out.println("kucuk = " + kucuk);

        //2.yol
        kucuk = Integer.MAX_VALUE;
        for (int i = 0; i <n ; i++) {
            sayi = (int) (Math.random()*100);
            System.out.print(sayi+",");
            if (sayi<kucuk) kucuk=sayi;
        }

    }
}
