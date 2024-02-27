package day12_Arrays.DE12_Arrays_ilk.Tasks;

import java.util.Arrays;

public class Task22_enCokTekrarEdenKarakterler___ {
    public static void main(String[] args) {


    /*  Write a Java program to get a String from user as input and find the maximumCounts occurring character in that string.
         (Ignore case sensitivity)

         Girilen  string icinde en cok tekrar eden karakteri print eden code create ediniz.
       input : JavaCAN'lara selam olsun
       output: maximumCounts occurring character is : a
        */
        String str = "JavaCAN'lara selam olsun";

        String[] arr = str.split("");
        System.out.println(Arrays.toString(arr)); //[J, a, v, a, C, A, N, ', l, a, r, a,  , s, e, l, a, m,  , o, l, s, u, n]

        int enBuyuk = 0;
        String enB = "";
        int count = 0;// icerdeki for dan cikinca sifirlanmali, yoksa üstün yazdirir

        for (int i = 0; i < arr.length; i++) {
            count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].equals(arr[j]))
                    count++;
            }
            if (count > enBuyuk) {
                enBuyuk = count;
                enB = arr[i];
            }
        }
        System.out.println();
        System.out.println("max kullanilan karakter: "+ enB);
        System.out.println("max kullanilan karakter sayisi: "+ enBuyuk);




        
    }
}
