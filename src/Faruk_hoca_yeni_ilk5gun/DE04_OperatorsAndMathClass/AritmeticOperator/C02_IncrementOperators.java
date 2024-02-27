package Faruk_hoca_yeni_ilk5gun.DE04_OperatorsAndMathClass.AritmeticOperator;

public class C02_IncrementOperators {
    public static void main(String[] args) {
        int sayi=10;

        sayi = sayi + 1;// 11

        sayi++; // sayi=sayi+1; sayi=12
        ++sayi; // sayi=sayi+1; sayi=13

        System.out.println(sayi); // 13
        System.out.println(sayi++); //13
        System.out.println(sayi);   //14

        System.out.println(++sayi);// 15
        System.out.println(sayi);  // 15

        int sayi2 = (sayi++) + (++sayi); //15 +17
        System.out.println(sayi);    // 17 , 15 , 16
        System.out.println(sayi2);   // 32 , 33 , 31
        // sayi=17
        sayi2 = (++sayi) + (sayi++); // 18+18
        System.out.println(sayi);    // 19
        System.out.println(sayi2);   // 36

        int k = 5;


        int sonuc = ++k + k++ + k++ + --k + k-- + k;


        System.out.println("sonuc = " + sonuc); //  39++ , 40
        System.out.println("k = " + k);         //   6++ , 6

    }
}
