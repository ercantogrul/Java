package day06_SwitchCase.DE06_SwitchCase_ilk;

import java.util.Scanner;

public class C05_SwitchCaseATM__ {
    public static void main(String[] args) {
        /*
        TaskATM-> Bakıye 1000$ olan bir banka hesabı için bakıye öğrenme-para çekme-para yatırma
         ve çıkış işlemlerinin yapıldığı bir ATM app. create ediniz
         */

        System.out.println("   ***   ");
        System.out.println("   $$$ JavaBANK ATM'YE HOŞ GELDİNİZ $$$   ");

        Scanner input = new Scanner(System.in);
        System.out.println(" gardaş hele ne verim ne istirsen : \nBakıye->1\nPara yatırma->2\nPara çekme->3\nÇıkış->4 ");
        int tercih = input.nextInt();
        int bakiye = input.nextInt();
        bakiye = 1000;
        switch (tercih){
            case 1:
                System.out.println("bakiyeniz : "+ bakiye ); break;
            case 2 :
                System.out.println("yatirilacakMiktar");
                int yatirilacakMiktar = input.nextInt();
                bakiye += yatirilacakMiktar;
                System.out.println("yatırdıktan sonraki bakıyeniz:"+ bakiye);break;
            case 3 :
                System.out.println("cekilenMiktar");
                int cekilenMiktar = input.nextInt();
                 bakiye -= cekilenMiktar;
                System.out.println("ycekildikten sonraki bakıyeniz:+bakiye");break;
            case 4 :
                System.out.println("isleminiz bitmistir");break;
            default:
                System.out.println(" ");

        }

        /*switch (tercih) {
            case 1://bakıye verme işlemi

                System.out.println("bakıyeniz : " + bakıye);
                break;
            case 2://Para yatırma işlemi

                System.out.println("gardaş ne kadar yatirirsen :");
                int yatırılanMiktar = input.nextInt();
                bakıye += yatırılanMiktar;
                System.out.println("yatırdıktan sonraki bakıyeniz:"+bakıye);
                break;
            case 3://para çekme işlemi

                System.out.println("gardaş ne kadar çekirsen :");
                int cekilenMiktar = input.nextInt();
                if (cekilenMiktar <= bakıye) {//bakıyeden az olan cekme miktarı kontrol edildi
                    bakıye -= cekilenMiktar;
                    System.out.println("çelimde  sonraki bakıyeniz:"+bakıye);
                } else System.out.println("gardaş ne idirsen olmayan para mı çekirsen :(");
                break;

            case 4://çıkış işlemi
                System.out.println("gardaş selametle yine bekleriz :)");
                break;
            default:
                System.out.println("gardaş atm ye ilk defa mı gelirsen :)");


        System.out.println("dadaş code cincik oldu DEWAMKEE...");
        */




    }


}
