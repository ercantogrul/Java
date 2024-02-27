package day18_ImmutableAndPassBy__.mutable_unmutable;

import java.util.Arrays;

public class Mutuble {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Selam");
        StringBuilder sb2 = sb1;
        System.out.println(" Mutuble");
        sb2.append(" ahmet");
        sb1.append(" nasılsın");
        System.out.println(sb1);
        System.out.println(sb2);

        System.out.println("Inmutable");
        String s1 = "Selam";
        String s2 = s1 ;
        s2=s2+" ahmet";
        System.out.println(s1);
        System.out.println(s2);
        int[] arr = {2,2,2}; // mutuble
        metot(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void metot(int[] arr){
        arr[1] = 100;
    }
}
