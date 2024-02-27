package day30_Collections.List;



import java.lang.reflect.Array;
import java.util.*;

public class ArrayAndList {
    public static void main(String[] args) {
        //ArrayList ve Linked Lİst farkları:
        /*
        -Array list 'te indeks yapısı mevcutttur.
        -Linked List pointer'ler mevcut
        -ArrayList'ler  aramalarda daha hızlı
        -Lİnked pointer olduğu için eleman ekleme ve çıkarmada daha hızlı
        -Her ikisi List interface üretilmiştir hemen hemen aynı metoları var
        -Lİnked list Queue interfacinide implement edip metotlarını kullanabilir
        -Listlerin tamamında tekrarlı veriler kullanılabilir.
        -Null verisinide ekleyebiliriz.
        -Lİstler ekleneiş sırasına göre sıralanır
         */

        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));//[1, 2, 3, 4, 5]
        System.out.println(list);

//       Integer a= list.element();//listenin ilk elemanını
//        System.out.println(a);
        Collection<Integer> listAdd = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));// ekleneck liste
        list.addAll(listAdd);
        System.out.println(list);//[1, 2, 3, 4, 5, 10, 20, 30, 40, 50]
        List<Integer> cloneList = new ArrayList<>();//boş liste
        cloneList = list;
        cloneList.addAll(list);
        System.out.println("cloneList = " + cloneList);
        if (cloneList == (list)) {
            System.out.println("Eşittir");
        }


    }
}
