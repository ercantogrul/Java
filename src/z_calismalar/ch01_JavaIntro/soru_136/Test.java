package z_calismalar.ch01_JavaIntro.soru_136;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        list.add("Tech");
        list.add("Expert");
        list.set(0,"Java");
        list.forEach(a -> a.concat("Forum"));
        list.replaceAll(s -> s.concat("Group"));
        System.out.println("list = " + list);
    }
}
