package day08_Loops.DE08_Loops_ilk.L01_ForLoops.Tasks;

import java.util.Scanner;

public class Task10_kactane_a_var {

    public static void main(String[] args) {
        /* task ->
        girilen bir ifadenin istenen harf sayısını(harfin kaç adet olduğunu) print eden code create ediniz
        for kullanarak yapın

        input : selam javaCAN'lar
        output : a sayısı :3
         */
        Scanner scan =new Scanner(System.in);
        System.out.println("bir tekst giriniz");
        String str = scan.nextLine();
        int n = str.length();
        int sayac =0;

        for (int i = 0; i < n ; i++) {

            if (str.charAt(i)=='a'){
                sayac++;
            }
        }
        System.out.println(sayac);




    }
}
