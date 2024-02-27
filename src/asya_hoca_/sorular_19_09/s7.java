package asya_hoca_.sorular_19_09;

import java.util.Scanner;

public class s7 {
    public static void main(String[] args) {
        // kullanıcıdan yaşadığı şehri girmesini isteyiniz.
         //eğer ilk ve son A/a ise "doğru şehir " yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.print(" bir sehir ismi giriniz: ");
        String str = scan.nextLine();

        if ( str.toUpperCase().startsWith("A") &&  str.toUpperCase().endsWith("A")) {
            System.out.println("dogru sehir");
        }else System.out.println("yanlis sehir");





    }
}
