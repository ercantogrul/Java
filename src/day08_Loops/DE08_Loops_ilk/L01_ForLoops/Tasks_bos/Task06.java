package day08_Loops.DE08_Loops_ilk.L01_ForLoops.Tasks_bos;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        // 1 x 1 = 1
        // 1 x 2 = 2
        // 1 x 3 = 3
        // 1 x 4 = 4
        // 1 x 5 = 5
        // 1 x 6 = 6
        // 1 x 7 = 7
        // 1 x 8 = 8
        // 1 x 9 = 9
        // 1 x 10 = 10
        // Yuarıdaki çarpım tablosunu 10 a kadar print eden code create ediniz.

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir sayi  giriniz");
        int sayi = scanner.nextInt();

        for (int i = 0; i <=10; i++) {
            System.out.println(sayi+"x"+i +"="+sayi*i);

        }

    }
}
