package z_calismalar.OCI_sinav._223.Q071__polm___;
class C1 extends C2 implements I {
    public void displayI() {
        System.out.println("C1");
    }

    public static void main(String[] args) {
        C2 obj1 = new C1();
        I obj2  = new C1();

        // C2 s =  obj2; //1- obj2 new C1() constructor undan olusturulmus---hata yok--c1 c2 nin child classi oldugu icin child class extends varsa constructor olarak verilabilir--
                         //2- I dan olusturulan obj2 objesi C2 den olusturulan s ye aktariliyor-- I ile C2 arasinda herhangi bir iliski olmadigi icin CTE verir
                         //
        // I t =  obj1; // burada ise tam tersi C2 den olusturulan obj1 I dan olusturulan t ye aktariliyor---ayni sekilde CTE verir

        //t.displayI();
        //s.displayC2();

    }
 }
//    What is the result?
//
//        A.	C2C2
//
//        B.	C1C2
//
//        C.	C1C1
//
//        D.	Compilation fails
//
//        Answer: B ??






// Answer D