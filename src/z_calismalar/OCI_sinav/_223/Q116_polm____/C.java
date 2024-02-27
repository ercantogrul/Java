package z_calismalar.OCI_sinav._223.Q116_polm____;
class A{
    public void test(){
        System.out.println("A");
    }
}
class B extends A{
    public void test(){
        System.out.println("B");
    }
}
public class C extends A {
    public void test() {
        System.out.println("C");
    }

    public static void main(String[] args) {
        A b1=new A();
        A b2=new C();

        b1=(A)b2;      //line1
        A b3=(B) b2;   //line2 C cannot be cast to Q116.B // bunun aciklamasi su= A b3 = new C();demektir--
        // yani C construk tan olusturulan b2 obj si B class türünden veri türüne cast ediliyor. aralarinda bir iliski olmadigi icin CAST yapamaz
        // B Class ile C Class arasinda iliski olmadigi icin RTE ClassCastException verir
        b1.test();
        b3.test();

        //      C2 obj1 = new C1();
        //      I  obj2 = new C1();
        //
        //      C2 s = (C2) obj2;  // new C1(); den üretiliyor.

        // 1- Referans alma; Child class dan referans verilebilinir. parent clastan olmaz veya extend degilse olmaz
        // 2- cast yapma; obje hangi Class veri türünden yapilmissa o Class ve extends edilen alt class a cast edilebilinir
        // örn; s obj C2 Class türünden üretilmis... C2 ve alt extends class a cast edilebilinir
        // üretildigi Classin üst class ina cast edilirse CTE verir.
        // üretildigi Classin iki alt class a cast edilirse RTE verir
        //3- Referans alinan yani obje üretilen Class ile Cast islemi yapilan Class arasinada bir bag olnmalidir
        // aralarinda bir iliski yok ise RTE ClassCastException: hatasi verir
    }
}
/*What is the result?
A. AB
B. AC
C. CC
D. A ClassCastException is thrown only at line n1.
E. A ClassCastException is thrown only at line n2.




Answer: e

 */