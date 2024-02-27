package day35_Lambda;

import java.util.*;

public class C04_mapToInt {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(11,12,7,32,7,32,41,41,32,68,41,12,7,41,43,24,32));

        //list.stream().mapToInt(p->p*2).forEach(p->System.out.print(p+" "));

        int toplam = list.stream().mapToInt(p->p).sum();// sayilar toplandi
        System.out.println(toplam); //483

        System.out.println(list.stream().mapToInt(p->p).max()); // en büyük eleman.. OptionalInt[68]
        System.out.println("===========");
//=======================================================================================
        int enB = list.stream().mapToInt(p->p).max().getAsInt();
        System.out.println(enB); //68
        int enB1 = list.stream().mapToInt(p->p).max().stream().sum();
        System.out.println(enB1);//68

 //==========================================================================
        OptionalInt max = list.stream().mapToInt(p->p*2).max(); // list elemanlarinin 2 ile carpiminda en büyük sayiyi getir
        System.out.println(max); //OptionalInt[136] // matamatiksel islemlere girmedigi icin int e ceviririz
        System.out.println("max.getAsInt() = " + max.getAsInt()); // int e cevirdi max.getAsInt() = 136

        OptionalInt min = list.stream().mapToInt(p->p*2).min();
        System.out.println(min); //OptionalInt[14]

        int elemanSayisi = (int) list.stream().mapToInt(p->p*2).count();
        System.out.println(elemanSayisi);  //17


      



    }
}
