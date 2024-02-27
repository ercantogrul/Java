package day13_ArrayList.DE13_ArrayList_ilk.Tasks;

import java.util.ArrayList;

public class _12_array1__ciftleme_yenileme {

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

        System.out.println("dupicate(arr) = " + dupicate(arr));

    }

    private static boolean dupicate(int[] arr) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        System.out.println(list);

        boolean flag = true;
        for (int i = 0; i < list.size(); i++) {
          if (list.indexOf(i)!=list.lastIndexOf(i)){
              flag=true;break;
          }else {
              flag =false;
          }

        }
        return flag;


    }


}