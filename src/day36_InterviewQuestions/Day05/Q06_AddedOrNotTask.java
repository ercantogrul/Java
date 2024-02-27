package day36_InterviewQuestions.Day05;

import java.util.*;

public class Q06_AddedOrNotTask {

    // create a list of numbers 1, 3, 1, 2, 4, 5, 3 --> 2 duplicates
    // count how many duplicates we have
    // find out what are the duplicated values

    // 1, 3, 1, 2, 4, 5, 3 sayılarının bir listesini oluşturun --> 2 kopya
    // kaç tane tekrarli eleman olduğunu sayin
    // yinelenen değerlerin ne olduğunu öğrenin
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 1, 2, 4, 5, 3));
        list.addAll(list);// 2 kopya olusturuldu
        System.out.println(list);


        ArrayList<Integer> yeniList = new ArrayList<>();
        int count=0;
        for (int i = 0; i < list.size(); i++) {
            count=0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))){
                    count++;
                }
            }
            if (!yeniList.contains(list.get(i))){
                yeniList.add(list.get(i));
                System.out.println(list.get(i)+"--"+count+" adettir"); // list icindeki her bir sayinin kac adet oldugu
            }
        }
        System.out.println("Tekrarlanan elemanlar = " + yeniList);


    }

}
