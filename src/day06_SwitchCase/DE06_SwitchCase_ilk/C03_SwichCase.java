package day06_SwitchCase.DE06_SwitchCase_ilk;

import java.util.Scanner;

public class C03_SwichCase {
    public static void main(String[] args) {
        // kaçıncı ay olduğu veriliyor, ayın kaç gün olduğunu yazdırıan bir kod yazınız
        // switch - case kullanın
        Scanner scanner = new Scanner(System.in);
        System.out.print("KAçıncı ay : ");
        int ay = scanner.nextInt();
        switch (ay) {
            case 2:
                System.out.println(28);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(30);
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(31);
                break;
            default:
                System.out.println("hatalı giriş");

        }

    }
}
