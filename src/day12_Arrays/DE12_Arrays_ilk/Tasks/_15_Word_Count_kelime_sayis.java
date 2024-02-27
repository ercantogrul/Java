package day12_Arrays.DE12_Arrays_ilk.Tasks;

import java.util.Arrays;

public class _15_Word_Count_kelime_sayis {

    public static void main(String[] args) {

        /*
        Bu String'i oluşturun. "Removes white space from both ends of a string"
        String'deki kelime sayısını yazdırınız.
         */

        //Kodu aşağıya yazınız.
        String str = "Removes white space from both ends of a string";

        //method1(str);
        //method2(str);
        method3(str);

    }

    private static void method3(String str) {
        int strlenght = str.length();
        int bGit_Sonrasi= str.replace(" ","").length();
        int kelimesayisi = strlenght-bGit_Sonrasi+1;  // son kelime icin +1
        System.out.println("kelime sayisi cozum3:"+kelimesayisi);
    }

    private static void method2(String str) {
        int counter =1;
        for (int i = 0; i < str.length(); i++) {
            str = str.substring(str.indexOf(" ")+1);
            counter++;

        }
        System.out.println("kelime sayisi cozum2: "+counter);
    }


    private static void method1(String str) {
        String [] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));
        int kelimeSayisi= arr.length;
        System.out.println(kelimeSayisi);
    }
}