package day28_Interface.DE28_Interface.Tasks.Task01;

public class Kare implements Interface{
    @Override
    public void cevre(double d1, double d2,double r) {
        double cevre = (d1 + d1) * 2;
        System.out.println("Kare cevre : "+cevre);
    }

    @Override
    public void alan(double d1, double d2,double r) {
        double alan = d1 * d1;
        System.out.println("Kare alan : "+alan);
    }

}
