package day18_ImmutableAndPassBy__.mutable_unmutable;

import java.util.ArrayList;
import java.util.List;

public class Deneme {
    public static void main(String[] args) {
        String a ="";
        a+=2;
        a+='c';
        a+=false;
        //System.out.println(a); //2cfalse
        if (a=="2cfalse") System.out.println("==");
        if (a.equals("2cfalse")) System.out.println("equels");

        System.out.println("=========================================");
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        //list.add(7); // burada CTE verir
        for (String s :list) System.out.println(s);




    }
}
