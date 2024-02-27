package day14_ForEachLoops.DE14_ForEachLoops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_ForEach {
    public static void main(String[] args) {
         /* neye yarar
        for-each loop for loop'un gelişmiş halıdir.
        1. clean code- yazım kolaylığı
        2. code okuma kolaylıgı
        3. hata yapma riskini azaltır.
        ****
        kuralları
        1- for-each, baştan sona gider
        2- listenin tümünü tarar
        3- mutlaka bir liste vardır(array,list,set,map,queue,varags)
         */
        List<Integer> sayiList =new ArrayList<>( Arrays.asList(16,21,33,54,15,45,58));


        // DataType  dataName : data kaynagı
        for (Integer deger : sayiList) {//Integer type'de deger'a sayıList'in her bir elemanı atandı
            System.out.print(deger);
        }
        System.out.println();
        // listin bir kısmını tarama ?
        // litenin ilk 5 elemanını yazdıralım
        for (Integer eleman : sayiList.subList(0,5)){
            System.out.print(eleman+ " ");
        }
        System.out.println();
        System.out.println();
        // for each kullanarak listeyi,başka bir liste ters-çevirin
        List<Integer> yeniList = new ArrayList<>();
        for (Integer eleman : sayiList){
            yeniList.addFirst(eleman);
            System.out.println(yeniList);
        }

    }
}
