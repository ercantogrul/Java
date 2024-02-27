package asya_hoca_.asya_hoca_25_10;

import java.util.Scanner;

public class s5__char_i {
    public static void main(String[] args) {  //Interview Question
        // 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.

        char ch =65;  System.out.println(ch);  // A
        char c ='0';   System.out.println(c);  //0
        char chh = 'M';   System.out.println(chh);  // M
        char c1 =0;  // 0 in karsiligi olan karakteri verir.


        for (int i = 0; i < 255; i++) {
            c = (char) i;  //c =i;
            System.out.print(i+"="+c+",");
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir sifre giriniz");
        String sifre = scan.nextLine();

        // ilk harf kücük harf olmali
        char ilkharf = sifre.charAt(0); // ilk karakteri veriri
        System.out.println(ilkharf);
        if (ilkharf>='a'&&ilkharf<='z');











    }
}
