package day28_Interface.DE28_Interface.Tasks.Task01;

public class Daire implements Interface{

    @Override
    public void cevre(double d1, double d2, double r) {
        double cevre = 2*3.14*r;
        System.out.println("Daire cevre : "+cevre);
    }

    @Override
    public void alan(double d1, double d2,double r) {
        double alan = 3.14*Math.pow(r,2);
        System.out.println("Daire alan : "+alan);
    }
}
