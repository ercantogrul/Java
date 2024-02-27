package day04_OperatorsAndMahtClass.DE03_OperatorsAndMathClass_ilk.tasks;

public class Task01 {
	public static void main(String[] args) {
       // print lerde ne yazar el ile hesaplayınız
            int x = 4;
            x++;               //5
            x += x;            //10
            --x;               //9
            x = 7 + x;         //16
            x *= x;            //256
            x -= 3;             //253

            System.out.println(" x = " + x);  //253

        // toplamada iki farkli veri turu varsa buyuk olanin cinsinden yazar

            int a = 3;
            double d = 4.5;
            d += a;         //7.5            // double ve int iki farkli veri turu var buyuk olan double oldugu icin sonuc double seklinde yazilir.
            a += (int)d;    //10            //  a int bir sayi oldugu icin caste yapip int olarak yazdiririz
            d -= a;         //-2.5
            a -= d;         //12
            System.out.println(" d = " + ++d);   //-1.5
            System.out.println(" a = " + a--);    //12



    }

}
