package day36_InterviewQuestions.Day05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q02_2D_CollectionsTask {
    // Create 2D ArrayList which can store String ArrayLists
    // Create 3 ArrayLists which are Employees, Employers, Companies
    // Store this 3 ArrayList in 2D ArrayList

    // String ArrayList'leri depolayabilen 2D ArrayList oluşturun
    // Çalışanlar, İşverenler, Şirketler olmak üzere 3 DiziListesi oluşturun
    // Bu 3 ArrayList'i 2D ArrayList'te saklayın

    public static void main(String[] args) {

        List<List<String>>  arrList = new ArrayList<>();

        List<String> calisanlar = new ArrayList<>(Arrays.asList("Hasan","Veli","Suzan"));
        List<String> isverenler = new ArrayList<>(Arrays.asList("Ali","Ahmet","Ayse"));
        List<String> sirketler = new ArrayList<>(Arrays.asList("Gida","Teknoloji"));

        arrList.add(calisanlar);
        arrList.add(isverenler);
        arrList.add(sirketler);
        System.out.println(arrList);



    }
}
