package day13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C04_Remove {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Ankara", "Mersin", "Trabzon", "Izmir", "Samsun"));
        //String [] dizi =new String[10];

        System.out.println(list); //[Ankara, Mersin, Trabzon, Izmir, Samsun]

        // remove siler
        list.remove(0);  // 0. elemani siler ve o elemani bize döndürür.
        System.out.println(list);  //[Mersin, Trabzon, Izmir, Samsun]

        String str = list.remove(0); //Mersin i sildi
        System.out.println("=="+str); //Mersin

        list.remove(0);   //Trabzon u i sildi
        System.out.println(list);  // [Izmir, Samsun]


        //soru1: ilk elemani sona atin






    }
}
