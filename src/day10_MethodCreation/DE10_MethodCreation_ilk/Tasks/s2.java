package day10_MethodCreation.DE10_MethodCreation_ilk.Tasks;

import java.util.Scanner;

public class s2 {
    public static void main(String[] args) {
        // task-> Girilen bir ifadenin tekrarlı karakterleri yalnızca 1 kez print eden METHOD create ediniz
        // input-> javacanlara selam olsun
        // output-> javcnlr semou
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir ifade giriniz: ");
        String str = scan.nextLine();


        tekrarliOlmayanKarakterler (str);
    }//main sonu

    private static void tekrarliOlmayanKarakterler(String str) {

        String yeni ="";
        for (int i = 0; i <str.length() ; i++) {
            String harf = str.substring(i,i+1);
            if(!yeni.contains(harf)){
                yeni+=harf;

            }


        }
        System.out.println(yeni);
    }
}
