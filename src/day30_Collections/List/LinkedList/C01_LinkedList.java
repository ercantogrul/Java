package day30_Collections.List.LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class C01_LinkedList {
    public static void main(String[] args) {

        //Colections lar = 1-List 2-Queue 3-Set 3 tanedir

        //bir diziye aradan cok fazla eleman ekleme veya silme islemi yapiliyorsa LinkedList daha hizli oldugu icin avantajli [sona eklemede Arraylist avantajli]
        //Listedeki bir elemana ulasmak icin index tabanli olan Arraylist daha avantajli

        LinkedList<Integer> lList = new LinkedList<>();


        ArrayList<Integer> aList = new ArrayList<>();
        Queue<String> q =new LinkedList<>(Arrays.asList("javaCan","javasu","javaNaz")) ;

        q.add("Ali");//ekliyor
        System.out.println(q); //[javaCan, javasu, javaNaz, Ali]

        System.out.println("q.peek() = " + q.peek());  //javaCan  //ilk elemani getiriyor
        System.out.println(q); //[javaCan, javasu, javaNaz, Ali]
        System.out.println("q.element() = " + q.element()); //ayni
        System.out.println(q);


        System.out.println("q.poll() = " + q.poll()); //q.poll() = ilk elemani siliyor
        System.out.println(q); //[javasu, javaNaz, Ali, Kamil]
        System.out.println("q.remove() = " + q.remove());  //q.remove() = javasu
        System.out.println(q);


        System.out.println("q.offer(\"aaa\") = " + q.offer("aaa"));
        System.out.println(q);





    }
}
