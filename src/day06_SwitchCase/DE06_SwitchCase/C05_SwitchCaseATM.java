package day06_SwitchCase.DE06_SwitchCase;

import java.util.Scanner;

public class C05_SwitchCaseATM {
    public static void main(String[] args) {
        /*
        TaskATM-> Bakıye 1000$ olan bir banka hesabı için bakıye öğrenme-para çekme-para yatırma
         ve çıkış işlemlerinin yapıldığı bir ATM app. create ediniz
         */
        int bakiye = 1000;
        System.out.println("   ***   ");
        System.out.println("   $$$ JavaBANK ATM'YE HOŞ GELDİNİZ $$$   ");

        Scanner input = new Scanner(System.in);
        System.out.println(" gardaş hele ne verim ne istirsen :" +
                " \nBakıye->1\nPara yatırma->2\nPara çekme->3\nÇıkış->4 ");
        int tercih = input.nextInt();
        switch (tercih) {
            case 1 :
                System.out.println("bakiye = " + bakiye); break;
            case 2 :
                System.out.print("yatıracağınız miktar ? :");
                int yatanMiktar = input.nextInt();
                bakiye += yatanMiktar;
                System.out.println("Bakiye = " + bakiye); break;
            case 3 :
                System.out.print("yatıracağınız miktar ? :");
                int cekilenMiktar = input.nextInt();
                if (cekilenMiktar>bakiye) {
                    System.out.println("Yetersiz bakiye");
                } else {
                    bakiye -= cekilenMiktar;
                    System.out.println("Bakiye = " + bakiye);
                }

                break;
            case 4:

        }

    }
}
