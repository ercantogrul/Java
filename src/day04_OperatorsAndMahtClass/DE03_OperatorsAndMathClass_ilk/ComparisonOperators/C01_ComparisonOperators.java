package day04_OperatorsAndMahtClass.DE03_OperatorsAndMathClass_ilk.ComparisonOperators;

public class C01_ComparisonOperators {
    public static void main(String[] args) {
 /*
    Comparator : Karsilastirma islemleri.
    Java'da iki variable'in degeri karlilastirildiginda Java sonuc olarak boolean(true-false) return eder

    ==	    Esit	            x == y
    !=	    Esit degil	        x != y
    >	    buyuk	            x > y
    <	    kucuk	            x < y
    >=	    buyuk esit        	x >= y
    <=	    kücük esit  	    x <= y
  Unlem isareti (!) olumsuzluk anlaminda kullanilir.
     */
        int s1 = 12;
        int s2 = 20;
        boolean bb = (s1==s2);
        System.out.println(bb); //false

        System.out.println(s1!=s2); // true
        System.out.println(s1 < s2); // true
        System.out.println(s1 <= s2); // true

        //=======ÖNEMLI============================
       // System.out.println(2+3=5); // false  (javada bu olmaz, = atama isaretidir, == esttir isaretidir
       System.out.println(2+3==5); // true




        int a = 10;
        int b = 20;
        // Java'da = isareti karsilastirma degil, atama isaretidir (asignment)
        b = 2 * a ;


        // Java'da esitligi kontrol etmek istersek == kullaniriz
        System.out.println( b == 2*a ); // 20 == 20 ==> true


        // asignment'a esitligin sol tarafinda sadece variable bulunur
        // sol tarafta matematiksel islem olmaz
        // karsilastirma operatorlerinde iki tarafta da islem olabilir
        System.out.println( 3*b > 5*a ); // 60 > 50 ==> true
        System.out.println( b >= b-a ); // 20 >= 10 ==> true
        System.out.println( a <= b-a ); // 10 <= 10 ==> true


        // Java'da karsilastirma operatorlerinde kullanilan !
        // boolean degeri tersine cevirir.
        System.out.println(a < b); // true
        System.out.println(  !   (a < b)      ); // !true ==> false
        System.out.println(a != b ); // true


    }
}
