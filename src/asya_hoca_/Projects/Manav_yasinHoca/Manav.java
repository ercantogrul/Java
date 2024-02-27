package asya_hoca_.Projects.Manav_yasinHoca;

import java.util.Scanner;

public class Manav {
    static Scanner scanner=new Scanner(System.in);
    int domatesFiyat= 30;
    int biberFiyat= 40;
    int marulFiyat= 20;
    int rokaFiyat= 30;
    int avakadoFiyat= 30;
    String secim;
    double kilo;
    double ucret;
    double toplamUcret;

    public void secim() {

        do{
            System.out.println("Almak istediginiz urunu seciniz:");
            secim= scanner.next();
            switch (secim){
                case "1":{
                    System.out.println("Kac kilo domates almak istiyorsunuz?");
                    kilo= scanner.nextDouble();
                    ucret=kilo*domatesFiyat;
                    toplamUcret+=ucret;break;
                }
                case "2":{
                    System.out.println("Kac kilo biber almak istiyorsunuz?");
                    kilo= scanner.nextDouble();
                    ucret=kilo*biberFiyat;
                    toplamUcret+=ucret;break;
                }
                case "3":{
                    System.out.println("Kac kilo marul almak istiyorsunuz?");
                    kilo= scanner.nextDouble();
                    ucret=kilo*marulFiyat;
                    toplamUcret+=ucret;break;
                }
                case "4":{
                    System.out.println("Kac kilo roka almak istiyorsunuz?");
                    kilo= scanner.nextDouble();
                    ucret=kilo*rokaFiyat;
                    toplamUcret+=ucret;break;
                }
                case "5":{
                    System.out.println("Kac kilo avakado almak istiyorsunuz?");
                    kilo= scanner.nextDouble();
                    ucret=kilo*avakadoFiyat;
                    toplamUcret+=ucret;break;
                }
                case "6":
                    System.out.println("Alisverisi bitirdiniz");break;
                default:
                    System.out.println("Hatali giris yaptiniz. Tekrar giriniz.");break;
            }
        }while(!secim.equalsIgnoreCase("6"));
    }
}
