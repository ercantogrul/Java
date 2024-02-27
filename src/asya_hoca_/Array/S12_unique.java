package asya_hoca_.Array;

import java.util.Arrays;

public class S12_unique {

    //String [] names={"ali","ayşe","john","ali","ayşe","john","asya"};
    //Verilen dizide unique karakteri bulun


    public static void main(String[] args) {

        String[] names = {"ali", "ayşe", "john", "ali", "ayşe", "john", "asya"};
        String str = Arrays.toString(names);
        System.out.println("str = " + str);

        for (int i = 0; i < names.length; i++) {

            if (str.substring(str.indexOf(names[i])+1).contains(names[i])) {
                str = str.replace(names[i], "");
            }
        }System.out.println("str = " + str.replaceAll("\\W",""));

        //===================ikinci yol======================================================
        System.out.println("======================================");

        for (int i = 0; i < names.length; i++) {
            for (int j = i+1; j < names.length; j++) {
                if (names[i].equals(names[j])) {
                    str = str.replace(names[i],"");
                    str= str.replace(names[j],"");
                }
            }
        }
        System.out.println(str);
        System.out.println("Unique karakter = " + str.replaceAll("\\W", ""));
        //==================

    }

}



