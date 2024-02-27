package day32_Enum.Deneme1;

public class ENUM_tanimlar {
    /*
    Enum nedir?
// sabitler bütünüdür. bir takim sabitleri kullandigimiz yere enum denir. sabit tanimlanan veriler sayisi artinca ENUM kullanmak isimizi kolaylastirir.
Parametrede ki bilgileri tek tek girerken hata yapma ihtimalimiz yüksektir.
örnegin Ankara yerine Ankar yazilabilir veya Yesil yerine Yebil yazilabilir. yani bir harf fazla veya eksik veya farkli yazabiliriz:
// iste bu tür hatalara engel olmak icin Enum olusturabiliriz
// Enum lari yeni bir Class tanimlayarakta olusturabiliriz veya var olan bir Clasin icinde de tanimlayabiliriz
// Renkleri bu sinifin icinde tanimlayalim

     */
    final static String RED ="RED";
    static final String BLUE ="BLUE";
    public static void main(String[] args) {
        String r1 = "RED";
        String r2 = BLUE; //yukarda final sitatic tanimlandigi icin bu sekilde de tanimlayabilirim
        // sürekli tekrar edilen veya disardan veri olarak alinan bu tür sabit kullanilacak seyleri biz methodun disinda
        // final static olarak tanimlardik ör: final static String RED ="RED"; ki her yerden ulasabilelim.
    }

}
