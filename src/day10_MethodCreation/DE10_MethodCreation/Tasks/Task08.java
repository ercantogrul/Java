package day10_MethodCreation.DE10_MethodCreation.Tasks;

import java.time.LocalDate;
import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {

    /*
    Task-> girilen bir yılın  artık yıl olmasını kontrol eden METHOD create ediniz

   input: 2023
   output:false
    */
    Scanner scanner = new Scanner(System.in);
    System.out.print("Yılı giriniz : ");
    int yil = scanner.nextInt();

    artikYilMi(yil);

    String sonuc = artikYilMi2(yil);
    System.out.println(sonuc);

    }

    private static String artikYilMi2(int yil) {
        boolean sonuc;
        String str;
        if (yil%4== 0 && yil%100!=0) {
            sonuc = true;
        } else sonuc= yil % 400 == 0;

        if (sonuc) str = "artık yıl";
        else str = "artık yıl deği";
        return str;
    }

    private static void artikYilMi(int yil) {
        boolean sonuc;
        if (yil%4== 0 && yil%100!=0) {
            sonuc = true;
        } else sonuc= yil % 400 == 0;
        if (sonuc) System.out.println("artık yıl");
        else System.out.println("artık yıl deği");
    }


}
