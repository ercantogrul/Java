package day06_SwitchCase.i_AsyaHoca_if_ileAlakaliOrnekler_;

import java.util.Scanner;

public class s4_50_uzeri_gectiniz {
    public static void main(String[] args) {



          //sınav notu 50'den büyük ise geçti değilse kaldı
              //Sınav notu 100-0 arasında olabilir

        Scanner scanner = new Scanner(System.in);
        System.out.println(" sinav notu giriniz : ");
        int not = scanner.nextInt();

        boolean b1 = not>0 && not <100;


        if (b1 && not>=50 ) {
            System.out.println("gectiniz");
        }else System.out.println("kaldiniz");

        ///==========Ternary==================
        Scanner scan = new Scanner(System.in);
        System.out.println( "sinav notu giriniz?");
        int not1 = scan.nextInt();
        boolean b2 = not1>= 0 && not <=100;

        String str = b2 && not1>=50? "gec" : "kaldi";
        System.out.println(str);







    }
}
