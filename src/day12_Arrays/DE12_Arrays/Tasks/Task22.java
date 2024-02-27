package day12_Arrays.DE12_Arrays.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {


    /*  Write a Java program to get a String from user as input and find the maximumCounts occurring character in that string.
         (Ignore case sensitivity)

         Girilen  string icinde en cok tekrar eden karakteri print eden code create ediniz.
       input :
       output: maximumCounts occurring character is : a
        */
        String str = "JavaCAN'lara selam olsuneeeee";
        int[] dizi = new int[str.length()];
        for (int i = 0; i <str.length() ; i++) {
            int sayi= str.length() - str.replace(str.substring(i,i+1),"").length();
            dizi[i]=sayi;
        }

        int enBuyuk=0;
        int index=0;
        for (int i = 0; i < dizi.length ; i++) {
            if (dizi[i]>enBuyuk) {
                enBuyuk = dizi[i];
                index=i;
            }
        }
        System.out.println("en cok tekrar edilen = "+str.charAt(index));

    }
}

