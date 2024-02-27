package day04_OperatorsAndMahtClass.DE03_OperatorsAndMathClass_ilk.tasks;

import java.util.Scanner;

public class Task09 {


    /*Task->
     Çiftlikteki hayvanların ayaklarının toplam sayısını bulma.
     Çiftlikteki bulunun inek, koyun, tavukların ayark sayısını hesaplayalım.

     */

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("ciftlikteki inek sayisi giriniz =");
        int inek = scan.nextInt();
        inek = inek*4;

        System.out.println("ciftlikteki koyun sayisi giriniz =");
        int koyun = scan.nextInt();
        koyun =koyun*4;
        System.out.println("ciftlikteki tavuk sayisi giriniz =");
        int tavuk = scan.nextInt();
        tavuk =tavuk*2;

        System.out.println("ciftlikteki hayvanlarin ayak sayisi =" +(inek+koyun+tavuk));




    }

}
