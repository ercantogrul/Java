package z_calismalar.ch01_JavaIntro;

import java.util.ArrayList;
import java.util.List;

public class color {
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
