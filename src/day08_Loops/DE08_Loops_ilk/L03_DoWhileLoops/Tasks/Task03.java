package day08_Loops.DE08_Loops_ilk.L03_DoWhileLoops.Tasks;

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) { /*
    Task-> Girilen bir pozitif tamsayının tam kare olmasını kontrol eden code create ediniz.

     Ornek :  input : 16, output: 4 */
        Scanner scan =new Scanner(System.in);
        System.out.println("bir tam sayi giriniz ");
        int sayi =scan.nextInt();
        int i = 1;

        do{
            if(i*i==sayi){
                System.out.println("sayi tam karedir");break;
            }else
        i++;
        }while (i<sayi);
        System.out.println("sayinin karekökü :"+Math.sqrt(sayi));



    }
}
