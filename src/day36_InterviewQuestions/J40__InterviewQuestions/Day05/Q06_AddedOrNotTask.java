package day36_InterviewQuestions.J40__InterviewQuestions.Day05;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q06_AddedOrNotTask {

    // create a list of numbers 1, 3, 1, 2, 4, 5, 3 --> 2 duplicates
    // count how many duplicates we have
    // find out what are the duplicated values

    // 1, 3, 1, 2, 4, 5, 3 sayılarının bir listesini oluşturun --> 2 kopya
    // kaç tane tekrarli eleman olduğunu sayin
    // yinelenen değerlerin ne olduğunu öğrenin
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        numbers.add(4);
        numbers.add(5);
        numbers.add(3);
        // bu cozum hatalı ama bu örnek için doğru çalışıyor, altta 2 çözüm var
        Set<Integer> uniqeNumbers = new HashSet<>();
        List<Integer> duplicateNumbers = new ArrayList<>();
        for (int i = 0; i <numbers.size() ; i++) {
            boolean varMi = uniqeNumbers.add(numbers.get(i));
            if (!varMi) duplicateNumbers.add(numbers.get(i));
        }
        System.out.println("duplicateNumbers = " + duplicateNumbers);
        System.out.println("Tekrarlanan eleman sayısı = "+duplicateNumbers.size());
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
    private static void cozum2(List<Integer> list){
        int counter=0;
        do {
            int eleman = list.get(0);
            int oldSize= list.size();
            list.removeIf(p->p.equals(eleman));
            int silinenSayi=oldSize - list.size();
            if (silinenSayi>1) {
                //tekrarlanandır
                counter++;
                System.out.println(eleman+" "+ silinenSayi+" kez tekrarlanmıştır");
            } else {
                // tekrarlanmayandır
            }

        } while (!list.isEmpty());
        System.out.println(counter+" adet sayı tekrarlanmıstır");
    }
}
