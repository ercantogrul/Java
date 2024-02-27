package day36_InterviewQuestions;

import java.util.*;

public class List_i_Set_e_aktarma {

    // create an array of random numbers of size 10
    // convert that array into a list
    // convert list into set

    // 10 boyutunda rasgele sayılardan oluşan bir array oluştur
    // bu arrayi bir listeye dönüştür
    // listeyi sete çevir
    public static void main(String[] args) {

       Integer [] arr = new Integer[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= (int) (Math.random()*99+1);
        }
        System.out.println(Arrays.toString(arr));

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr)); //array liste cevirme
        System.out.println(list);

        List<Integer> list1 = Arrays.stream(arr).toList(); // stream ile array liste cevirme
        System.out.println(list1+"__");

        //birinci yol******************************
        Set<Integer> set = new HashSet<>(list);  // set e listi kolay aktarma
        System.out.println(set);
        //ikinci yol yol
        HashSet<Integer> set1 = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            set1.add(list.get(i));
        }
        System.out.println(set1);



    }


}
