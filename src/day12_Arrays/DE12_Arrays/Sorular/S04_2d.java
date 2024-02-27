package day12_Arrays.DE12_Arrays.Sorular;

import java.util.Arrays;

public class S04_2d {
    public static void main(String[] args) {
        String[][] str =
                {{"new jersey","atlanta","ohio"},
                {"Pittsburgh" ,"ohio","new york","ohio"},
                {"ohio","new york"}}
                ;
        System.out.print("{");
        for (int i = 0; i < str.length ; i++) {
            System.out.print(Arrays.toString(str[i]).replace("[","{").replace("]","}"));
            if (i==str.length-1) System.out.println("}");
                else System.out.println(",");
        }

        for (int i = 0; i < str.length ; i++) {
            String line = Arrays.toString(str[i]);
            line = "{"+line.substring(1, line.length()-1)+"}";
            System.out.println(line);
        }


    }
}
