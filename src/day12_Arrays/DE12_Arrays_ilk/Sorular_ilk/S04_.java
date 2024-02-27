package day12_Arrays.DE12_Arrays_ilk.Sorular_ilk;

import java.util.Arrays;

public class S04_ {
    public static void main(String[] args) {
        String[][] arr = {{"new jersey", "atlanta", "ohio"}, {"Pittsburgh", "ohio", "new york", "ohio"}, {"ohio", "new york"}};
        // arrays.toString i kullanarak

        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(Arrays.toString(arr[i]).replace("[", "{").replace("]", "}"));
            if (i == arr.length - 1) System.out.println("}");
            else System.out.println(",");
        }

        System.out.println("ikinci yol================================");
        for (int i = 0; i < arr.length; i++) {
            String line = Arrays.toString(arr[i]);
            line = "{"+line.substring(1,line.length()-1)+"}";
            System.out.println(line);

        }


    }
}
