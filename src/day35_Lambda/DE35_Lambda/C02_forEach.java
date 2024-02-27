package day35_Lambda.DE35_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_forEach {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList
                (11, 12, 7, 32,7 ,32, 41, 41, 32, 68, 41, 12, 7, 41, 43, 24, 32));

        list.stream().forEach(System.out::println);





    }
}
