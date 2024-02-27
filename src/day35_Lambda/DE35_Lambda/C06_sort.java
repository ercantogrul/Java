package day35_Lambda.DE35_Lambda;

import java.util.*;

public class C06_sort {
    /*
   Sorted:
   Bazı durumlarda elimizde ki veri setini belirli bir parametreye göre sıralamak isteyebiliriz.
           2 türü bulunmaktadır. Birinci hali parametre almaz küçükten büyüğe şekilde sıralar.
   İkinci formatı ise Comparator arayüzünden türediği için
   bizim belirlemiş olduğumuz parametreye göre sıralama işlemi yapar.
    */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(58, 7, 54, 41, 59, 33, 38, 13, 65, 61, 46, 45, 25, 16));
        System.out.println(list);
        list  =list.stream().sorted().toList(); // kucukten buyuye sıraladık
        System.out.println(list);
        list = list.stream().sorted(Comparator.reverseOrder()).toList();// buyukten kucuge sıraladık
        System.out.println(list);
        // Collections.sort(list);

    }
}
