package day07_StringManuplation.DE07_StringManuplation_ilk._Replace;

public class S01_ {
    public static void main(String[] args) {
        // verilen metinde kac tame "a" harfi vardir

        String str = "Merhaba ali aga";
        String str2 = str.replaceAll("a","");  // a lari sil
        System.out.println(str);
        System.out.println(str2);
        int asayisi = str.length() - str2.length();
        System.out.println(asayisi);


        // ikinci yol
        System.out.println(str.length()-str.replace("a","").length());




    }
}
