package day06_SwitchCase.DE06_SwitchCase_ilk.tasks;

import java.util.Scanner;

public class Task05__ {

    public static void main(String[] args) {
		/*
		TASK :
		Girilen note değerinin  aşağıdaki kurallara göre karşılığını print eden code create ediniz.
		1. 0(dahil) ile 50 arasi - D
		2. 50(dahil) ile 60 arası - C
		3. 60(dahil) ile 80 arası - B
		4. 80(dahil) ustu- A
		Yanlis not girilirse ekrana "Lütfen gecerli not giriniz" print ediniz
		
		AHAN DA  TRICK :) switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
		switch() de int, byte, short, char, String kullanilir.

		 */
        /*
        Scanner scan =new Scanner(System.in);
        System.out.println("bir not giriniz");
        int not = scan.nextInt();
       if (not<50) {
            System.out.println("D");
        } else if (not<60) {
            System.out.println("C");
        } else if (not<80) {
            System.out.println("B");
        } else if (not>=80) {
            System.out.println("S");
        }else
            System.out.println("Lütfen gecerli not giriniz ");
      */
        // switch == ile

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir not giriniz");
        int point = scanner.nextInt();
        if(!(point<=0 || point>100)){
            switch (point/10){
                case 0: case 1: case 2: case 3:
                case 4:
                    System.out.println('D');break;
                case 5:
                    System.out.println('C');break;
                case 6: case 7:
                    System.out.println('B');break;
                case 8: case 9: case 10:
                    System.out.println('A');
            }
        }
        else {
            System.out.println("Invalid");
        }























    }

}
