package day13_ilk_13Ders_degerlendirme_sorulari.DE13Ilk13DersDegerlendirmeSorulari_ilk.Level_2;

import java.util.Scanner;

public class T05__a_yi_k_ve_k_yi_a_yazdir {
    public static void main(String[] args) {
        // Klavyeden okutulan stringin, içerisindeki "a" ları "k" , "k" ları ise "a" yapın
        Scanner scan = new Scanner(System.in);
        System.out.println("bir metin giriniz");
        String str = scan.nextLine();

        str= str.replace("a","*");
        str = str.replace("k","a");
        str= str.replace("*","k");
        System.out.println("str = " + str);


    }
}
