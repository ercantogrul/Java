package z_calismalar.OCI_sinav._223.Q028__Array__43;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test_else_blok {
    public static void main(String[] args) {
        // given the code fragment
        String[] arr = {"Him", "How", "Are", "You"};
        List<String> arrList = new ArrayList<>(Arrays.asList(arr));
        if (arrList.removeIf(s -> {System.out.print(s);return s.length() <= 2;})) { // < 2
            System.out.println(" removed"); //s causes compilation error
        }else System.out.println(" dddddd");

        System.out.println(arrList);





    }
}
