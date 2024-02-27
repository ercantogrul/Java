package day35_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C08_match {
    public static void main(String[] args) {
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
        List<Integer> list = new ArrayList<>(Arrays.asList(58,7,54,46,54,33,54,13,65,61,40,45,25,16));
        System.out.println(list);

        System.out.println(list.stream().anyMatch(p->p%10==0));// iclerinde 10 a bölünen bir tane dahi varsa true yoksa false döndürür // true

        System.out.println(list.stream().allMatch(p->p%2==0)); // listin hepsi 2 ye bölünüyorsa true //false

        System.out.println(list.stream().map(p->p*2).allMatch((p->p%2==0))); // listin hepsi 2 ye bölünüyorsa true // map ile her elemani cift yaptiktrue
        System.out.println("================");
        System.out.println(list.stream().noneMatch((p->p>80))); // hic bir eleman 80 den büyük degil ise true  //true
        System.out.println(list.stream().allMatch((p->p<80))); // bütün elemanlar 80 de kücük ise true  //true



    }
}
