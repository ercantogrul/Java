package day35_Lambda;

import java.util.*;

public class C06_Sorted_kucektenBuyuge_veya_tersi {
    public static void main(String[] args) {
          /*
   Sorted:
   Bazı durumlarda elimizde ki veri setini belirli bir parametreye göre sıralamak isteyebiliriz.
           2 türü bulunmaktadır. Birinci hali parametre almaz küçükten büyüğe şekilde sıralar.
   İkinci formatı ise Comparator arayüzünden türediği için
   bizim belirlemiş olduğumuz parametreye göre sıralama işlemi yapar.
    */
        List<Integer> list = new ArrayList<>(Arrays.asList(58,7,54,41,59,33,38,13,65,61,46,45,25,16));
        System.out.println(list);

        list=list.stream().sorted().toList(); //sondaki toList ile tekrar liste aktardik
        System.out.println(list); //kücükten büyüge dogru siraladi


        list=list.stream().sorted(Comparator.reverseOrder()).toList(); // buda büyükten kücüge dogru siralar
        System.out.println(list);
        //Collections.sort(list); // buda listi siralar

    }
}
