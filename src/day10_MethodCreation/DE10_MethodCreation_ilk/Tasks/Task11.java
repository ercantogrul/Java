package day10_MethodCreation.DE10_MethodCreation_ilk.Tasks;

import java.util.Scanner;

public class Task11 {
    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile

    public static void main(String[] args) {
        /* task-> girilen ifadeyi 'hacker' dilinde print eden METHOD create ediniz

        a->7
        v->1
        c->-4
        e->2
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir ifade giriniz: "); // kahveci
        String str = scan.nextLine();

        String ifade = sifreliIfade(str);
        System.out.println(ifade);


    }//main sonu
    public static String sifreliIfade(String str1){
        String yeniIfade = str1.toLowerCase().replace("a","7").replace("v","1").
                replace("c","4").replace("e","2");
        return yeniIfade;
    }





}
