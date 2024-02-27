package day03_ScannerClassAndType_Casting.DE03_ScannerClassAndTypeCasting_ilk;

public class data_Casting {
    public static void main(String[] args) {
         /*
            char,boolean ve String'i diger data turlerine cast edemeyiz

            Sayisal data iceren primitive data turlerini birbirine cast edebiliriz
            1- daha kucuk data turundeki degeri, daha genis data turundeki variable'e atama yaparsak
               Java Auto Widening yapar, yani otomatik olarak bu islemi yapar

            2- daha genis kapsamli data turundeki degeri, daha dar kapsamli variable'a atama yaparsak
               Java bunu otomatik olarak yapmaz
               Biz sorumlulugu uzerimize alarak bu casting'i yaptirabiliriz

               sorumlulugu almak icin  degerin onune bir parantez acip
               parantez icine cast etmek istedigimiz data turunu yazabiliriz

               Daraltma (Explicit Narrowing) yapildigindadata kayiplari olabilecegi gibi,data baskalasabilir de



         */

        String str = "Java Candir";

        // int sayi1 = (int)str ;
        // char chr1 = (char)str ;
        // boolean bl1= str;

        String s1 = str;


        // boolean bl2= 10;
        // boolean bl2 = 's';


        int sayi2 = 'k';
        System.out.println(sayi2);    //k nin ascii degerini veriri ==107
        double dbl1 = sayi2;
        // String str2 = sayi2;

        int sayi3 = 10;
        double dbl2 = 4.5;
        short sh1 = 3;
        byte by1 = 7;

        sayi3 = (int)dbl2;
        sayi3 = sh1;
        sayi3 = by1;

        dbl2 = sayi3;
        dbl2 = sh1;
        dbl2 = by1;

        by1 = (byte)dbl2;
        by1 = (byte)sh1;
        by1 = (byte)sayi3;

        sh1 = (short)dbl2;
        sh1 = (short)sayi3;
        sh1 = by1;






    }
}
