package day35_Lambda.DE35_Lambda.Tasks02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task02_01 {
    /*
    Stream içerisinde sadece reduce kullanarak list içerisindeki tek sayıların toplamını
bulunuz
     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>
                (Arrays.asList(58, 7, 54, 46, 54, 7, 38, 7, 7, 61, 46, 45, 25, 16));
        System.out.println(list);

        int toplam = list.stream().reduce(0,(top,p)->top+(p%2==0? 0:p));System.out.println(toplam);

    }
}
