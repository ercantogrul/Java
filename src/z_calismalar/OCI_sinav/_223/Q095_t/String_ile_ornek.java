package z_calismalar.OCI_sinav._223.Q095_t;

import java.util.ArrayList;
import java.util.List;

public class String_ile_ornek {
    public static void main(String[] args) {
        List<String> lst1 = new ArrayList<>();

        lst1.add(new String("10"));
        lst1.add(new String("10"));
        String p1 =new String("10");
        String p2 =new String("10");
        lst1.add(p1);
        lst1.add(p2);
        System.out.println(lst1.indexOf(p1));              //0
        System.out.println(lst1.indexOf(p2));              //0
        System.out.println(lst1.indexOf(new String("10"))); // 0
        // son ciktiyi list1 e eklemeden cikti aldik ve 0 verdi list1 de olmamasina ragmen
        // ama Product den olusturunca lst de yerr almayinca -1 verdi
        System.out.println(lst1);  //[10, 10, 10, 10]
    }
}
