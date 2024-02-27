package day07_StringManuplation.DE07_StringManuplation_ilk.tasks02;

import java.util.Scanner;

public class Task02_03____ {
    public static void main(String[] args) {
        // Verilen stringin , son karekterini '*' ile değiştirin

        Scanner scan = new Scanner(System.in);
        System.out.println("bir veri giriniz: ");   // merhaba
        String str = scan.nextLine();
        char sonK = str.charAt(str.length()-1);
        System.out.println(sonK);

       System.out.println(str.replace("sonK","*"));




    }
}
