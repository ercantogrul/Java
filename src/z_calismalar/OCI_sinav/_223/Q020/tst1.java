package z_calismalar.OCI_sinav._223.Q020;

public class tst1 {
    int a1;
    public static int doProduct(int a) {
        return a = a * a;
    }
    public static void doString(String s) {
        s.concat(" " + s);
    }
    public static void main(String[] args) {
        Test item = new Test();
        item.a1 = 11;
        String sb = "Hello";
        Integer i = 10;
        System.out.println("doProduct(i) = " + doProduct(i));  //100--ayrica return olsa i=doProduct(i); yazilip gelen veri tekrar i ye esitlenmeliydi
        doString(sb);
        doProduct(item.a1);
        System.out.println(i+ " " + sb + " " + item.a1);
    }
}
