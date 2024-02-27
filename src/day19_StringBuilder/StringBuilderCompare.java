package day19_StringBuilder;

public class StringBuilderCompare {
    public static void main(String[] args) {
        String str=new String("Asya");
        String str1=new String("Asya");
        StringBuilder sb1=new StringBuilder("Asya");
        StringBuilder sb2=new StringBuilder("Asya");
        StringBuilder sb3=new StringBuilder();
        sb3=sb2;

        System.out.println(str.equals(sb1));//false
        System.out.println(sb1.compareTo(sb2));//0 eşit
        System.out.println(sb1.equals(sb2));//false çünkü StringBuilder'daki equals methodu içerik ve referansı aynı anda karşılaştırmakta
        System.out.println(sb2.equals(sb3));//true eşitlediğimiz için aynı referansı göstermekte
       // System.out.println(str==sb2); Aynı veri tipleri için kullanılır


        System.out.println(str1.equals(str));//true


        StringBuilder bb = new StringBuilder("Java");
        String str11 = bb.toString();
        String str2 = bb.toString();
        String str3 = str11;
        StringBuilder bb1 = bb;
        System.out.println((str11==str2)+" "+(bb==bb1)+" "+(str11==str3)); //false true true
    }
}
