package day08_Loops.DE08_Loops_ilk.L03_DoWhileLoops.Tasks;

import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
        //Task-> girilen baslangic ve bitis karakterleri dahil
        // aradaki tum karakterleri prnt eden code create ediniz

        Scanner scan =new Scanner(System.in);
        String str = "Merhaba Dunya 123";
        int i=0;
        int n =str.length();

        do {
            String yeni = str.substring(i,i+1);
            System.out.print(yeni);
            i++;
        }while (i<n);


    }
}
