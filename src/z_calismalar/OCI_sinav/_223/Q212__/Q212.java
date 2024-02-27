package z_calismalar.OCI_sinav._223.Q212__;
interface I1 { }
class P1 { }
class P2 extends P1 implements I1{}


public class Q212{
    public static void main(String[] args) {
        P1 obj1=new P1();
        P2 obj2=new P2();
        I1 obj3=new P2();
        boolean r1=obj1 instanceof P2; // false // obj1 P1 den olusmus ve P1 de P2 yi extends etmedigi icin false
        boolean r2=obj2 instanceof P1; // true  // obj2 P2 den olusmus ve P2 de P1 i extends ettigi icin true
        boolean r3=obj3 instanceof I1; // true  // obj3 p2 den olusmus ve P2 de I yi implement ettigi icin true
        System.out.println(r1+":"+r2+":"+r3);

        //** instanceof verilen degerle esdeger olup olmadigini kontrol eder
    }
}

    /*
    What is the result?
    A. true:false:true
    B. false:true:true
    C. false:true:false
    D. true:true:false
     Answer: B
    */
   // public static void main(String [] args) {
    
//        Object t = new Q212();
//        // compiles fine since Object is a parent class to String
//        System.out.println(t instanceof String);
//
//        String s = new String("Hello");
//        if (s instanceof String) System.out.println("s is instance of String"); // True
//        if (s instanceof Object) System.out.println("s is instance of Object"); // True
//        //if (s instanceof StringBuffer) System.out.println("s is instance of StringBuffer"); // Compile error
