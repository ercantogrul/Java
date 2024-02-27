package day12_Arrays.DE12_Arrays.Tasks02;

import java.util.Arrays;

public class T03 {
    public static void main(String[] args) {
        // Girilen bir int değerlerini rakamlara göre sıralayan kod create ediniz
        int num = 81763134;
        // input : 81763134;
        // output: 11334678
        // stringe cevir
        // stringi,  string dizisine çevir
        // sırala
        // diziyi str ye çevir
        // str yi int e çevir
        String str=""+num;
        String[] ch = str.split("");
        Arrays.sort(ch);
        str = Arrays.toString(ch).replaceAll("\\D","");
        num = Integer.parseInt(str);
        System.out.println(num);






    }
}
