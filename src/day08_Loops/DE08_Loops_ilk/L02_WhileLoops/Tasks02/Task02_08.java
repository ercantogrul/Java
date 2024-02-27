package day08_Loops.DE08_Loops_ilk.L02_WhileLoops.Tasks02;

import java.util.Scanner;

public class Task02_08 {
    // 1  ila 100 arasında rastgele n adet sayı üretiniz, bu sayıların %kaçı tek sayıdır
    //yazdırınız
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen n adet rast gele sayi üretiniz");
        int n = scan.nextInt();
        int counter=0;
        int i=0;
        while (i<=n){
            System.out.println(i+". sayi");
            int random = (int) (Math.random()*99+1);
            System.out.println(random);
            if(random%2!=0){
                counter+=1;
            }
            i++;
        }
        System.out.println("tek sayilarin orani %:"+counter*n);
















    }
}
