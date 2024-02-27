package asya_hoca_.asya_hoca_26_10;

import java.util.Scanner;

public class s3_stringi_tersten_yazdirmak {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen tersten yazdirmak istediginiz metni giriniz");
        String str = scanner.nextLine();

        // Java Candir
        // ridnaC avaJ

        String tersMetin = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            tersMetin += str.charAt(i);
        }
        System.out.println("Terse cevrilen metin : " + tersMetin);
//========================================ikinci yol============================
        String tm ="";
        for (int i = str.length()-1; i >=0 ; i--) {
            tm=tm+str.substring(i,i+1);

        }System.out.println("Terse cevrilen metin : " + tm);








    }
}
