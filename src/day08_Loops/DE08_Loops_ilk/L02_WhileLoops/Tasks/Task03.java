package day08_Loops.DE08_Loops_ilk.L02_WhileLoops.Tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        //task-> girilen tamsayı için çarpım tablosu print eden code create ediniz
        //input: 8-> output :8x1=8, 8x2=16... 8x10=80


        Scanner sc = new Scanner(System.in);
        System.out.println("bir tam sayi giriniz: ");
        //int sayi1 = sc.nextInt();

        /*

        int i=0;
        for (int j = 0; j <= 10; j++) {
            int carpim=sayi*j;
            System.out.println(sayi+"*"+j+"="+carpim);
        }
         */

        //===========================================

        int sayi = sc.nextInt();
        int i=0;
        while (i<=10){
            int carp = sayi*i;
            System.out.println(sayi+"*"+i+"="+carp);
            i++;
        }

        //============================================================

        int sayac=0;
        while (sayi>=sayac){
            System.out.println(sayi+"x"+sayac+"="+sayi*sayac);
            sayac++;
        }




    }
}
