package day07_StringManuplation.DE07_StringManuplation_ilk;

public class C21_isBlank_bos_bosluk {
    public static void main(String[] args) {
        //bir dizenin bos veya bosluk olup olmadigini kontrol eder. boolean döndürür.


        String str1 = "";
        String str2 = "         ";
        String str3 = "    .     ";

        System.out.println(str1.isEmpty()); // true    // str1 bos oldugu icin true
        System.out.println(str2.isEmpty()); // false  // str2 bos degil icinde bir boslukl var false

        System.out.println(str1.isBlank()); // true  "" veya space'lerden mi olusuyor
        System.out.println(str2.isBlank()); // true

        System.out.println(str3.isEmpty()); // false
        System.out.println(str3.isBlank()); // false





    }
}
