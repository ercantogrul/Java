package day13_ArrayList.DE13_ArrayList_ilk.Tasks;

import java.util.Arrays;
import java.util.List;

public class Task07__3ve8_elemanlarin_yerini_degistir {
    public static void main(String[] args) {
        /* TASK :
         * 10 elamanli bir list olusturun. Ardindan dizinin 3. elemani ile
         * 8. elemaninin yerlerini degistirin.
         *
         * ORNEK:
         *
         * INPUT : String[] isimler={"Haluk","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
         * OUTPUT : String[] isimler={"Haluk","Emin","Furkan","Kerem","Taylan","Orhan","Sinan","Kemal","Ahmet","Ali"};
         */

        String[] isimler={"Haluk","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};

        List<String> list = Arrays.asList(isimler);
        System.out.println("ilk list : "+list);

        String isim = list.get(2); // 3. eleman: index+1 deki elemandir
        list.set(2, list.get(7));
        list.set(7,isim);
        System.out.println("son list : "+list);




    }
}
