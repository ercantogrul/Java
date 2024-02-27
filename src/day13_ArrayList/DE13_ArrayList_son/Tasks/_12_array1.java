package day13_ArrayList.DE13_ArrayList_son.Tasks;

import java.util.ArrayList;

public class _12_array1 {

    /*
    dupicate() isminde bir method oluşturun.
    Parametresi int Array olmalı
    Return tipi boolean
    Eğer Array içinde çiftleme(yineleme) var ise true dönmeli.
    Eğer Array içinde çiftleme(yineleme) yok ise false dönmeli.
    
    Örnek1:
    Input: [1,2,3,1]
    Output: true

    Örnek 2:
    Input: [1,2,3,4]
    Output: false
         */

    public static void main(String[] args) {

        //    int[] arr = {1,2,3,1};
        int[] arr = {1, 2, 3, 4};

        boolean sonuc = dublicate(arr);
        if (sonuc) System.out.println("tekrar vardir");
        else System.out.println("tekrar yoktur");

    }

    private static boolean dublicate(int[] arr) {
        boolean tekrar=false;
        ArrayList<Integer> liste = new ArrayList<>();
        for (int i = 0; i < arr.length ; i++) liste.add(arr[i] );

        for (int i = 0; i < liste.size() ; i++) {
            int eleman = liste.get(i);
            int sonIndex=liste.lastIndexOf(eleman);
            System.out.println(i+" "+eleman+" "+ sonIndex);

            if (sonIndex != i ) tekrar=true;

        }
        return tekrar;
    }


}