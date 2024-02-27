package day19_StringBuilder.DE19_StringBuilder.Tasks;

import java.util.Scanner;

public class Task01__ {
    public static void main(String[] args) {
        /*
        Task->
        	Bir cümleyi parametre olarak kabul eden, StringBuilder kullanarak cümleyi ters çeviren ve cümlenin palindrom
	        olup olmadığını kontrol eden (büyük/küçük harf duyarlılığı olmadan) METHOD create ediniz.
	     (without case sensitivity)
	     Eg : input : javaCAN'lara selam olsun :)
	     Output: "Reversed sentence : ): nuslo males aral'NACavaj
	        It is not a palindrome"
         */

        Scanner scan =new Scanner(System.in);
        System.out.println("bir cümle giriniz");
        String str = scan.nextLine();
        StringBuilder sb = new StringBuilder(str);

        tersSB(sb);



    }//main sonu



    private static void tersSB(StringBuilder sb) {
        System.out.println("girilen sb cümlesi : "+sb);

        StringBuilder terssb = sb.reverse();
        System.out.println("girilen SB index'e göre tersi = " + terssb);

        System.out.println("girilen sb cümlesi : "+sb); // sb nin kendiside ters cevrildi

        if (sb.equals(terssb)){
            System.out.println("cümle palindrom");
        }else System.out.println("cümle palindrom degildir");

    }


}//class sonu
