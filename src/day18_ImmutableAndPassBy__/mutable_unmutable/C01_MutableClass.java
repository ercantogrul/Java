package day18_ImmutableAndPassBy__.mutable_unmutable;

public class C01_MutableClass {
    public static void main(String[] args) {
        int sayi=10;
        System.out.println(System.identityHashCode(sayi)); //1072408673
        sayi++;
        System.out.println(System.identityHashCode(sayi)); //1531448569
        int sayi2=10;
        System.out.println(System.identityHashCode(sayi2));//1072408673 //hafizada aldigi degere göre referans alir
        // 1. ve 3. satirdakilerin ikisinde de 10 degeri oldugu icin referanslarida aynidir
        System.out.println("------");

        String str1 = "Hasan";
        System.out.println(System.identityHashCode(str1)); //1867083167
        String str2 = "Hasan";
        System.out.println(System.identityHashCode(str2)); //1867083167
        if (str1 == str2) System.out.println("eşittir");   //eşittir
        else System.out.println("eşit değildir");

        String str3="Ha";
        str3 = str3 +"san";
        if (str1 == str3) System.out.println("eşittir");
        else System.out.println("eşit değildir");           //eşit değildir
        System.out.println(System.identityHashCode(str3));  // 793589513
        int sayi5=11;
        System.out.println(System.identityHashCode(sayi5));  // 1531448569
        sayi5=sayi5-1;
        System.out.println(System.identityHashCode(sayi5));    //1072408673  (sayi1 ve sayi5 deki degerler 10 oldugu icin referanslari da ayni
    }
}
