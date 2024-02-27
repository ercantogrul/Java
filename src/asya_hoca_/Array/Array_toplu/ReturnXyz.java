package asya_hoca_.Array.Array_toplu;

import java.util.Scanner;

public class ReturnXyz {
    public static void main(String[] args) {
        /* Task->
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod create ediniz.
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();//melek
        String str2 = scanner.next();//melek


        System.out.println(checkXyz(str));

        if (checkXyz(str)) {//return type boolean olduğu için
            System.out.println("");
        }


    }

    private static boolean checkXyz(String str) {//returnt type boolean
        return str.contains("xyz");
    }

    private static boolean checkXyz(String str,String str2) {//parametre sayısı değiştirilerek overloading
        if (str.contains("xyz")&& str.contains("xyz")){
            return true;
        }
        else return false;
    }



    /*
    * Method overloading yapabilmemmiz signuture' değiştirmek zorundayız
    * Veri tipi veya sayısını değiştirerek
    * */
}
