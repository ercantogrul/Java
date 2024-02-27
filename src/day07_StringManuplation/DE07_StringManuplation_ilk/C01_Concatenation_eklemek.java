package day07_StringManuplation.DE07_StringManuplation_ilk;

public class C01_Concatenation_eklemek {

    public static void main(String[] args) {

        /*
        concat() -> methodu içinde parametre alığı String variable'yi çaliştığı string sonuna ekler(birleştirir)
        Java '+' işleminde en az bir string ifade vars artimetik toplama değil birleştirme yapılır
         */

        String str1 = "Safvet";
        String str2 = "Vedat";


        String birlesikString1 = str1 +" "+str2;   //kolay yoldan bir String ile birlestirme yapilmis   ==Safvet Vedat
        String birlesikString2 = str1.concat(" ").concat(str2);   // String in bir methodu olan concat( )
        // ile birlestirme yapilmis,==Safvet Vedat
        System.out.println(birlesikString1);
        System.out.println(birlesikString2);

        String ab =str1.concat(str2);   //SafvetVedat
        System.out.println(ab);

        /*
        ahan da TRİCK-> String methodları variable'yi kalıcı değil geçici değişiklik yapar.
        String'de kalıcı değişklik yapmak için atama yapılır...
         */



        /*
        Trick-> concat methodu parametre olarak String harici tüm dataları Stringe çevirip concat eder.
         String mürekkep gibi bulundugu ortamda diğer dataları etkiler.
         */
    }
}
