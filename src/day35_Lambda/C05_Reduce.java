package day35_Lambda;

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
        List<Integer> sayiList = new ArrayList<>(Arrays.asList(58,7,54,41,59,33,38,13,65,61,46,45,25,16));

        int toplam = sayiList.stream().reduce(0,(top,p)->top+p);System.out.println(toplam);

        toplam= sayiList.stream().reduce(0, Integer::sum);      System.out.println(toplam); // java bunu istiyor
        toplam= sayiList.stream().reduce(Integer::sum).get();          System.out.println(toplam);
        // 0 ilk deger sonra top genel sayi p ise her bir elemaan, elemanlari

        /*
        yukarda ki ile ayni
        int toplam2 =0;
        for (int i = 0; i < sayiList.size(); i++) {
            toplam2+=sayiList.get(i);
        }
         */
        int enBuyuk = sayiList.stream().reduce(sayiList.getFirst(),(enB,p)->enB>p ? enB:p); System.out.println(enBuyuk);
        enBuyuk = sayiList.stream().reduce(sayiList.getFirst(),Integer::max);               System.out.println(enBuyuk);
        enBuyuk = sayiList.stream().reduce(sayiList.getFirst(),Math::max);                  System.out.println(enBuyuk);
        enBuyuk = sayiList.stream().reduce(Integer::max).get();                             System.out.println(enBuyuk);



        //2. örnek
        //Array in toplamini bulduk
        int [] arr = {1,5,2,7,3,5};
        int arrToplam = Arrays.stream(arr).sum();
        System.out.println(arrToplam);

        //Listi Array a cevirdik
        int [] arr2 = sayiList.stream().mapToInt(p->p).toArray();




    }

}
