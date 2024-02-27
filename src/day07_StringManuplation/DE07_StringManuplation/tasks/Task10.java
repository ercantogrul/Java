package day07_StringManuplation.DE07_StringManuplation.tasks;

        import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        /* TASK :
         * Girilen  isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olmasını control eden code create ediniz
         */
        String name = "ali"; // ="";
        char h1 = name.charAt(0);
        char h2 = name.charAt(1);
        char h3 = name.charAt(2);
        int harfsayisi = name.replaceAll("[a-zA-Z]","").length();

        String sonuc = h1==h2 || h1==h3 || h2==h3 ? "Unique değildir" : "Unique dir";
        if (harfsayisi == 0 || name.length()==3)   System.out.println(sonuc);
        else System.out.println("3 karekter doğru verilmemiştir");


    }
}