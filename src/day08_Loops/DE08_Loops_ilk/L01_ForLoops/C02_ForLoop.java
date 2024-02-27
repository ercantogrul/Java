package day08_Loops.DE08_Loops_ilk.L01_ForLoops;

public class C02_ForLoop {
    public static void main(String[] args) {
        // 1 den 10 kadar sayılar içersinde, çift sayıları ekrana yazalım
        // yol 1
        for (int i = 1; i <=10 ; i++) {
            i++;
            System.out.print(i+", ");
        }
        System.out.println();
        // yol 2
        for (int i = 2; i <=10 ; i++) {
            System.out.print(i+", ");
            i++;
        }
        System.out.println();
        // yol 3
        for (int i = 2; i <=10 ; i+=2) {
            System.out.print(i+", ");
        }
        System.out.println();

        // yol 4
        for (int i = 1; i <=10 ; i++) {
            if (i%2==0) System.out.print(i+", ");
        }
        System.out.println();

        // yol 5
        for (int i = 1; i <=5 ; i++) {
            System.out.print(i*2+", ");
        }
        System.out.println();

        /*
        int i=0
        if i<10 dön {
                işlemler
        i++;
        } else  cık

         */



    }
}
