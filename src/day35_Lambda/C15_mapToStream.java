package day35_Lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class C15_mapToStream {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);

        Stream<Map.Entry<String, Integer>> stream = map.entrySet().stream();

        stream.forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));

    }
}
