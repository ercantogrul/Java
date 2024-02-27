package day07_StringManuplation.DE07_StringManuplation;

public class C10_isEmpty {
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

        String str = " ";
        if (str.isEmpty()) {
            System.out.println("this is empty");
        }
        if (str.isBlank()) {
            System.out.println("this is blank");
        }

    }

}
