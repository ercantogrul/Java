package day35_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09_skip_limit {
    public static void main(String[] args) {
         /*  Limit(n)
    Elimizde var olan bir veri kaynağını, göstermek istediğimiz kadarını göstermemize
    yarayan, sınırlandıran bir metoddur. Parametre olarak vereceğimiz rakamla aslında
    Stream içerisinde dönen çok sayıda veri var
    ancak sen bize şu kadarını göster diyoruz.
skip(1) => atlama demek. Akışın ilk n elemanını attıktan sonra bu akışın
    kalan elemanlarından oluşan bir akış döndürür. Bu akış n'den daha az öğe içeriyorsa,
    boş bir akış döndürülür. Bu, durum bilgisi olan bir ara işlemdir.
    skip(list.size()-1) => List’in uzunluğunun 1 eksiğini yazarsak son elemanı yazdırırız.

     */
        List<Integer> list = new ArrayList<>(Arrays.asList(58,7,54,46,54,33,54,13,65,61,46,45,25,16));
        System.out.println(list);
        List<Integer> list2 =list.stream().limit(10).toList(); // ilk 10 elemani alir
        System.out.println(list2);

        List<Integer> list3 = list.stream().skip(10).toList(); // 10 dan sonraki elemanlari verir
        System.out.println(list3);


    }
}