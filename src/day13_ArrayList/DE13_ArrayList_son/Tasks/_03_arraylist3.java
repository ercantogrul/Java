package day13_ArrayList.DE13_ArrayList_son.Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class _03_arraylist3 {

    /*
        getLength() isminde bir method oluşturun.
        Parametre olarak String ArrayList
        Return tipi Integer ArrayList
        ArrayList içindeki her bir Stringin uzunluğunu bulunuz.

        Tüm elementlerin uzunluğunu döndürün

        Örneğin;
        ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"
        Tüm Stringlerin uzunluklarını yazdırın;
        cevap: 10 ,  8 , 4 , 7 , 6 olmalı
     */

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("New jersey", "New york", "Ohio", "Florida", "Boston"));

        ArrayList<Integer> uzunluklar = new ArrayList<>();
        uzunluklar = getLength(arrayList);

        System.out.println(uzunluklar);
    }

    private static ArrayList<Integer> getLength(ArrayList<String> arrayList) {
        ArrayList<Integer> uzunluklar = new ArrayList<>();
        for (int i = 0; i < arrayList.size() ; i++) {
            uzunluklar.add(arrayList.get(i).length());
        }
        return uzunluklar;
    }


}