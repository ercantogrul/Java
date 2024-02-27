package day07_StringManuplation.DE07_StringManuplation.Replace;

public class S01 {
    public static void main(String[] args) {
        // verilen metinde kaç adet "a" harfi vardır
        String str = "Merhaba ali ağa";
        String str2= str.replaceAll("a",""); // a ları sil
        System.out.println(str);
        System.out.println(str2);
        int aSayisi = str.length() - str2.length();
        System.out.println(aSayisi);

        // 2.yol
        System.out.println(str.length()-str.replace("a","").length());
        /* "hasan"  (5)
           "hsn"    (3=

         */


    }
}
