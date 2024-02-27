package day35_Lambda.DE35_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class C03_filter {
    /*
    Filter:
   Dizimiz veya Collection’ımız üzerinde bizim belirteceğimiz koşullar doğrultusunda
   filtreleme işlemi yapmamıza yarayan bir yapıdır.
   Bu işlem sonrası belirttiğimiz koşula uygun olmayan elemanlar bir sonraki aşamada kullanılamazlar.
   Artık elimizde filtrelenmiş/süzülmüş/elenmiş bir veri vardır
    */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList
                (11, 12, 7, 32,7 ,32, 41, 41, 32, 68, 41, 12, 7, 41, 43, 24, 32));
        list = list.stream().filter(p->p>30).filter(p->p<40).toList();


        System.out.println("\n"+list);
    }

}
