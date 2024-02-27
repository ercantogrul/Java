package day07_StringManuplation.DE07_StringManuplation_ilk;

import java.util.Arrays;

public class C19_split_string_dizisi_yapar {
    public static void main(String[] args) {

        //bir Stringi alt Stringlere böler. String [] döndürür.

        String str = "Merhaba Dunya nereye kdjh a dfkjh";

        String [] sDizisi =str.split("a");
        System.out.println(Arrays.toString(sDizisi));  //[Merh, b,  Duny,  nereye kdjh ,  dfkjh] ( a yi baz alarak

        String [] sDizisi2 =str.split(" ");
        System.out.println(Arrays.toString(sDizisi2)); // [Merhaba, Dunya, nereye, kdjh, a, dfkjh] bosluklari baz alarak kelimelere bölmek

        for (int i = 0; i < sDizisi2.length; i++) {
            System.out.println(sDizisi2[i]);
        }
        System.out.println("===================================");

        String [] sDizisi3 =str.split(" ",3); //3 elemanli bir dizi olusturur
        System.out.println(Arrays.toString(sDizisi3));  //[Merhaba, Dunya, nereye kdjh a dfkjh]

    }
}
