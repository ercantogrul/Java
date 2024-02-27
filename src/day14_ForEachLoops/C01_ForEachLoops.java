package day14_ForEachLoops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C01_ForEachLoops {
    public static void main(String[] args) {

        List<Integer> sayiList =new ArrayList<>( Arrays.asList(16,21,33,54,15,45,58));
        // DataType  dataName : data kaynagı
        for (Integer deger : sayiList) {//Integer type'de deger'a sayıList'in her bir elemanı atandı
            System.out.println(deger);
        }
        System.out.println();
        // listin bir kısmını tarama ?
        // litenin ilk 5 elemanını yazdıralım
        for (Integer eleman : sayiList.subList(0,5)){
            System.out.print(eleman+ " ");

        }

        //================== liste ters-çevirin sona yazdir============================================
        System.out.println();
      // for each kullanarak liteyi,başka bir liste ters-çevirin
        List<Integer> yeniList = new ArrayList<>();

        for (Integer eleman : sayiList) {       //  for (<dizinin veri tipi>  <sıra ile listenin elemanı> : <dizinin adı>) {
            yeniList.addFirst(eleman);          //  toplam += eleman;

        }System.out.println(yeniList);



    }

}
