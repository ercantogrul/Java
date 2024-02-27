package day08_Loops.DE08_Loops_ilk.L01_ForLoops.Tasks;

import java.util.Scanner;

public class Task16___asal_sayi {

    /*
     task-> Girilen sayının asal olmasını kontrol eden code create ediniz
     kendisi ve 1 dışında başka sayıya bölünmeyeb sayılara asal denir.
     2, 3, 5, 7, 11, 13, 17, 19, 23, 27
     * */
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("agam bir sayi giresen : ");
        int sayi = input.nextInt();
        int bolenSayisi = 0;//boş bir int kutu tanımlandı

        int sayac=0;
        if (sayi==1||sayi==0){
           System.out.println("girilen sayi asal dagildir");
        }else
        {
           for (int i = 2; i<sayi ; i++) {
               if(sayi%i==0) {
                   sayac++;
               }
           }
        }
        if(sayac==0){
            System.out.println("sayi asaldir : ");
        }else System.out.println("sayi asal degildir :");








    }
}
