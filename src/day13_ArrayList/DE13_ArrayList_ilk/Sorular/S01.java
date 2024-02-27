package day13_ArrayList.DE13_ArrayList_ilk.Sorular;

import java.util.ArrayList;

public class S01 {
    public static void main(String[] args) {
        // 20 bir arraylisti -5,+5 arasında sayılar ile doldurun sonra, -eksileri başa
        // artıları sona alın sıfırlar ortada kalsın
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            list.add((int) (Math.random()*11-5));
        }
        System.out.println(list);
        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i)==0) {
                list.addLast(list.remove(i));
            }
        }
        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i)>0) {
                list.addLast(list.remove(i));
            }
        }

        System.out.println(list);
    }
}
