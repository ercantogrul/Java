package day08_Loops.DE08_Loops_ilk.L01_ForLoops.Tasks02;

import java.util.Scanner;

public class Task02_06 {
    public static void main(String[] args) {
        // 1 ila 10 arasında rastgele üretilen n adet int sayıdan
        // tek olanların toplamını ekrana yazdıran program yazınız

        Scanner scan =new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int n = scan.nextInt();
        int toplam =0;
        for (int i = 0; i < n; i++) {
            int sayi = (int) (Math.random()*9+1);
            System.out.print(sayi+",");
            if(sayi%2!=0){
                toplam=toplam+sayi;
            }
        }
        System.out.println("tek sayilarin toplami :"+ toplam);


    }
}
