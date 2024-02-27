package Faruk_hoca_yeni_ilk5gun.DE04zIlk4dersDegerlendirmeSorulari;

public class C01_Prints {
    public static void main(String[] args) {
        int sayi=11;

        System.out.println("sonuc = "+sayi+sayi);   // 1. sonuc = 1111

        System.out.println(sayi*sayi);              // 2. 121

        System.out.println(true && false || true);   // 3. true
        System.out.println(!true||false);           // 4. false
        System.out.println((sayi==11) && (sayi>11) || sayi<11); // 5.false

        char ch='A'; // 'A' nın ASII karşılığı 65 dir)
        System.out.println(ch);                      // 6.A
        System.out.println(ch+1);                    // 7.66
        System.out.println((char) (ch+2));           // 8.C

        double dd = sayi;
        System.out.println("dd = " + dd);            // 9. 11.0

        byte bb = (byte) sayi;                       //
        System.out.println("bb = " + bb);            //10. 11

        int x=0;
        int sonuc = x++ + ++x + x;
        System.out.println("sonuc = " + sonuc);     // 11. sonuc = 4
        System.out.println("x = " + x);             // 12. x  = 2

        String str = 7*5+" gün";
        System.out.println("str = " + str);         // 13. 35 gün

        int ss=10; ss += 5; ss--; ss /= 7; ss *= 2; ss -= 4;
        System.out.println("ss = " + ss);           // 14. ss = 0

    }
}
