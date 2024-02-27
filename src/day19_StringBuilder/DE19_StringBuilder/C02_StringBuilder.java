package day19_StringBuilder.DE19_StringBuilder;

public class C02_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("123456789011111111hasan").append("hasan").append("hasanaa");
        sb.append(sb).append(1);
        System.out.println(sb.length()); // (stringin aynısı)

        System.out.println(sb.capacity());// string bulder hzı için fazlandan yer ayırır

        sb.trimToSize(); // bu fazla alanı trim ler, (fazlasını kırpar)

        System.out.println(sb.indexOf("45")); // = (stringin aynısı)
        System.out.println(sb.indexOf("1",1)); // =(stringin aynısı)
        System.out.println(sb.lastIndexOf("5")); // = (stringin aynısı)

        String str = sb.substring(1,10); // = (stringin aynısı)
        System.out.println(str);
        System.out.println(sb);

        StringBuilder stringBuilder = new StringBuilder("hasan");
        appent(stringBuilder);
        System.out.println(stringBuilder); // hasan10 yazdı

        str = appent2(stringBuilder);
        System.out.println(stringBuilder); // as,
    }

    private static void appent(StringBuilder ss){
        ss.append("10");

    }

    private static String appent2(StringBuilder ss){
        String str = ss.substring(1,3);
        return str;
    }
}
