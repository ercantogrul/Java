package Faruk_hoca_yeni_ilk5gun.DE04_OperatorsAndMathClass.AritmeticOperator;

public class C01_AritmeticOperator {
    public static void main(String[] args) {
        int s1 = 10, s2=12;
        int sonuc = (5*s1+s2)/2-2;
        int a = 5;
        int b = 12;
        int c = 7;

        System.out.println(b+a*c); // 47
        System.out.println(c / a);  // 1
        System.out.println(b + a * c); // 47
        System.out.println(b + (c - 2 * b) / 2); // 4
        System.out.println(c - a / (b - c) + a * b); // 66

        int d = 12;
        double e = 4;
        float f = 4f;
        System.out.println(d / e);// 3.0
        System.out.println(d + e); // 16.0
        System.out.println(e / d); // 0.33
        System.out.println(f / d); // 0.33
        System.out.printf("%5.3f\n",f/d);  // extra



        //Modulus Islemi : Iki ondalik olmayan sayi birbirine bolundugunde kalani verir
        //Java'da Modulus Islemi'nin sembolu "%" isaretidir.
        System.out.println("------- Mod işlemi -----------");
        System.out.println(13 % 5); // 3
        System.out.println(245 % 3); // 2

        //Cift Sayi (even) : 2'ye bolundugunde 0 kalanini veren sayilardir.
        //Tek Sayi (odd) : 2'ye bolundugunde 1 kalanini veren sayilardir.


        System.out.println(1234567 % 2);//Sonuc 1 ise tek sayidir, 0 ise cift sayidir
        System.out.println(25%2); // 1
        System.out.println(24%2); // 0
        System.out.println(122%2); // 0

        int g=2;
        int h=3;
        String  s="JavaCAN";
        //Task-> g h s variable'ları kullanarak 61JavaCAN-1 print eden code create ediniz.


        System.out.println(""+(g*h)+(h-g)+s+(g-h));//61JavaCAN-1



    }
}
