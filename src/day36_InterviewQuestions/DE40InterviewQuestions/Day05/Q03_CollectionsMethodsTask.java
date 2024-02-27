package day36_InterviewQuestions.DE40InterviewQuestions.Day05;

import java.util.*;

public class Q03_CollectionsMethodsTask {
    // part 1: create list of 5 numbers from user input
    // sort the list in reverse order and print it
    // shuffle the list and print it
    // rotate right by 3 places and print it

    // bölüm 1: kullanıcı girişinden 5 sayı listesi oluşturun
    // listeyi ters sırada sırala ve yazdır
    // listeyi karıştır ve yazdır
    // 3 yer sağa döndür ve yazdır

    // part 2: find the max number and min number, print them
    // replace all max number with min number

    // bölüm 2: maksimum sayıyı ve minimum sayıyı bulun, yazdırın
    // tüm maksimum sayıları minimum sayı ile değiştir
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(21,15,2,33,4,5,33,6,2,8,9,10));
        List<String> list2 = new ArrayList<>(Arrays.asList("a","b","v","c","s","x"));

    //    tersSiralaYazdir(list);
    //    tersSiralaYazdir2(list);
       //   terseCevir(list);
         // karistir(list);
          //karistir2(list2);
        //  dondur3kez(list);
        //  dondur3kez2(list);
          minMaxDegistir(list);
            digerYontemler(list);
    }

    private static void digerYontemler(List<Integer> arrList) {

        Collections.sort(arrList,Collections.reverseOrder());
        System.out.println(arrList);
        Collections.shuffle(arrList);
        System.out.println(arrList);
        Collections.rotate(arrList,3);
        System.out.println(arrList);
        Integer max = Collections.max(arrList);
        Integer min = Collections.min(arrList);
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        Collections.replaceAll(arrList,max,min);
        System.out.println(arrList);

    }


    private static void minMaxDegistir(List<Integer> list) {
        // bu yanlış olmuş
        // sadece max ların min olması isteniyor, oysa biz maxlari min, min leri max yapmışız
        System.out.println(list);
        boolean bb;
        int min = Collections.min(list);
        int max = Collections.max(list);
        bb = Collections.replaceAll(list,Collections.max(list),Integer.MAX_VALUE);
        bb = Collections.replaceAll(list,Collections.min(list),max);
        bb = Collections.replaceAll(list,Integer.MAX_VALUE,min);

        System.out.println(list);


    }

    private static void dondur3kez2(List<Integer> list) {
        System.out.println(list);
        Collections.rotate(list,3);
        System.out.println(list);
    }

    private static void dondur3kez(List<Integer> list) {
        System.out.println(list);
        for (int i = 0; i <3 ; i++) {
            list.addFirst(list.removeLast());
        }
        System.out.println(list);
    }

    private static void karistir(List<Integer> list) {
        Collections.shuffle(list);
        System.out.println(list);
    }
    private static void karistir2(List<String> list) {
        System.out.println(list);
        for (int i = 0; i <10 ; i++) {
            int idx= (int) (Math.random()* list.size());
            list.addFirst(list.remove(idx));

            System.out.println(list);
        }
        System.out.println(list);
    }

    private static void terseCevir(List<Integer> list) {
        list=list.reversed();
        System.out.println(list);
    }

    private static void tersSiralaYazdir2(List<Integer> list){
          list = list.stream().sorted().toList().reversed();
        System.out.println(list);
        // veya
           list = list.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(list);
    }
    private static void tersSiralaYazdir(List<Integer> list) {
        System.out.println(list);


        // veya
        list.sort(Collections.reverseOrder());
        System.out.println(list);
        // veya
        System.out.println("--------");
        Collections.sort(list);
        System.out.println(list);
        list = list.reversed();
        System.out.println(list);
    }

}
