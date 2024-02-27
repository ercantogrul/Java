package day07_StringManuplation.DE07_StringManuplation;

public class C01_Concatenation {

    public static void main(String[] args) {

        /*
        concat() -> methodu içinde parametre alığı String variable'yi çalşıtığı string sonuna ekler(birleştirir)
        Java '+' işleminde en az bir string ifade vars artimetik toplama değil birleştirme yapılır
         */

        String qa = "Safvet";
        String lead = "Vedat";

        String birlesikString1 = qa +" "+lead;
        String birlesikString2 = qa.concat(" ").concat(lead);
        System.out.println(birlesikString1);
        System.out.println(birlesikString2);

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
