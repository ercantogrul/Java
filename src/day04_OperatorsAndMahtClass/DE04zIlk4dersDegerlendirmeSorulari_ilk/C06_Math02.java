package day04_OperatorsAndMahtClass.DE04zIlk4dersDegerlendirmeSorulari_ilk;

import java.util.Scanner;

public class C06_Math02 {
    public static void main(String[] args) {
        // verilen 3 double sayıdan büyük olanını, diğer ikisinin toplamından buyuk ise
        // ekran true, aksi halde ekrana false yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("ekrana double birinci sayiyi giriniz");
        double d1 = scan.nextDouble();
        System.out.println("ekrana double birinci sayiyi giriniz");
        double d2 = scan.nextDouble();
        System.out.println("ekrana double birinci sayiyi giriniz");
        double d3 = scan.nextDouble();


        double enBd1d2 = Math.max(d1,d2);
        System.out.println("enBd1d2 :" +  (Math.max(d1,d2)) );

        double enB = Math.max(enBd1d2,d3);
        System.out.println("enB : "+ (Math.max(enBd1d2,d3)));
        double enKtoplami = (d1+d2+d3-enB);
        System.out.println(enB>enKtoplami);








    }
}
