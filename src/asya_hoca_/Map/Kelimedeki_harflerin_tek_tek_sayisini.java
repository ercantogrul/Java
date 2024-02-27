package asya_hoca_.Map;

import java.util.*;

public class Kelimedeki_harflerin_tek_tek_sayisini {
    public static void main(String[] args) {
        String str="çekoslovakyalılaştıramadıklarımızdanmısınız";
        //Harflerin sıklığını MAp üzerinde gösteriniz
        //OutPut:
        //{ç=1, e=1, k=3, o=2, s=2, l=4, v=1, a=7, y=1, ı=8, ş=1, t=1, r=2, m=3, d=2, z=2, n=2}


        Map<String, Integer> frequency = new LinkedHashMap<>();

        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split(""))); // kelimenin harfleri ile bir dizi olusturduk
       // String [] dizi = str.split("");

        for (String s : list){
            int count=Collections.frequency(list,s);//bir listede girilen elemanın kaç defa tekrar ettği bilgisini ınteger olarak
            frequency.put(s,count); // Map e verileri ekledik
        }
        System.out.println("frequency = " + frequency);


    }
}
