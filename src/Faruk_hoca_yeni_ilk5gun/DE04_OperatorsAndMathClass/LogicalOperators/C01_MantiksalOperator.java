package Faruk_hoca_yeni_ilk5gun.DE04_OperatorsAndMathClass.LogicalOperators;

public class C01_MantiksalOperator {
    public static void main(String[] args) {
/*
 -------- && - and - (ve)---------

      True   &&    True    -->  True
      True   &&    False   -->  False
      False  &&    True    -->  False
      False  &&    False   -->  False


     -------- ||- or - (veya)---------

      True   ||    True    -->  True
      True   ||    False   -->  True
      False  ||    True    -->  True
      False  ||    False   -->  False
 */
        // && ile & arasindaki fark
        //&& de boolean sonuc 3 te bir tane false bulunca durur tum satırı kontrol etmeye calısmaz.
        // Ancak & tum satırı kontrol eder ondan sonra durur.
        //sonucta fark yok sadece biri ilk hatayı buldugunda durur dığeri sonuna kadar gider.&& tekliye gore daha hizli calisir

        //and->ve

        boolean b1=true;
        boolean b2=false;
        int a=3;
        int c=7;

        System.out.println(b1&(a<c)); // true and true = true

        System.out.println(b1&&(a>c)); // true and false = false

        System.out.println(b1&(a==c)); // true and false = false

        //or->veya
        System.out.println(b1||(a<c)); // true or true = true

        System.out.println(b1||(a>c));  // true or false = true

        System.out.println(b1||(a==c)); // true or false = true

        //not->!

        System.out.println(!(b1||(a>c))); // tersi( true or false) = false
        System.out.println( !b1 ); // false
        System.out.println( !b2 ); // true

        int x= 5, y=10,z=15;
        System.out.println((x==5) && (z==15));  // true
        System.out.println((x==5) || (z==15));  // true
        System.out.println((x==5) && !(y==15)); // true
        System.out.println(!(x==5) || (y==15)); // false
        System.out.println(!true); // false
        System.out.println(((x==5) && (z==10)) && ((x==5) || (y==15)) ); // false
        System.out.println(((x==5) && (z==10)) || ((x==5) || (y==15)) ); // true
        System.out.println(((x==5) && (z==10)) || ((x==15) || (y==15)) );// false



    }
}
