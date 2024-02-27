package asya_hoca_.Array.Array_toplu;

import java.util.Arrays;

public class ArrayChangeWord {
    public static void main(String[] args) {
        /*  you have a string "HeySiri"
         * with arrays change it to "ByeSiri" and write changing array
         *(String iniz: "HeySiriHey"  Diziyi "ByeSiri" ye cevirin )
         *
         */
        
        String str="HeySiri";
        String arr[]=str.split("y");
        System.out.println(Arrays.toString(arr));
        arr[0]="Bye";
        System.out.println(Arrays.toString(arr));
        str=Arrays.toString(arr);
        str=str.replaceAll("\\W","");
        System.out.println("str = " + str);





    }
}
