package day35_Lambda.DE35_Lambda;

@FunctionalInterface
interface Iface{
    boolean metot(int p);
}
@FunctionalInterface
interface Iface2{
    boolean metot(int p);
}
public class C01_Lamda2 {
    public static void main(String[] args) {
        Iface obj = new Iface() {
            @Override
            public boolean metot(int p) {
                return p%2==0;
            }
        };
        boolean bb = obj.metot(5);
        System.out.println(bb);

        Iface2 obj2 = p -> p%2==0;
        boolean bb2 = obj2.metot(5);
        System.out.println(bb2);

    }


}
