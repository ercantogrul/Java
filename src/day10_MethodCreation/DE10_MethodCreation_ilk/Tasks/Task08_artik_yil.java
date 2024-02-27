package day10_MethodCreation.DE10_MethodCreation_ilk.Tasks;

import java.util.Scanner;

public class Task08_artik_yil {

    public static void main(String[] args) {

    /*
    Task-> girilen bir yılın  artık yıl olmasını kontrol eden METHOD create ediniz

   input: 2023
   output:false
    */
        Scanner scan = new Scanner(System.in);
        System.out.println("bir yil giriniz: ");
        int yil = scan.nextInt();

        artikYilmi(yil);

        String sonuc = artikYil2(yil);
        System.out.println(sonuc);



}//main sonu

    //return ile
    private static String artikYil2(int yil) {
        boolean sonuc ;
        String str;
        if (yil%4==0 && yil%100!=0 ){
            sonuc =true;
        }else sonuc =yil%400==0;

        if (sonuc) str= "artik yil";
        else str = "artik yil degildir";
        return str;
    }

    // void ile
    private static void artikYilmi(int yil) {
        boolean sonuc ;
        if (yil%4==0 && yil%100!=0||yil%400==0 ){
            sonuc =true;
        } else sonuc=false;

        if (sonuc) System.out.println("artik yil");
        else System.out.println("artik yil degildir");

    }


}
