package day19_StringBuilder;

public class C02_StringBuilder_capacity_trimToSize_length {
    public static void main(String[] args) {


        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());  //direk 16 birimlik bu alani aciyor
        //bu kapasite dolunca n*2+1 seklinde capasitiyi arttiriyor

        sb.append("hasan").append("hasan").append("hasanaa");
        System.out.println(sb.capacity());  //34
        sb.append("11111111111111222222222");
        System.out.println(sb.capacity());  //70
        System.out.println(sb.length()); //40  uzunluk

        // StringBuilder hiz icin fazladan yer ayirir. (hafizada ayirdigi yer--kelimenin length i degildir)
        // bu fazla alani trim ile kirpar

        sb.trimToSize(); // otomatik acilan yerden fazla olan kisimlari trim eder
        System.out.println(sb.capacity()); //40

        System.out.println(sb.indexOf("45"));  // 45 in indexi
        System.out.println(sb.indexOf("1", 1));  // 1 den sonraki 1 in indexi
        System.out.println(sb.lastIndexOf("5")); // 5 in son indexi

        String str = sb.substring(1, 10);  //=string
        System.out.println(str); //asanhasan
        System.out.println(sb); //hasanhasanhasanaa11111111111111222222222


        StringBuilder stringBuilder = new StringBuilder("hasan");
        appent(stringBuilder);  // append methodu cagrilmis
        System.out.println(stringBuilder);  //hasan10


    }

    private static void appent(StringBuilder ss) {
        ss.append("10");

    }


}
