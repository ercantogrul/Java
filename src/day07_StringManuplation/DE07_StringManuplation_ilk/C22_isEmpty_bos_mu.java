package day07_StringManuplation.DE07_StringManuplation_ilk;

public class C22_isEmpty_bos_mu {
    public static void main(String[] args) {
          /*
          String IsEmpty
           String tamamen boş mu değil mi onu kontrol ediyor, sonuç true false return eder
          isEmpty Methodundan true aliyorsaniz o String'in icinde hic bir character yok demektir.
          Yani o String'in length() 0 demektir.
          length()==0 demek isEmpty() true verir demektir.
          Bir String'in bos olup olmadigini anlamak icin "length()==0" kullanılır, "isEmpty()" kullanılmaz

         */

        //isBlank()-> ya boş ya da space olmalı.
        //System.out.println("str3.isBlank() = " + str3.isBlank());//RTE

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
