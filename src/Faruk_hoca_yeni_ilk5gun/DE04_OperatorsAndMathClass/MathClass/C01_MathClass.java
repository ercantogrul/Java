package Faruk_hoca_yeni_ilk5gun.DE04_OperatorsAndMathClass.MathClass;

public class C01_MathClass {
    public static void main(String[] args) {
        int s1=10,s2=12,s3=-10;
        double dd=3.9,dd2=5.5;

        int sonuc = Math.abs(s3); // mutlak değerini dönderir // 10
         sonuc = Math.abs(s1); // mutlak değerini dönderir // 10

        dd = Math.floor(dd); // ondalıklı kısmı atar
        System.out.println("dd = " + dd);
        dd=3.9;

        long l1  = Math.round(dd); // yuvarlama demektir , 4 çıkar
        System.out.println("l1 = " + l1);

        int buyuk = Math.max(s1,s2); // 12 buyuk olanı verir
        double kucuk = Math.min(dd,dd2);   // kucuk olanı verir 3.9

        dd = Math.sqrt(dd); // karekok alır

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




    }
}
