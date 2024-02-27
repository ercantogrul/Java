package day28_Interface.DE28_Interface.Tasks.Task01;

public class Dikdortgen implements Interface {

    @Override
    public void cevre(double d1, double d2,double r) {
        double cevre = (d1 + d2) * 2;
        System.out.println("Dikdörtgen cevre : "+cevre);
    }

    @Override
    public void alan(double d1, double d2,double r) {
        double alan = d1 * d2;
        System.out.println("Dikdörtgen alan : "+alan);
    }
}
