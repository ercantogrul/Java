package day06_SwitchCase.DE06_SwitchCase_ilk.tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        // Task-> Girilen hafta gün sayısına karşılık gelen gün adını print eden code create ediniz.
        // 1.gün Pazartesi olsun

        Scanner oku = new Scanner(System.in);
        System.out.print("1.gün Pazartesi kosuluyla gunNo giriniz=");
        int gunNo = oku.nextInt();

        switch (gunNo) {
            case 1: System.out.println("Pazartesi");break;
            case 2: System.out.println("sali");break;
            case 3: System.out.println("carsamba");break;
            case 4: System.out.println("persembe");break;
            case 5: System.out.println("cuma");break;
            case 6: System.out.println("cumartesi");break;
            case 7: System.out.println("pazar");break;
            default: System.out.println("hatali");


        }
    }
}