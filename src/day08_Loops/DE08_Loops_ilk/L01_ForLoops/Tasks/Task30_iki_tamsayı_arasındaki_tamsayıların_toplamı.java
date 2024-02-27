package day08_Loops.DE08_Loops_ilk.L01_ForLoops.Tasks;

import java.util.Scanner;

public class Task30_iki_tamsayı_arasındaki_tamsayıların_toplamı {

    public static void main(String[] args) {
        // task-> girilen iki tamsayı arasındaki tamsayıların toplamını print eden code create ediniz


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen baslangic ve bitis degerleri icin 2 pozitif tamsayi giriniz");

        int baslangic= scan.nextInt();
        int bitis= scan.nextInt();
        int toplam =0;

        if (baslangic>bitis) {
            for (int i = baslangic; i >bitis ; i--) {
                toplam =  toplam+i;

            }System.out.print(toplam);
        }else {
            for (int i = bitis; i >baslangic ; i--) {
                toplam =toplam+i;

            }System.out.print(toplam);
        }

    }
}
