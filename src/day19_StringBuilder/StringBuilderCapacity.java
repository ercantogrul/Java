package day19_StringBuilder;

import java.util.Arrays;
import java.util.List;

public class StringBuilderCapacity {
    public static void main(String[] args) {
        //StringBuilder ve StringBuffer
        //İkisinin de yapı ve görevleri aynı .
        // Amaçları immutable olan Strinleri mutable 'a çevirmek
        //String'e göre daha hızlı ve en önemlisi  kapasiteyi verimli kullanması.
        //StringBuilder ve StringBuffer arasındaki fark
        //StringBuilder daha hızlı StringBuffer
        //Thread: iş parçacağı

        StringBuilder sb=new StringBuilder(6);//capacity 16
        String str="";//container
        sb.append(Arrays.asList("a","b"));//[a,b]
        System.out.println("sb = " + sb);
        System.out.println("sb.length() = " + sb.length());
        System.out.println("sb.capacity() = " + sb.capacity());
        sb.trimToSize();//kapasitesideki boşlukları temizlemekte
//        String arr[]= List.of(sb).toArray(new String[0]);
//        System.out.println(" = " +Arrays.toString(arr));



    }
}
