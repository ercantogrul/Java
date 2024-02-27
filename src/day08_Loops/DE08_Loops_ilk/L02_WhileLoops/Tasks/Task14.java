package day08_Loops.DE08_Loops_ilk.L02_WhileLoops.Tasks;

import java.util.Scanner;

public class Task14 {

    /*Java ile iki sayının EBOB ve EKOK değerlerini "While Döngüsü" kullanarak yazınız.
sadece matematikciler çözsün :)
 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int s1 = scan.nextInt();
        System.out.println("ikinci sayiyi giriniz");
        int s2 = scan.nextInt();
        int min = (s1 < s2)? s1:s2;
        int ekok, ebob=1;

        for (int i = min; i >1 ; i--) {
            if ((s1%i==0) && (s2%i==0)){
                ebob=i;break;

            }
        }
        System.out.println("iki sayinin ebob'u: "+ebob);
        ekok = (s1*s2)/ebob;
        System.out.println("iki sayinin ekok'u: "+ ekok);

        //======================================

            int j=min;
            while (j>1) {
                if ((s1%j==0) && (s2%j==0)){
                    ebob=j;break;
                }
                j--;
            } ekok = (s1*s2)/ebob;
              System.out.println("iki sayinin ebob'u: "+ebob);
              System.out.println("iki sayinin ekok'u: "+ ekok);









    }
}
