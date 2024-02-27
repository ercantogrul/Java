package day08_Loops.DE08_Loops_ilk.L01_ForLoops.Tasks02;

import java.util.Scanner;

public class Task02_02_kucuk_sayiyi_Bulma {
    public static void main(String[] args) {
        // verilen n adet sayıdan en küçüğünü bulan code create ediniz
        int n= 20;
        int sayi = (int) (Math.random()*100);
        System.out.println(sayi+", ");
        int kucukSayi=sayi;
        for (int i = 1; i <n ; i++) {
            sayi= (int) (Math.random()*100);
            System.out.println(sayi+", ");
            if (sayi<kucukSayi) kucukSayi=sayi;
        }
        System.out.println();
        System.out.println("kücük sayi :" +kucukSayi);



        //=ikinci yontem=en kücük sayiyi bulun==============

        kucukSayi=Integer.MAX_VALUE;
        for (int i = 1; i <n ; i++) {
            sayi= (int) (Math.random()*100);
            System.out.println(sayi+", ");
            if (sayi<kucukSayi) kucukSayi=sayi;
        }
        System.out.println();
        System.out.println("kücük sayi :" +kucukSayi);
        //

        //=====ücüncü yontem hem kücük hemde büyük sayi bulma==============


        Scanner scan =new Scanner(System.in);
        System.out.println("n sayi giriniz");
        int n2 = scan.nextInt();
        int gs,buyuks=0,kucuks=0;

        for (int i = 1; i <= n2; i++) {
            System.out.println(i+ ".sayi");
            gs =scan.nextInt();
            if (i==1) {buyuks=gs;kucuks=gs;

            } else {
                if (buyuks<gs)  buyuks=gs;
                else if (kucuks>gs)  kucuks =gs;
            }
        }
        System.out.println("en büyük sayi = "+buyuks);
        System.out.println("en kücük sayi = "+kucuks);



    }
}
