package day13_ArrayList.DE13_ArrayList_ilk.Tasks;

import java.util.ArrayList;
import java.util.Collections;

public class _09_2dArray_with_arraylis___ {

    /*
    Bir tane 2d array [][]   oluşturun ve elemanları =  [  [ 1, 2, 3 ],  [ 4, 5, 6 ],  [ 7, 8, 9 ] ]
    Store all the elements in one arraylist and print the arraylist
    Tüm elemanları bir arrayListe yükleyin ve bu arrayList'i yazdırın.
    Örnek:
    Girdi:
    [
     [ 1, 2, 3 ],
     [ 4, 5, 6 ],
     [ 7, 8, 9 ]
    ]
    Çıktı: [1,2,3,4,5,6,7,8,9]
     */

    public static void main(String[] args) {

        int[][] arr2D = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                arrayList.add(arr2D[i][j]);    // arrayList.add(i,arr2D[i][j]);   arrayList bos oldugu icin i yazilmaz
            }
        }
        System.out.println(arrayList);



    }
}