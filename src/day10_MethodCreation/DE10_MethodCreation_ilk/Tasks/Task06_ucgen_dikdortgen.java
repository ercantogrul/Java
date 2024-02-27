package day10_MethodCreation.DE10_MethodCreation_ilk.Tasks;

import java.util.Scanner;

public class Task06_ucgen_dikdortgen {


    public static void main(String[] args) {
        //Task-> Girilen iki boyuta göre seçilen geometrik şeklin(kare dikdörtgen , dik üçgen) alan ve çevre değerlerini print eden METHOD  create ediniz
        Scanner input = new Scanner(System.in);
        System.out.print("lütfen bir kenar uzunlugu giriniz : ");
        int sayi1 = input.nextInt();
        System.out.print("lütfen bir kenar uzunlugu giriniz : ");
        int sayi2 = input.nextInt();
        System.out.println("lütfen geometrik bir sekil seciniz");
        String str =input.next();
        System.out.println("lütfen yapmak istediginiz islemi belirtiniz");
        String islem = input.next();

        if(str.equalsIgnoreCase("dikdortgen") && islem.equalsIgnoreCase("alan")) {
            int dikdortgenAlan = dikdortgenAlan(sayi1,sayi2);
            System.out.println(dikdortgenAlan);
        } else if (str.equalsIgnoreCase("dikdortgen") && islem.equalsIgnoreCase("cevre")) {
            int dikdortgenCevre = dikdortgenCevre(sayi1,sayi2);
            System.out.println(dikdortgenCevre);
        } else if (str.equalsIgnoreCase("ucgen") && islem.equalsIgnoreCase("alan")) {
            int ucgenAlani = ucgenAlan(sayi1,sayi2);
            System.out.println(ucgenAlani);
        } else if (str.equalsIgnoreCase("ucgen") && islem.equalsIgnoreCase("cevre")) {
            int ucgenCevresi = UcgenCevre(sayi1,sayi2);
            System.out.println(ucgenCevresi);

        }


    }//main sonu

    private static int UcgenCevre(int i1, int i2){
        int i3= (int) Math.sqrt(Math.pow(i1,2)+Math.pow(i2,2));
        int UcgenCevre= i1+i2+i3;
        return UcgenCevre;
    }
    private static int ucgenAlan(int i1, int i2){
        int ucgenAlan= (i1*i2)/2;
        return ucgenAlan;
    }
    private static int dikdortgenCevre(int i1, int i2) {
        int dikdortgenCevre = (i1 * 2) + (i2 * 2);
        return dikdortgenCevre;
    }
    private static int dikdortgenAlan(int i1, int i2) {
        int dikdortgenAlan = (i1 * i2);
        return dikdortgenAlan;
    }


}
