package day32_Enum.ENUM1;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        Color r1 = Color.RED;
        Color r2 = Color.BALCK;
         //Color r3 = new Color(); hata verir böyle kullanilmaz

        System.out.println(Color.BLAU);
        //*****ordinal()
        System.out.println(Color.BLAU.ordinal()); // blau kacinci sirada 3. sirada

        Color [] renkler = Color.values();// Color sinifindan bir dizi olusturuldu
        System.out.println(Arrays.toString(renkler)); //ve yazdirildi

        // bunu bir String dizisine atayalim
        String [] colors = new String[renkler.length]; // eleman sayisi renkler dizisinin uzunlugu kadar
        for (int i = 0; i < renkler.length; i++) {
            colors [i] = renkler[i].toString(); // i elemani stringe cevirip color dizisinin i elemanina atadim.
        }
        System.out.println(Arrays.toString(colors));

        //*****compareTo( ) :enum un iki elemaninin arasinda kac sira oldugunu verir bize
        //RED 0, sirada ve BLAU 3. sirada yani (BLAUindxNo-REDindxNo=3) demektir
        System.out.println(Color.BLAU.compareTo(Color.RED)); //3
        System.out.println(Color.RED.compareTo(Color.BLAU)); //-3 veya (REDindxNo-BLAUindxNo=-3)
        // veya asagidaki ile ayni
        System.out.println(Color.BLAU.ordinal()-Color.RED.ordinal()); // 3



    }
}
