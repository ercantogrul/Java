package z_calismalar.ch01_JavaIntro.soru_63_2_pdf;

public class C1 extends Test implements I{

    @Override
    public void displayI() {
        System.out.println("C1");
    }

    public static void main(String[] args) {
        Test obj1 = new C1();
        I obj2 = new C1();
        Test s = (Test) obj2;
        //I t = obj1;
       // t.displayI();
        s.displayC2();

    }
}
