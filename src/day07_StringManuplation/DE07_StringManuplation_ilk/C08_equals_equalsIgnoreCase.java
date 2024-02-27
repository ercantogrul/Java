package day07_StringManuplation.DE07_StringManuplation_ilk;

public class C08_equals_equalsIgnoreCase {
    public static void main(String[] args) {
        /* equals()
         * 2 String metnin birbirine esit olup olmadigina bakar. büyük küçük harf farkı vardır. Sonuc boolean dir.
         *
         *  equals() method’u verilen iki String’in içeriğinin birbirine eşit olup olmadığını kontrol eder.
         * == karşılaştırma operatörü ise verilen iki String objesinin değerinin yanında reference(adres)’lerine de bakar.
         * Aynı değere sahip olsa da farklı iki objeyi == ile karşılaştırdığımızda sonuç FALSE olur.

         * equalsIgnorecase()
         * equals() ile ayni islevi gorur, tek farki buyuk kucuk harfe duyarliligi yoktur. Sonuc boolean dir.
         */


        String st = "clarusway";
        String sb = st+"";
        System.out.println("st = " + st);
        System.out.println("sb = " + sb);

        String str ="ClarusWay";
        st.equals("str");
        System.out.println( st.equals("str"));
        System.out.println(st.equalsIgnoreCase(str));
        //===========================================================
        String str1 ="Merhaba Dunya";
        String str2 ="Merhaba Dunya";
        String str3 = "Merhaba";
        String str4 = str3+"Dunya"; System.out.println(str4);//Merhaba Dunya
        String str5 ="Merhaba Dunya";

       // ===NOT 1 ==============================================================
        //if (str1==str2) bunu diyemeyiz, cunku ==  bunlarin referanslarini karsilastirir. bu kullanilmaz. referanslar degisebilir
        if (str1==str2) System.out.println("esittir");      // burada esit verir
        else System.out.println("esit degildir");
        if (str1==str4) System.out.println("esittir");
        else System.out.println("esit degildir");         // ama ayni olasina ragmen burada esit degil verir.

        // ===NOT 2 ======================================================================
        if (str1.equals(str2)) System.out.println("esittir");      // burada ise sadece degerler karsilastirilir-harfler ayni esittir
        else System.out.println("esit degildir");
        if (str1.equals(str5)) System.out.println("esittir");
        else System.out.println("esit degildir");                  // yazi ayni ama harfler farkli esit degil
        // ===NOT 2 =======harflerin büyük kücük olmasini gözardi et===============================================
        if (str1.equalsIgnoreCase(str5)) System.out.println("esittir"); // harfler farkli olsada esittir.
        else System.out.println("esit degildir");

    }
}
