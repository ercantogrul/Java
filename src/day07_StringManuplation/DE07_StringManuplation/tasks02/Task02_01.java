package day07_StringManuplation.DE07_StringManuplation.tasks02;

import java.util.Scanner;

public class Task02_01 {
    public static void main(String[] args) {
        // verilen stringin 3. karekteri varsa silin
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        // "hasan"
        if (str.length()>=4) { // 4 veya daha buyuk ise
            String IlkParca     = str.substring(0,3);
            String sondakiParca = str.substring(4);
            str = IlkParca+sondakiParca;
            System.out.println("str = " + str);
        } else System.out.println("3.karekter yoktur ");



    }
}
