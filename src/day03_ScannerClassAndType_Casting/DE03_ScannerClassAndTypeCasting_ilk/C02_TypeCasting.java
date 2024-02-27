package day03_ScannerClassAndType_Casting.DE03_ScannerClassAndTypeCasting_ilk;

public class C02_TypeCasting {
    public static void main(String[] args) {
	/*
		byte < short < int < long < float < double
		Auto Widening Casting->Kucuk data type'larini buyuk data typlarina Java  otomatik olarak çevirir.

        Type Casting: Bir numeric data type'ini diger numeric data type'ina cevirmek demektir.
                      byte < short < int < long < float < double
        Note 1: Kucuk data type'ini buyuk data type'ine cevirmeye "Auto Widening" denir
        Note 2: Buyuk data type'ini kucuk data type'ine cevirmeye "Explicit Narrowing" denir
        EN ONEMLI NOKTA, kücük data buyuk dataya aktarilabilir ama buyuk data kucuk dataya aktarilamaz. hata veriri.

    */
        byte b1 = 25;
        int s1 = b1+120; // s1=145
        b1 = (byte) s1;      // buna casting islemi denir cikan sayiyi byte cinsinde yazdir demektir.
        System.out.println("b1= " + b1);


        long l1 = s1;
        double d1 = l1;
        d1 = l1+s1+b1;

        d1 = 255.32541;
        l1 = (long) d1;
        System.out.println(l1);
        String str = "Ahmet";
        char ch = 'A'; // ACII kodu 65 dir
        b1=10;
        System.out.println(str+ch);             // AhmetA
        System.out.println(b1+ch);
        System.out.println("----");            // 75

        System.out.println((char)(ch+b1));    // K  (75 in charkarsiligi K dir.)

    }
}
