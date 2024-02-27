package asya_hoca_.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S06_String_to_Array_to_list {
    public static void main(String[] args) {
        //    //1.adim str tanimladik
        //    String str = "HeySiri";
//
        //    //2.adim HeySiri yi ByeSiri ye donustur
        //    str =str.replace("Hey", "Bye");
        //    System.out.println(str);
//
        //    String arr[] = new String[1];
        //    arr[0] =str;
        //    System.out.println(Arrays.toString(arr));

        String str = "HeySiri";

        //1.yol
        String str1=str.replaceAll("Hey","Bye");

        //2.yol
        String[] strArr=str.split("y");//[He,Siri]
        System.out.println(Arrays.toString(strArr));
        strArr[0]="Bye";
        System.out.println(Arrays.toString(strArr));

        str1=strArr[0]+strArr[1];//Concat
        System.out.println(str1);




    }
}
