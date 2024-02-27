package day07_StringManuplation.DE07_StringManuplation_ilk.tasks;

        import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        /* TASK :
         * Girilen  isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olmasını control eden code create ediniz
         */

        Scanner scan =new Scanner(System.in);
        System.out.println("üc harfli bir isim giriniz: ");
        String str = scan.nextLine();

        String durum = str.charAt(0)==str.charAt(1) || str.charAt(0)== str.charAt(2)           // '||' ile
                || str.charAt(1)== str.charAt(2)?   "false" :"true";
        System.out.println(durum);

        // =============================== ikinci yöntem
        String durum2 = str.charAt(0)!=str.charAt(1) && str.charAt(0) != str.charAt(2)            // '&&' ile
                && str.charAt(1)!= str.charAt(2)?   "true" :"false";
        System.out.println(durum2);

        //=================ucuncu yontem
        String name = "ali";

        char h1 =name.charAt(0);
        char h2 =name.charAt(1);
        char h3 =name.charAt(2);
        String sonuc = h1==h2||h1==h3||h2==h2? "unuque degildir" : "unique dir";
        System.out.println(sonuc);



    }
}