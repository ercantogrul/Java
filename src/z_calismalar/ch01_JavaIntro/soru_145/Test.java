package z_calismalar.ch01_JavaIntro.soru_145;

public class Test {
    public static void test(Integer x, Integer y){
        System.out.println("Integer sum is = " + (x+y));
    }

    public static void test(double x, double y){
        System.out.println("double sum is = " + (x+y));
    }

    public static void test(float x, float y){
        System.out.println("Integer sum is = " + (x+y));
    }

    public static void main(String[] args) {

        test(10,20);
        test(10.0,20.0);
    }
}
