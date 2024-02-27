package day10_MethodCreation.DE10_MethodCreation_ilk.Tasks;

import java.util.Scanner;

public class Task03_return {
    public static void main(String[] args) {
        //task-> girilen Saati saniyeye
        // mil'i km'ye
        // kg'yi gr'a çeviren METHOD create ediniz.


        Scanner input = new Scanner(System.in);
        System.out.print("döndüreceginiz birimi giriniz : ");
        String birim = input.nextLine().toLowerCase();//saat mil kg

        System.out.print("döndüreceginiz birimin miktarini giriniz : ");
        double miktar = input.nextDouble();//saat mil km miktarı

        String sonuc = cevir2(birim,miktar);
        System.out.println(sonuc);
    }

    private static String cevir2(String birim,double miktar){
        String str="";
        switch (birim) {
            case "kg"  : str= miktar+"kg =" +(miktar*1000+ "gram dir");break;
            case "saat": str= (int)miktar+"saat =" +(int)(miktar*3600)+ "saniyedir";break;
            case "mil" : str= miktar+"mil =" +(miktar*1.61+ "km dir");break;
        }
        return str;
    }

}
