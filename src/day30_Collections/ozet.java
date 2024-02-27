package day30_Collections;

import java.util.*;

public class ozet {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("ali","12","c")); //sadece ayni data tütründe verilere eklenebilir
        System.out.println(list);  //[ali, 12, c]
        ArrayList<Object> list1 = new ArrayList<>(Arrays.asList("ali",12,'c')); // farkli data türünde veriler eklenebilir. bu da Object clasindan dolayi
        System.out.println(list1);  //[ali, 12, c]

        System.out.println("list1.clone() = " + list1.clone()); //list1.clone() = [ali, 12, c]
        //==============================================================


        List<Integer> list3 = new LinkedList<>(Arrays.asList(0,1,22,1,2,3,4,8,6,47,98,36));
        List<Integer> list4 = new LinkedList<>();
        Iterator<Integer> itr =list3.listIterator();
        while (itr.hasNext()) {
            if (itr.next()>4){


                //itr.remove();
            }
        }

        //System.out.println(list3); //[0, 1, 1, 2, 3, 4]



    }
}
