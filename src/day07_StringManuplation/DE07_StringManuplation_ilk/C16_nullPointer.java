package day07_StringManuplation.DE07_StringManuplation_ilk;

public class C16_nullPointer {
    public static void main(String[] args) {

        String str1;
        // System.out.println(str1);
        // str1.concat(" candir");

        str1 = "java";
        System.out.println(str1); // java
        System.out.println(str1.concat(" candir")); // java candir

        /*
            null bir deger degil pointer(isaretleyici)
            bütün non-primitive data türlerini null olarak isaretleyebiliriz. kullanilabilir,
            yazdirilabilir ama bir methot ile kullanamayiz

            26.satir icin
            str2'nin degeri null veya str2'ye null degeri atanmis ifadeleri YANLISTIR

            dogru olan ifade
            str2'ye deger atamadik, bunun farkindayiz ve null olarak isaretledik
         */
        String str2 = null;  // deger atamadigimizin farkinda oldugumuzu javaya söylüyoruz. bu bir deger degildir
        System.out.println(str2); // null
        System.out.println(str2 + " candir"); // null candir
        // System.out.println(str2.concat(" candir")); // NullPointerException  //null'u bir method ile kullanamayiz

        str2= "tava";
        System.out.println(str2); // tava
        System.out.println(str2.concat(" candir")); // tava candir

        String str3 = null;  //bu bir deger degildir
        String str4 = "";    //bu ise bos tur
        System.out.println(str4.isBlank()); // true
        System.out.println(str4.isEmpty()); // true
        // System.out.println(str3.isBlank()); // NullPointerException
        // System.out.println(str3.isEmpty()); // NullPointerException










    }
}
