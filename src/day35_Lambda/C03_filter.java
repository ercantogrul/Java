package day35_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class C03_filter {
    public static void main(String[] args) {
         /*
    Filter:
   Dizimiz veya Collection’ımız üzerinde bizim belirteceğimiz koşullar doğrultusunda
   filtreleme işlemi yapmamıza yarayan bir yapıdır.
   Bu işlem sonrası belirttiğimiz koşula uygun olmayan elemanlar bir sonraki aşamada kullanılamazlar.
   Artık elimizde filtrelenmiş/süzülmüş/elenmiş bir veri vardır
    */

        List<Integer> list = new ArrayList<>(Arrays.asList(11,12,7,32,7,32,41,41,32,68,41,12,7,41,43,24,32));

        Stream<Integer> akis = list.stream().filter(p->p>30); // 30 dan büyük olanlari stream a aktardik
        akis.forEach(p-> System.out.print(p+" "));

        System.out.println("\n"+list); // list degismemisti ilk haliyle yazdi
        list = list.stream().filter(p->p>30).filter(p->p<40).toList();
        System.out.println("\n"+list); // 30 ile 40 arasindaki sayilari liste to.list() ile aktardik

        //===============================================================
        // true ise al stream'e false ise alma..(elde bir stream var) forEAch ile sadece cift elemanlari verir
        list.stream().filter(p->p%2==0).forEach(p-> System.out.print(p+" "));
        System.out.println("\n"+list);  // listi tekrar yazdik

        list=list.stream().filter(p->p%2==0).toList(); // süzülen haliyle stream i tekrar liste aktardik
        System.out.println(list); // cift olanlari liste aktardik
        //===============================================================

    }
}
