package day13_ArrayList.DE13_ArrayList_son;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C11_replaceAll {
    public static void main(String[] args) {
        //(Collection) replaceall();-> List'te belirli bir elemanı belirli bir elemana update eder.treu/ false return eder
        List<String> iller = new ArrayList<>(Arrays.asList("Mardin","Urfa","Trabzon","Rize","Van","Urfa"));
        if (Collections.replaceAll(iller,"Urfa","Şurfa")) System.out.println("değişikli gerçekleşti");
        else System.out.println("değişen bişey yok");
        System.out.println(iller);
    }
}
