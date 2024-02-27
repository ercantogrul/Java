package day13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C03_Get {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Ankara","Mersin","Trabzon","Izmir","Samsun"));
        //String [] dizi =new String[10];

        System.out.println(list); //[Ankara, Mersin, Trabzon, Izmir, Samsun]

        // *** Get *** dizide istenen eleman aliniyor, list i degistirmez
        String sehir = list.get(0);  // ilk elemani al sehir variable na aktar // sehir = dizi[0]
        System.out.println(sehir);  //Ankara

        System.out.println(list.getFirst());// ilk elemani alip yazar //Ankara

        System.out.println(list.getLast()); // // son elemani alip yazar //Samsun
        sehir= list.get(list.size()-1);  // üstteki ile ayni
        System.out.println(sehir);  //Samsun

        // get list de bir degisiklik yapmaz. list ayni kalir
        System.out.println(list);  //[Ankara, Mersin, Trabzon, Izmir, Samsun]




    }
}
