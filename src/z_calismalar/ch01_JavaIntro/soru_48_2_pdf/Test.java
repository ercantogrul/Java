package z_calismalar.ch01_JavaIntro.soru_48_2_pdf;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List colors = new ArrayList<>();
        colors.add("green");
        colors.add("blue");
        colors.add("red");
        colors.add("yellow");
        colors.remove(2);
        colors.add(5,"cyan");
        System.out.println("colors = " + colors);
    }
}
