package day36_InterviewQuestions.Day05;

import java.util.*;

public class Q03_CollectionsMethodsTask___ {
    // part 1: create list of 5 numbers from user input
    // sort the list in reverse order and print it
    // shuffle the list and print it
    // rotate right by 3 places and print it

    // bölüm 1: kullanıcı girişinden 5 sayı listesi oluşturun
    // listeyi ters sırada sırala ve yazdır
    // listeyi karıştır ve yazdır____
    // 3 yer sağa döndür ve yazdır____

    // part 2: find the max number and min number, print them
    // replace all max number with min number

    // bölüm 2: maksimum sayıyı ve minimum sayıyı bulun, yazdırın
    // tüm maksimum sayıları minimum sayı ile değiştir____
    public static void main(String[] args) {
        /* Scanner scanner = new Scanner(System.in);
        System.out.println("liste 5 sayi giriniz"); //9,4,8,2,7,13
        List<Integer> list = new ArrayList<>();
         for (int i = 1; i <= 5; i++) {
            System.out.println(i+" . sayi");
            list.add(scanner.nextInt());
        }
        System.out.println(list);
         */
        List<Integer> list = new ArrayList<>(Arrays.asList(21,15,2,33,4,5,7,9,21,12));

        //tersCevir(list);
        //karistir(list);
       // karistir2(list);
        //dondur3kez(list);
        //dondur3kez2(list);
       // maxMin(list);
        maxMinTausch(list);

    }

    private static void dondur3kez2(List<Integer> list) {
        Collections.rotate(list,3);
        System.out.println(list);
    }

    private static void dondur3kez(List<Integer> list) {
        for (int i = 0; i < 3; i++) {
            list.addFirst(list.removeLast());
        }
        System.out.println(list);
    }

    private static void karistir2(List<Integer> list) {
        for (int i = 0; i < 100; i++) {
            int idx = (int) (Math.random()* list.size());  // mevcut index ten bir tanesini üretitor
            list.addFirst(list.remove(idx));
        }System.out.println(list);
    }

    private static void karistir(List<Integer> list) {
        Collections.shuffle(list);
        System.out.println(list);
    }

    private static void maxMinTausch(List<Integer> list) {
        System.out.println(list);
        int min = Collections.min(list);
        int max = Collections.max(list);
        boolean bb;
      bb=Collections.replaceAll(list,Collections.max(list),Integer.MAX_VALUE);
      bb=Collections.replaceAll(list,Collections.min(list),max);
      bb=Collections.replaceAll(list,Integer.MAX_VALUE,min);
        System.out.println(list);
    }

    private static void tersCevir(List<Integer> list) {
        list=list.reversed();
        System.out.println(list);
    }

    private static void maxMin(List<Integer> list) {
        int max= Integer.MIN_VALUE;
        int min= Integer.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)>max) max= list.get(i);
            if (list.get(i)<min) min=  list.get(i);
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }

}
