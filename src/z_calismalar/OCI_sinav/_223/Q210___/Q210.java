package z_calismalar.OCI_sinav._223.Q210___;

import java.util.function.Predicate;

public class Q210 {
    public static void main(String[] args) {
        Predicate<Integer> p = (n) -> n % 2 == 0;
        //insert code here

    }
}

/* which code snippet at line 9 prints true?
A.  Boolean s=p.apply(101);  // Predicate sinifinin apply diye bir methodu yok
    System.out.println(s);

B.  Boolean s=p.test(100); // test methodu var
    System.out.println(s);
C.
    Integer s=p.test(100);  // boolean bir degeri Integer a atmaya calisiyor buda hata verir
    if(s==1){ // böyle bir yazim sekli yok ---sadece if(s) seklinde yazilir
        System.out.println("false");
    }else{
          System.out.println("true");
     }
D.
    System.out.println(p.apply(100));

   Answer B
*/
