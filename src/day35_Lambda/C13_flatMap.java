package day35_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C13_flatMap {
    public static void main(String[] args) {
        // flatMap 2 boyutluyu tek noyutlu hale cevirir
        List<String> list = new ArrayList<>();
        list.add("Bu bir denemedir");
        list.add("bu dur bir deneme");
        list.add("satir denemedir");
        list.add("bu dosya");
        list.add("dosya bu bir deneme deneme");
        list.stream()
                .map(p->p.split(" "))
                .flatMap(Arrays::stream)
                .distinct()
                .forEach(p-> System.out.print(p+" "));

        System.out.println();
        // ornek 2
        List<List<String>> listler = new ArrayList<>();
        list  =new ArrayList<>(Arrays.asList("Ali","hasan","veli ","ayşe","kamil"));
        listler.add(list);
        list  =new ArrayList<>(Arrays.asList("Rukiye","Refia","Fatih","Seyda","Hasan"));
        listler.add(list);
        list  =new ArrayList<>(Arrays.asList("Ankara","Mersin","Tarsus","Kenya","Hanya"));
        listler.add(list);
        listler.stream()
                .flatMap(p->p.stream())
                // .flatMap(Collection::stream)
                .forEach(p-> System.out.print(p+" "));

    }
}
