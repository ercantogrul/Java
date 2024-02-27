package Faruk_hoca_yeni_ilk5gun.DE04_OperatorsAndMathClass.AritmeticOperator.tasks;

public class Task01 {
	public static void main(String[] args) {
       // print lerde ne yazar el ile hesaplayınız
            int x = 4;
            x++;
            x += x;
            --x;
            x = 7 + x;
            x *= x;
            x -= 3;

            System.out.println(" x = " + x);

            int a = 3;
            double d = 4.5;
            d += a; // 7.5
            a += (int) d; // a = a + d // a = 3 + 7.5 // 10

            d -= a; // 7.5 - 10 =-2.5
            a -= (int) d; // 10 - (-2.5) 12.5 = 12
            System.out.println(" d = " + ++d); // -1.5
            System.out.println(" a = " + a--); // 12



    }

}
