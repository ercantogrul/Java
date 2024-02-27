package day13_ArrayList.DE13_ArrayList_son;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C14_ArrayToList {
    public static void main(String[] args) {
        String[] ulkeArr ={"Alamanya", "Güba", "Polkonya", "Dingiltere", "Amerigonya"};
        List<String> ulkeList= Arrays.asList(ulkeArr);//ulkeArr elemanları ulkelist'e atandı
        List<String> ulkeList2=List.of(ulkeArr); // aynı işi yapar
        System.out.println(ulkeList);
        System.out.println(ulkeList2);
    }
}
