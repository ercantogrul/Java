package asya_hoca_.Lambda_Challange.Task2__;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class task222 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();


        list.add("Java");
        list.add("ogrenmek");
        list.add("cok");
        list.add("eglencelidi");
        list.add("lambda");
        list.add("gelince");
        list.add("Daha");
        list.add("da");
        list.add("Cok");
        list.add("Eglenceli");
        list.add("Oldu");
//        firstLetterDorC(list);
//        putStar(list);
//        sortOfList(list);
//        removeL(list);
//        list=makeListE(list);
//        System.out.println(list);
//        makeThree(list);


        printB(list);
        System.out.println();
        System.out.println(list);  // list i yazdik

        list=print4and6(list);
        System.out.println(list);


    }



    private static void firstLetterDorC(List<String> list) {
        // S1: ilk harfi d ve ya c olanlari listeleyelim
        list.stream().filter(t->t.startsWith("D")||t.startsWith("C")).forEach(t->System.out.print(t+" "));
        System.out.println();
    }



    private static void putStar(List<String> list) {
        // S2: tum stringlerin basina ve sonuna yildiz ekleyerek yazdiralim
        list.stream().map(x->"*"+x+"*").forEach(System.out::print);
        System.out.println();
    }



    private static void sortOfList(List<String> list) {
        //S3: alfabetik  olarak siralayalim list olarak ***sorted()
        list.stream().sorted().forEach(t->System.out.print(t+" "));
    }



    private static void removeL(List<String> list) {
        //S4: tum 'l' leri silelim yazdiralim ***map(replaceAll)
        list.stream().map(s->s.replaceAll("l","")).forEach(t->System.out.print(t+" "));
        System.out.println();

    }




    private static List<String> makeListE(List<String> list) {
        //S5 : icinde e olanlardan yeni bir list olusturunuz  *** filter(contains())  collect()
        return list.stream().filter(e->e.contains("e")).collect(Collectors.toList());
        //return list.stream().filter(e->e.contains("e")).toList();  // yada bu sekilde

    }



    // S6 : ilk harfini 3 kere tekrar edip yazalim ornek jjjava gibi
    //     ***map(t-< t.substring(0,1) + t-< t.substring(0,1) + t) forEach()
    private static void makeThree(List<String> list) {
        System.out.println();
        list.stream().map(t->t.substring(0,1).repeat(2)+t).forEach(t->System.out.print(t+" "));;
    }


    // S7: tum elemanlarin ilk harfini buyuk digerlerini kucuk yaziniz  *** map substring upperCase- lowerCase
    private static void printB(List<String> list) {
        System.out.println();
        list.stream().map(t->t.substring(0,1).toUpperCase()+t.substring(1).toLowerCase()).forEach(t->System.out.print(t+" "));
    }



    // S8: uzunlugu 4 ve 6 olanlar haric bir liste olusturunuz  ***filter length !=  collect  2.yol skip olabilir

    private static List<String>  print4and6(List<String> list) {
        System.out.println();
        return list.stream().filter(t->t.length()!=4 && t.length()!=6).collect(Collectors.toList());
        //return list.stream().filter(t->t.length()!=4 && t.length()!=6).toList(); // yada böyle
    }

}

