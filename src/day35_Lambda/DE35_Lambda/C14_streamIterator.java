package day35_Lambda.DE35_Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C14_streamIterator {
    public static void main(String[] args) {
        IntStream.iterate(5,t->t+5)
                .limit(10)
                .forEach(p-> System.out.print(p+" "));

        List<Integer> list = new ArrayList<>();

        list = Stream.generate(Math::random)
                .limit(20)
                .map(p-> (int) Math.round(p*20))
                .toList();
        System.out.println("\n---");
        System.out.println(IntStream.range(1,11).sum()); // 1 den 10 kadar sayıların toplamı
        System.out.println(IntStream.rangeClosed(1,11).sum()); // 1 den 11 e kadar

    }
}
