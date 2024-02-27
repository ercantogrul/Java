package day13_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class contains {
    public static void main(String[] args) {
        List<String > list1=new ArrayList<>();
        List<Integer >list2=new ArrayList<>();
        list2.add(1564);
        list1.add("1564");
        String str="1564";

        System.out.println(list2.contains(15));//ınt olduğu için
        System.out.println(list1.get(0).contains("15"));//String contains method
        if (str.contains("15")){//String method
            System.out.println(true);
        }
    }
}
