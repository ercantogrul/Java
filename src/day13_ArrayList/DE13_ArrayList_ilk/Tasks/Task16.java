package day13_ArrayList.DE13_ArrayList_ilk.Tasks;

import java.util.ArrayList;
import java.util.List;

public class Task16 {

    /*
      Task:

    Create 2D ArrayList which can store String ArrayLists
    Create 3 ArrayLists which are Employees, Employers, Companies
    Store this 3 ArrayList in 2D ArrayList
    String ArrayList'leri depolayabilen 2D ArrayList oluşturun
    Çalışanlar, İşverenler, Şirketler olmak üzere 3 DiziListesi oluşturun
    Bu 3 ArrayList'i 2D ArrayList'te saklayın
     */

    public static void main(String[] args) {

        ArrayList<String> list= new ArrayList<>(List.of("Çalışanlar"));
        ArrayList<String> list1= new ArrayList<>(List.of("İşverenler"));
        ArrayList<String> list2= new ArrayList<>(List.of("Şirketler"));

        List<ArrayList<String>> listler = new ArrayList<>();
        listler.add(list);
        listler.add(list1);
        listler.add(list2);

        System.out.println("2D ArrayList : "+listler);





    }
}
