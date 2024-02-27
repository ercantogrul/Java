package day08_Loops.DE08_Loops_ilk.L02_WhileLoops.Tasks;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {
        /*
        1 ile 100    sayi arasındaki  pc'nin atadığı tamsayıyı kullanıcıya  tahmin ettirip tahmin sayısını print eden  code create ediniz.
         */

        Scanner sc = new Scanner(System.in);
        int randomSayi = (int) (Math.random() * 99 + 1);
        System.out.println(randomSayi);

        for (int i = 1; i < 5; i++) {
            System.out.println(i + " . sayi");
            int gs = sc.nextInt();
            if (randomSayi == gs) {
                System.out.println("tahmininiz dogru");
                break;
            } else System.out.println("tahmininiz dogru degil tekrar deneyiniz");
        }
        System.out.println("hakkiniz bitti");

        //===================================================

        int j=1;
        while (j<5) {
            System.out.println(j + " . sayi");
            int gs = sc.nextInt();
            if (randomSayi==gs){
                System.out.println("tahmininiz dogru"); break;
            }else System.out.println("tahmininiz dogru degil tekrar deneyiniz");

            j++;
        } System.out.println("hakkiniz bitti");


    }

}

