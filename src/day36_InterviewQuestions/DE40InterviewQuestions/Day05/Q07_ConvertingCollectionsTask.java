package day36_InterviewQuestions.DE40InterviewQuestions.Day05;

import java.util.*;

public class Q07_ConvertingCollectionsTask {

    // create an array of random numbers of size 10
    // convert that array into a list
    // convert list into set

    // 10 boyutunda rasgele sayılardan oluşan bir array oluştur
    // bu arrayi bir listeye dönüştür
    // listeyi sete çevir
    public static void main(String[] args) {
        int[] arr = new int[1000000];
        Integer[] arr2 = new Integer[1000000];
        List<Integer> list = new ArrayList<>();

        ;
        for (int i = 0; i <arr.length ; i++) {
            int sayi = (int) (Math.random()*10);
            arr[i] = sayi;
            arr2[i] = sayi;
        }
        long t0 = System.currentTimeMillis();
        List<Integer> list2 = new ArrayList<>(Arrays.asList(arr2));
        long t1 = System.currentTimeMillis();
        System.out.println("sure0 : "+ (t1-t0));
        list = Arrays.stream(arr).boxed().toList();
        long t2 = System.currentTimeMillis();
        System.out.println("sure : "+ (t2-t1));
        HashSet<Integer> set = new HashSet<>(list);
        long t3 = System.currentTimeMillis();
        System.out.println("sure2 : "+ (t3-t2));
//        System.out.println(Arrays.toString(arr));
//        System.out.println(list);
//        System.out.println(set);

    }


}
