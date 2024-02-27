package day35_Lambda.DE35_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_Reduce {
     /*
        reduce()-->azaltmak ... bir cok datayi tek bir dataya(max min carp top vs islemlerde) cevirmek icin kullanilir.
        kullanımı yaygındır pratiktir.
        Bir Stream içerisindeki verilerin teker teker işlenmesidir. Teker teker işleme sürecinde,
        bir önceki adımda elde edilen sonuç bir sonraki adıma girdi olarak sunulmaktadır.
        Bu sayede yığılımlı bir hesaplama süreci elde edilmiş olmaktadır.
        reduce metodu ilk parametrede identity değeri, ikinci parametrede ise BinaryOperator türünden bir obj kullanılır.
        reduce işleminde bir önceki hesaplanmış değer ile sıradaki değer bir işleme tabi tutulmaktadır.
        İşleme başlarken bir önceki değer olmadığı için bu değer identity parametresinde tanımlanmaktadır.

        */
     public static void main(String[] args) {
         List<Integer> list = new ArrayList<>(Arrays.asList(58, 7, 54, 41, 59, 33, 38, 13, 65, 61, 46, 45, 25, 16));
         // dizinin toplamını bulalım
         int toplam = list.stream().reduce(0,(top,p)->top+p);   System.out.println(toplam);

         toplam = list.stream().reduce(0,Integer::sum);         System.out.println(toplam);// en iyisi
         toplam = list.stream().reduce(Integer::sum).get();            System.out.println(toplam);



       /* yukarıdaki bunun aynısı
         int toplam2=0;
         for (int i = 0; i < list.size() ; i++) toplam2= toplam + list.get(i);
         */

         int enBuyuk = list.stream().reduce(list.getFirst(),(eb,p)->eb>p? eb:p); System.out.println(enBuyuk);
         enBuyuk = list.stream().reduce(list.getFirst(),Integer::max);   System.out.println(enBuyuk);
         enBuyuk = list.stream().reduce(list.getFirst(),Math::max);      System.out.println(enBuyuk);
         enBuyuk = list.stream().reduce(Integer::max).get();             System.out.println(enBuyuk);

         enBuyuk = list.stream().reduce(list.getFirst(),Integer::max);


         int[] arr = {1,5,2,7,3,5};
         // arr nin toplamını bulalım
         int arrToplam = Arrays.stream(arr).sum();

     // list i array a çevirelim
         int[] arr2 = list.stream().mapToInt(p->p).toArray();



     }
}
