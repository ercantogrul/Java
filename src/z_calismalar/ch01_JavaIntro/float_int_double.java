package z_calismalar.ch01_JavaIntro;

public class float_int_double {
    public static void main(String[] args) {
        int ivar =100;
        float fvar = 100.100f;
        double dvar =123;
        fvar = ivar;
        ivar = (int) fvar;
        fvar = (float) dvar;
        dvar = fvar;
        ivar = (int) dvar;
        dvar = ivar;
    }
}
