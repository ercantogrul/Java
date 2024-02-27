package day13_ArrayList.DE13_ArrayList_ilk;

import java.util.ArrayList;
import java.util.Arrays;

public class C13_listToArray {
    public static void main(String[] args) {
        //list'iarray'e cevirme ->toArray();

        //1. yontem -> toArray(String[0]); toArray() parametre olarak String[0] olarak eklenir..
        ArrayList<String> ulkelist = new ArrayList<>(Arrays.asList("Almanya", "Güba", "Poya", "ing", "Amerika"));
        String[] ulkeL  = ulkelist.toArray(new String[0]);
        String[] ulkeL2 = ulkelist.toArray(new String[10]);
        // new String[0], sıfır veya ulkelist.size() dan küçük değer girilirse, ülkelisti alır
        // daha nüyük bi değer girilirse , ülkelist i alır daha sonra o değere kadar olan elemanları null yapar
        System.out.println(Arrays.asList(ulkeL));
        System.out.println(Arrays.toString(ulkeL2));

        // 2.yontem?
        Object ulkeL3 = ulkelist.toArray(); // sadece obje class için geçerli

        /*
        System.out.println("ulkelist = " + ulkelist);//[Alamanya, Güba, Polkonya, Dingiltere, Amerigonya]
        String[] ulkeArr =ulkelist.toArray(new String[0]);// ulkelist elelmanları toArray method ile ulkeArr atandı
        System.out.println("Arrays.toString(ulkeArr) = " + Arrays.toString(ulkeArr));//[Alamanya, Güba, Polkonya, Dingiltere, Amerigonya]

        //2. yöntem-> tanımlanan Array'in data type Object(Hz.ADEM) olarak tanımlanır..
        //Trick-> Object Class java'da tanımlı tum class'ların parent(atası) olarak tanımlanır...
        //String Integer double etc. class'lar Object child(evladı) oldugu için istene durumlarda data type olarak kullanılabilir..

        Object[] ulkeArr1 =ulkelist.toArray();//list elelmanları toArray method ile Object data type ulkeArr atandı
        System.out.println("Arrays.toString(ulkeArr1) = " + Arrays.toString(ulkeArr1));//[Alamanya, Güba, Polkonya, Dingiltere, Amerigonya]
*/
    }
}
