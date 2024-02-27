package day35_Lambda.DE35_Lambda.Tasks02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task02_02 {
    /*
     skip ve limit kullanarak dizinin 5. elemanından 10. elamanına kadar olan kısmı alın
     yani dizinin yeni hali [7,38,7,7,61 olamlı]
     */

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>
                (Arrays.asList(58, 7, 54, 46, 54, 7, 38, 7, 7, 61, 46, 45, 25, 16));
        List<Integer> list2 =list.stream().limit(10).skip(5).toList();
        System.out.println(list2);



    }
}
