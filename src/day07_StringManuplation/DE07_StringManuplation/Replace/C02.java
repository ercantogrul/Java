package day07_StringManuplation.DE07_StringManuplation.Replace;

public class C02 {
    public static void main(String[] args) {
        String str  = "MerhabBA45 65 selam HH =?+ - ";
        System.out.println(str);
        String s1 =str.replaceAll("\\d","*"); // tüm rakamları "*" yap
        System.out.println(s1);

        s1 =str.replaceAll("\\D","*"); // tüm rakam olmayanları "*" yap
        System.out.println(s1);

        s1 =str.replaceAll("\\s","*"); // tüm boşlukları "*" yap
        System.out.println(s1);

        s1 =str.replaceAll("\\S","*"); // tüm boşluk olmayanları "*" yap
        System.out.println(s1);

        s1 =str.replaceAll("\\w","*"); // tüm harf+rakamlar "*" yap
        System.out.println(s1);

        s1 =str.replaceAll("\\W","*"); // tüm harf ve rakam dışındakiler "*" yap
        System.out.println(s1);

        s1 =str.replaceAll("[a-z]","*"); // tüm küçük harfleri  "*" yap
        System.out.println(s1);

        s1 =str.replaceAll("[A-Z]","*"); // tüm büyük harfleri  "*" yap
        System.out.println(s1);

        s1 =str.replaceAll("[a-zA-Z]","*"); // tüm harfleri  "*" yap
        System.out.println(s1);

        s1 =str.replaceAll("[0-9]","*"); // tüm rakamları  "*" yap
        System.out.println(s1);

        s1 =str.replaceAll("[abc]","*"); // tüm a, b ve harflerini  "*" yap
        System.out.println(str);
        System.out.println(s1);

        s1 =str.replaceAll("[aeioöuüıAEIİOÖUÜ]","*"); // tüm sesli harflerini  "*" yap
        System.out.println(str);
        System.out.println(s1);



    }
}
