package day36_InterviewQuestions.DE40InterviewQuestions.Day05;

import java.util.*;

public class Q06_AddedOrNotTask {

    // create a list of numbers 1, 3, 1, 2, 4, 5, 3 --> 2 duplicates
    // count how many duplicates we have
    // find out what are the duplicated values

    // 1, 3, 1, 2, 4, 5, 3 sayılarının bir listesini oluşturun --> 2 kopya
    // kaç tane tekrarli eleman olduğunu sayin
    // yinelenen değerlerin ne olduğunu öğrenin
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i <20 ; i++) {
            int sayi = (int) (Math.random()*10);

            list2.add(sayi);
            list.add(sayi);
        }

       cozum1(list);
       cozum2(list2);



    }
    private static void cozum2(List<Integer> list){
        int counter=0; // 3,5,6,7,3,3,3
        while (!list.isEmpty()) {
            int eleman = list.getFirst(); //3 , 5
            int oldSize= list.size(); // 7    , 3
            list.removeIf(p->p.equals(eleman)); // 5,6,7 // 6,7
            int silinenSayi=oldSize - list.size();//4  // 2
            if (silinenSayi>1) {
                //tekrarlanandır
                counter++;
                System.out.println(eleman+" "+ silinenSayi+" kez tekrarlanmıştır");
            } else {
                // tekrarlanmayandır
            }

        }
        System.out.println(counter+" adet sayı tekrarlanmıstır");
    }

    private static void cozum1(List<Integer> list){
        System.out.println(list);
        List<Integer> tekrarlanan = new ArrayList<>();

        for (int i = 0; i < list.size() ; i++) {
            for (int j = i+1; j < list.size() ; j++) {
                if (list.get(i).equals(list.get(j))) {
                    if (!tekrarlanan.contains(list.get(i)))
                        tekrarlanan.add(list.get(i));
                }
            }
        }

        System.out.println(tekrarlanan);
        System.out.println(tekrarlanan.size());

    }

}
