package day07_StringManuplation.DE07_StringManuplation_ilk.tasks;

import java.util.Scanner;

public class Task07___ {
    public static void main(String[] args) {
        /*
        Task-> Girilen string içindeki istenen index'deki karakteri print eden code create ediniz
         */

        Scanner scan =new Scanner(System.in);
        System.out.println("bir ifade giriniz: ");  // merhaba
        String str = scan.nextLine();

        System.out.println("bir index giriniz: ");
        int index = scan.nextInt();

        System.out.println(str.charAt(index));










    }
}
