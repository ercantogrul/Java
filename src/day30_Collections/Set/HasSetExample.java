package day30_Collections.Set;

import java.util.*;

public class HasSetExample {
    public static void main(String[] args) {
        Set<Integer> l1=new HashSet<>(Arrays.asList(1,2,3,3,null,4,4,5,34,67,75,3,67,null,null));
        System.out.println(l1);//1,2,3,4,5,34,67,75,null;
        System.out.println("l1.size() = " + l1.size());// 9 elemanlı

        // sıralama önemli DEĞİL

        Set<Integer>l2=new LinkedHashSet<>(Arrays.asList(1,2,3,3,4,4,5,34,67,75,3,67,null,87,null));
        System.out.println("l2 = " + l2);
//Bizim eklediğimiz sıralamay agöre yapmakta
        Set<Integer>l3=new TreeSet<>(Arrays.asList(1,2,33,4,4,5,34,67,75,3,67,87));
        System.out.println(l3);

        //Daha yavaş null değerikabul etmez

    }
}
