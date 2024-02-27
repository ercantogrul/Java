package z_calismalar.OCI_sinav._223.Q066_polm_71_63_86_104_110_116;
interface I {
  public void displayI();
}
abstract class C2 implements I {
    public void displayC2() {
        System.out.print("C2");
    }
}
class C1 extends C2 {
  public void displayI() {
      System.out.print("C1");
  }
}
public class Q066 {
  // And the code fragment:
  public static void main(String[] args) {
      C2 obj1 = new C1();
      I obj2 = new C1();

      C2 s = (C2) obj2;  // new C1(); den üretiliyor.
    //1- Referans alma; Child class dan referans verilebilinir. parent clastan olmaz veya extend degilse olmaz
   // 2- cast yapma; obje hangi Class veri türünden yapilmissa o Class ve extends edilen alt class lara cast edilebilinir
     //  örn; s obj C2 Class indan üretilmis... C2 ve alt extends class a cast edilebilinir
      // üretildigi Classin üst class ina cast edilirse CTE verir.
      // üretildigi Classin iki alt class a cast edilirse RTE verir
   // 3- Referans alinan yani obje üretilen Class ile Cast islemi yapilan Class arasinada bir bag olmalidir
      // aralarinda bir iliski yok ise RTE ClassCastException: hatasi verir

      I t = obj1;

      t.displayI();
      s.displayC2();

      I obj3 = new C2() {  // C2 referansini kullanarak I veri türünden bir obje olusturuldugunda
          @Override        // I daki methodu overried etmek zorundadir. C2 class i abstract Class oldugu icin Class icinde zorunlu degil ...ama referans alindigi yerde yapmak zorundayiz
          public void displayI() {
          }
      };
      I tt = (C2)obj3;// (C1) e cast yapamayiz... ama (C2) ve (I) ya cast edebiliriz
      // yani I veri türünden bir obje olusturunca I ve extends edilen alt Class lara cast edilebilir


  }
}
//What is the result?
//A. C1C2
//B. C1C1
//C. Compilation fails.
//D. C2C2







//Answer: A

