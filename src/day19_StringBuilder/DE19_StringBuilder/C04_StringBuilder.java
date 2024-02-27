package day19_StringBuilder.DE19_StringBuilder;

public class C04_StringBuilder {
    public static void main(String[] args) {
         /*
        compareTo()->metodunu iki SB'i eşitliğini kontrol etmek için ilk characterden itibaren tum characterleri karşılaştırır.
        eşit characterler için herhangi bir return vermezken farklı characterler için ascii table göre kaç değer geri veya ileri oldg
        print eder
        Tum characterler eşit ise 0 return eder
        ahan da Trick-> SB ile String variable compare edilirse :CTE -> elam armut kıyası olmaz...

         */

        //=======compareTo()=================================
        StringBuilder sb1 = new StringBuilder("Aasan");
        StringBuilder sb2 = new StringBuilder("Aa24ça134n");
        int result = sb1.compareTo(sb2);
        System.out.println(result);
        if (sb1.compareTo(sb2)==0) System.out.println("ikisi eşittir");
        else System.out.println("eşit değillerdir");

        String str = "dsakfj";
        if (sb1.toString().equals(str)) System.out.println("eşittir"); // String ile stringbuilderı karşılaştırdık

        // String bulderi stringe cevrmek için sbuldir.toString(string)

        StringBuilder sb3 = new StringBuilder(str); // stringi string bulder e çevirmiş olduk
        System.out.println(sb1);
        System.out.println(sb1.reverse()); // ters ceviriyor.
        System.out.println(sb1.insert(2,"467823"));

        // Stringde olup string bulder da olmayan metotu kullanma örneği
        sb1 = new StringBuilder( sb1.toString().replaceAll("\\d",""));
        System.out.println(sb1);




    }
}
