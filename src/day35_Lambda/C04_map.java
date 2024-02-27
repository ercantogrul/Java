package day35_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_map {
    public static void main(String[] args) {
          /*
   Map :Stream içerisinde erişilen her bir eleman üzerinde işlem yapmamıza
   ve başka elemanlara dönüştürmemize imkan sağlayan
   findFirst / Last / sum
    */
        // API = Application Programming Interface,

        List<Integer> list = new ArrayList<>(Arrays.asList(11,12,7,32,7,32,41,41,32,68,41,12,7,41,43,24,32));
        System.out.println(list);

  // her bir elemana 5 ekle ve yazdir
        list = list.stream().map(p->p+5).toList();  // map talep edilen islemi yaptiriyor ve sonuc aliniyor
        System.out.println(list);
  // her bir elemani 2 ile carp ve yazdir
        List<Integer> list1 = new ArrayList<>(Arrays.asList(11,12,7,32,7,32,41,41,32,68,41,12,7,41,43,24,32));
        list1=list1.stream().map(p->p*2).toList();
        System.out.println(list1);

    //eleman ciftse true tekse false yazdirir  falsetruefalse seklinde
        List<Integer> list2 = new ArrayList<>(Arrays.asList(11,12,7,32,7,32,41,41,32,68,41,12,7,41,43,24,32));
        list2.stream().map(p->p%2==0).forEach(System.out::print); // ciftse true tekse false yazdirir
        System.out.println();
//****elemani  11 tek ,12 cift seklinde yazdir
        List<Integer> list3 = new ArrayList<>(Arrays.asList(11,12,7,32,7,32,41,41,32,68,41,12,7,41,43,24,32));
        list3.stream().map(p->p%2==0? p+" cift" :p+" tek").forEach(p-> System.out.print(p+", ")); // tek cift ve sayi lari yazdir

        System.out.println("\n=========================================");

//=============================================tek cift ve sayi lari yeni liste ekleme ve yazdirma===================================
        List<String> listYeni = new ArrayList<>();
        listYeni= list3.stream().map(p->p%2==0? p+" cift" :p+" tek").toList();
        System.out.println(listYeni);

        List<String> listYeni1 = new ArrayList<>();
        list3.stream().map(p->p%2==0? p+" cift" :p+" tek").forEach(p-> System.out.print(p+" "));
        System.out.print(listYeni1);
//================================method olusturarak tek cift ve sayi yazdirma===============================================================
        System.out.println("\n______________________________________");
        List<String> listYeni2 = new ArrayList<>();
        list3.stream().map(p->ciftTek(p)).forEach(System.out::print);
        System.out.println();
        list3.stream().map(C04_map::ciftTek).forEach(System.out::print); // yukardaki ile ayni




    }

    private static Object ciftTek(Integer p) {
        return p%2==0? p+" cift" :p+" tek";
    }
}
