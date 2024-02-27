package day29_Iterators_ListIterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C01_Iterators {
    public static void main(String[] args) {
        //Java’da coklu element iceren Array ve ArrayList gibi yapilarda, index kullanarak element’lere erisim ve update yapmak mumkundur.
        // Ancak Java’da coklu element iceren tum yapilar index kullanmaz.

        //Iterator, index kullanma’dan collection elementleri uzerinde gezinmemizi ve elementler uzerinde degisiklik yapmamizi saglar.
        //Iterator sinirli sayida method’a sahiptir.
        //ListIterator interface’i Iterator interface’inin child’i olarak olusturulmustur ancak daha fazla method bulundurmaktadir.
        //ListIterator ile collection elementleri uzerinde ileri veya geri hareket edebilir, elementleri update edebilir veya slime imkani tanir.
        //Ozellikle iterator.next( ) ve iterator.previous( ) method’larinin her kullanildiginda iterator’in hareket ettigini unutmamamiz gerekir.
        //Bir isleme baslamadan once iterator’un dogru konumda oldugundan ve uzerinde bir obje olup olmadigindan emin olmaliyiz, aksi takdirde exception’larla karsilasabiliriz.

        List<String> list = new ArrayList<>(Arrays.asList("Harika","Eda","Hasan","Ceren","Tugba","Taha","Ismail","Murat","Yahya","Hale"));
        Iterator<String>itr = list.listIterator();
        Iterator itr1 = list.listIterator(); // seklinde de yazabiliriz

        System.out.println("itr.next() = " + itr.next());
        System.out.println("itr.next() = " + itr.next());
        //System.out.println("itr.next() = " + itr.next());// sagda eleman yoksa hata veriri

        while (itr.hasNext()){ // saginda eleman varsa true yoksa false dönderir
            System.out.print(itr.next()+",");//.next () methodu, sagdaki elemani alir ve pointteri 1 ilerletir

        }
         // while icinde itr.next() ile son eleman alindi akabinde remove yapilinca
        itr.remove();// remove list icinde ki sondan point alip soldaki elemani siler yani Hale silinir
        System.out.println();
        System.out.println(list); // list yazdirilinca da eda list de de silindigini gördük
        System.out.println("bitti");


        System.out.println("==============================================================================");

        List<Integer> listInt = new ArrayList<>(Arrays.asList(4,2,6,11,7,43,2,8));
        Iterator<Integer>itrI = listInt.listIterator();
        while (itrI.hasNext()){ // saginda eleman varsa true yoksa false dönderir
            System.out.print( itrI.next()+",");//.next () methodu, sagdaki elemani alir ve pointteri 1 ilerletir
        }
        System.out.println("bitti 2");




    }
}
