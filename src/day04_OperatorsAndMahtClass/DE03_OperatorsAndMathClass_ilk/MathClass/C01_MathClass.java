package day04_OperatorsAndMahtClass.DE03_OperatorsAndMathClass_ilk.MathClass;

public class C01_MathClass {
    public static void main(String[] args) {
        int s1=10,s2=12,s3=-10;
        double dd=3.9,dd2=5.5;

        System.out.println("--- SAYININ MUTLAK DEGERINI GÖSTERIR. ---");
        int sonuc = Math.abs(s3); // mutlak değerini dönderir // 10
         sonuc = Math.abs(s1); // mutlak değerini dönderir // 10
        System.out.println(sonuc);

        System.out.println("--- SAYININ ONDALIK KISMINI ATAR AMA .0 ile gosterir  ---");
        dd = Math.floor(dd); // ondalıklı kısmı atar
        System.out.println("dd = " + dd);   // ama 3.0 yazdirir

        System.out.println("--- SAYIYI YUVARLAR ---");
        long l1  = Math.round(dd); // yuvarlama demektir
        System.out.println("l1 = " + l1);   // 4 çıkar

        System.out.println("--- EN BUYUK ve en kucuk SAYIYI VERIR ---");
        int buyuk = Math.max(s1,s2); // 12 buyuk olanı verir
        double kucuk = Math.min(dd,dd2);   // kucuk olanı verir 3.9

        System.out.println("--- KAREKOK ALIR ---");
        dd = Math.sqrt(dd); // karekok alır

        System.out.println("--- KUVVETINI ALIR (USLU IFADELER)  ---");
        System.out.println(Math.pow(5,2));
        System.out.println(Math.pow(5,2.5));
        System.out.println(Math.pow(16,0.5));
        System.out.println(Math.pow(dd,dd2)); // dd nin dd2.kuvvetini alır

        System.out.println("--- Random sayılar ---");
        System.out.println(Math.random()); // 0 ile 0.9999999999 arasında bir sayı üretir

        s1 = (int) (Math.random()*10); // rastgele sayı üretir 0,9 dahil olmak üzere arasında sayılar üretir
        System.out.println(s1);
        s1 = (int) (Math.random()*10+1); // rastgele sayı üretir 1,10 dahil olmak üzere arasında sayılar üretir
        System.out.println(s1);
        s1 = (int) (Math.random()*90+10); // iki basamaklı sayı üretir

        System.out.println(s1);
        System.out.println((int)(Math.random()*90+10));

        System.out.println((int)(Math.random()*45+5)*2);     // iki basamakli cift sayi üretmek
        System.out.println((int)(Math.random()*5*2));       // bir basamakli cift sayilar üretir.
        System.out.println((int)((Math.random()*50+50)*2)); // üc basamakli cift sayilar üretir.

        System.out.println((int)(Math.random()*10));      // 0,9 dahil olmak üzere arasında sayılar üretir
        System.out.println((int)(Math.random()*90+10));   // iki basamakli sayılar üretir
        System.out.println((int)(Math.random()*900+100)); // üc basamakli sayılar üretir
        System.out.println((int)(Math.random()*4+2));     // 2-3-4-5 sayilarini üretir
        System.out.println((int)(Math.random()*3+1));      // 1-2-3 sayilarini üretir






    }
}
