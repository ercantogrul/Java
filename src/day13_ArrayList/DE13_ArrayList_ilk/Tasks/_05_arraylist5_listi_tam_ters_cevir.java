package day13_ArrayList.DE13_ArrayList_ilk.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _05_arraylist5_listi_tam_ters_cevir {

    /*
        rotateList() isminde bir method oluşturun.
        Parametre olarak String ArrayList
        ArrayList'in dizilişini terse döndürün. (Tersten yazdırın)
        Tersten yazılmış halini return edin.
        Arraylist =  "New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"
        cevap: "Ohio" , "Florida" ,"Atlanta","New york" ,"New jersey"
     */

    public static void main(String[] args) {

       List<String> arrayList = new ArrayList<>(Arrays.asList("New jersey", "New york", "Atlanta", "Florida", "Ohio"));
        //ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("New jersey", "New york", "Atlanta", "Florida", "Ohio"));
        rotateList(arrayList);
        System.out.println(arrayList);



    }

    private static List rotateList(List<String> arrayList) {
       // private static ArrayList rotateList(ArrayList<String> arrayList)  // List veya ArrayList olarak da olur

        Collections.reverse(arrayList);
        return arrayList;


    }


}


