package z_calismalar.ch01_JavaIntro.soru_82;

import java.util.ArrayList;

public class Soru_82 {
    public static void main(String[] args) {

        Alpha ref1 = new Alpha(100);
        Alpha ref2 = new Alpha(50);
        Alpha ref3 = new Alpha(125);
        ref1.doPrint();
        ref2.doPrint();
        ref3.doPrint();
    }
}
class Alpha {
    int ns;
    static int s;
    Alpha(int ns) {
        if (s < ns ) {

            s = ns;
            this.ns = ns;
        }
    }
    void doPrint(){
        System.out.println("ns = " + ns + " s = " + s);
    }
}
