package day08_Loops.DE08_Loops_ilk.L01_ForLoops.Tasks;

import java.util.Scanner;

public class Task36___harmonik_serisini {

    public static void main(String[] args) {
	//  Java ile girilen sayının harmonik serisini bulan program yazacağız.
    //  harmoni seri  = 1 + 1/2 + 1/3 + 1/4 + ...
        Scanner scan = new Scanner(System.in);
        int sayi;

        System.out.print("n sayısını giriniz : ");
        sayi=scan.nextInt();

        for (int i = 1; i <=1 ; i++) {
            for (int j = 1; j <= sayi; j++) {
                if(j==1) System.out.print(i+" + ");
                else System.out.print(i+"/"+j+" + ");
            }
            System.out.println();
        }



    }
}
