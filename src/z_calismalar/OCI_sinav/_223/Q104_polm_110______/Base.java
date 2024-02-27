package z_calismalar.OCI_sinav._223.Q104_polm_110______;

//Base.java:
class Basem {
    public void test() {
        System.out.println("Basem ");
    }
}
class Base extends Basem {
    public void test() {
        System.out.println("Base ");
    }
}
// DerivedA.java:
class DerivedA extends Base {
    public void test() {
        System.out.println("DerivedA ");
    }
}
//DerivedB.java:
class DerivedB extends DerivedA {
    public void test () {
        System.out.println("DerivedB ");
    }
    public static void main (String[] args) {
        Base b1 = new DerivedB();
        Base b2 = new DerivedA();
        Base b3 = new DerivedB();
        Base b4 = b3; //new DerivedB();
        b1 =  (Base)b2; //new DerivedA();
        // b1 obj si simdi b2 denilerek __new DerivedA();__ bu Constructor dan olusturuluyor,
        // cast isi;b1 Base class veri türünden üretilmis... Ya base yada extends alt class a cast edilebilinir
        // üst class a cast edilirse CTE verir.
        // iki alt class a cast edilirse RTE verir

        b1.test();
        b4.test();
    }

}
	/*
	 *What is the result?
A. BaseDerivedA
B. BaseDerivedB
C. DerivedBDerivedB
D. DerivedBDerivedA
E. A ClassCastException is thrown at runtime.

Answer:
	 */


////Answer: DerivedADerivedB



