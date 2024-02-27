package day12_Arrays.DE12_Arrays_ilk.Tasks;

import java.util.Arrays;

public class _14_String_method_replace {

    public static void main(String[] args) {

        /*
        Bu String'i oluşturunuz.  "Hello World"
        "o" harfleri yerine "K" yerleştiriniz.
        Sonuç bu şekilde olmalıdır:
        HellK WKrld
         */
        String str1 = "Hello World";
        String yeni = str1.replace("o","K");
        System.out.println(yeni);

        //====================================================

        String [] array = {"Hello World"};
        String str = Arrays.toString(array);
        str = str.replace("o","K"); //[HellK WKrld]
        str = str.substring(1,str.length()-2); //HellK WKrld

        String [] yeniarray =str.split( "0");
        System.out.println(Arrays.toString(yeniarray)); //[HellK WKrl]

        //============================================
















        char[] arr = str.toCharArray();

        for (int i = 0; i < array.length; i++) {
            if (arr[i] == 'o') {
                arr[i] = 'K';
            }
        }
        System.out.println("yeni array = " + Arrays.toString(arr));



    }
}