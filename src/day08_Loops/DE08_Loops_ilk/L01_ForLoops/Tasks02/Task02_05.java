package day08_Loops.DE08_Loops_ilk.L01_ForLoops.Tasks02;

import java.util.Scanner;

public class Task02_05 {
    public static void main(String[] args) {
        // 1 ila 10 arasında rastgele üretilen n adet sayının  çift olanlarını ekrana yazınız


        Scanner scan =new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int sayi = (int) (Math.random()*9+1);
            if (sayi%2==0){
                System.out.print(sayi+", ");
            }
        }








    }
}
