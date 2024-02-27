package day35_Lambda.DE35_Lambda.Tasks02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task02_03 {
/* list in en büyük 5 elemanının küçükten buyuye doğru ekrana yazdırın
eğer aynı elemandan 2 adet varsa, sadece birini kullanın
aşağıdaki örnek için çıktı
45 46 54 58 61
şeklinde olamalıdır
 */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>
                (Arrays.asList(58, 7, 54, 46, 54, 7, 38, 7, 7, 61, 46, 45, 25, 16));
        System.out.println(list);


        list.stream().sorted(Comparator.reverseOrder()).limit(5).sorted().forEach(p-> System.out.println(p+" "));



    }
}
