package day08_Loops.DE08_Loops_ilk.L03_DoWhileLoops.Tasks;

import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {
  /*
  Task-> Girilen sayıyı 0 olmadıgı sürece girilen sayıların toplamını print eden code create ediniz.
   */
        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen rast gele bir sayi giriniz ");

        int toplam = 0;
        int i =1;
        do{
            System.out.println(i+". sayi ");
            int sayi =scan.nextInt();
            if (sayi != 0) {
                toplam +=sayi;
            }else {System.out.println("sifir girdiniz");break;
            }
            System.out.println(toplam);
            i++;
        }while (i>=0);


    }
}
