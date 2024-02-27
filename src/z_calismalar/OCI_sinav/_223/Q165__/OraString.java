package z_calismalar.OCI_sinav._223.Q165__;

public class OraString {
    String s;
    public boolean equals(OraString str) {  // parametredeki buradaki veri String degil
        return this.s.equalsIgnoreCase(str.toString());
    }

    OraString(String s) { // burada String e  "Moon" atandi......
        this.s = s;
    }


    public static void main(String[] args) {
        String s1 = "Moon";
        OraString s2 = new OraString("Moon");  // bu condzructor ile yukarida s olan String e  "Moon" atandi......artik s2 objesi icin String s = "Moon"; dur
        System.out.println(s2); // z_calismalar.OCI_sinav._223.Q165____.OraString@10f87f48


        if ((s1==("Moon")) && (s2.equals("Moon"))) { // buradan gönderilen veri String. dolayisiyla methodu cagirmiyor. cünkü methoddaki veri türü OraString
            //s2 OraString e ait bir veri oldugu icin (String türünde degil) false döndürür. (ayni veri türlerini karsilastirabiliriz)
            // ama (s2.s.equals("Moon"))) olsaydi String objeye atanan Moon olacagi icin veri türü ve veri ayni oldugu icin true döndürürdü.
            System.out.println("A");
        } else {
            System.out.println("B");
        }

        if (s1.equalsIgnoreCase(s2.s)) { // s2.s ile objeye yani String s ye Moon atandi. iki veri türüde artik String oldugu icin karsilastirabiliriz. true
            System.out.println("C");
        } else {
            System.out.println("D");
        }

    }
}
/*
What is the result?
A.	AC
B.	BD
C.	BC
D.	AD



 Answer: C
 */

