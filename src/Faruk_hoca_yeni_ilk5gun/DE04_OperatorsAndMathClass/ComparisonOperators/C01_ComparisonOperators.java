package Faruk_hoca_yeni_ilk5gun.DE04_OperatorsAndMathClass.ComparisonOperators;

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


    }
}
