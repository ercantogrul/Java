package day35_Lambda.DE35_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C08_match {
    /*
         Match operasyonu bir akışın belirli kriterleri sağlayıp sağlamadığını ölçmek için kullanılır.
        Map den farkı her iterasyonu tek tek değerlendirip sonucu yansıtmaz bunun yerine tüm koleksiyonu
        değerlendirerek sonucu yansıtmasıdır. Match operasyonunun 3 çeşit kullanımı bulunmaktadır;

            anyMath(): Vereceğimiz şarta bağlı olarak Stream içerisinde gezinir ve
            herhangi bir elemanla eşleşme durumunda true dönecektir.

            allMatch(): Verilen şarta göre Stream içerisindeki tüm elemanların
            bu şarta uyması durumunda true dönecektir.

            noneMatch(): Şarta göre Stream içindeki hiç bir
            elemanın şartı sağlamaması durumunda true dönecektir.
         */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList
                (11, 12, 7, 32,7 ,32, 41, 40, 32, 65, 41, 12, 7, 41, 43, 24, 32));
        System.out.println(list.stream().anyMatch(p -> p % 10 == 0)); // 10 a böünen varsa true, yoksa false
        System.out.println(list.stream().allMatch(p -> p % 2 == 0)); // false
        System.out.println(list.stream().map(p->p*2).allMatch(p -> p % 2 == 0)); // true
        System.out.println(list.stream().map(p->p*2).noneMatch(p -> p % 2 == 0)); // false
        System.out.println(list.stream().noneMatch(p -> p > 80));// (tumu false ise true)true
        // aynısını allMach ile yapalım
        System.out.println(list.stream().allMatch(p -> p <= 80));//



    }
}
