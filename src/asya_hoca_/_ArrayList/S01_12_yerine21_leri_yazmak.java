package asya_hoca_._ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class S01_12_yerine21_leri_yazmak {
    public static void main(String[] args) {
         /*
     If the list has 12 as element, change all 12s to 21
     Example: (12, 11, 12, 15, 12, 34, 43) ==> Output is (21, 11, 21, 15, 21, 34, 43)
 */
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(12, 11, 12, 15, 12, 34, 43));

        list1.set(list1.indexOf(12),21);
        System.out.println(".."+list1);


        //2.yol=================================
        if (Collections.replaceAll(list1,12,21))
            System.out.println("degisiklik gerceklesti");
        else System.out.println("degisen birsey yok");
        System.out.println(list1);


        //3.yol=========================

        Integer[] arr = {12, 11, 12, 15, 12, 34, 43};
        List<Integer> list = new ArrayList<>();
        list.addAll(List.of(arr));

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 12) {
                list.set(i,21); // list.set(list.indexOf(12), 21);
            }

        }
        System.out.println("list = " + list);

    }
}
