package projects.Stein_Papier_Schere_Spiel____;

import java.util.Scanner;

public class tas_kagit_makas {
    public static void main(String[] args) {
        /* TASK:
         tas >makas
         makas >kagit
         kagit >tas
    Oncelikle kullanicidan secim alabilmek icin Scanner yapiyoruz.
    Ardindan main fonksiyonumuzda kullanicinin ve bilgisayarin puanlarini tanimliyoruz.
    While dongumuzun icerisinde kullanicidan aldigimiz secimi “secim” isimli degiskene atiyoruz.
    Bilgisayarin secimini ise Math.random methodunu kullanarak aliyoruz.
    Math.random()*3 diyerek bilgisayara 1 ile 4 arasinda bir rastgele sayi urettiriyoruz.
    Ve secimimiz ile bilgisayarin secimini karsilastirip sonuclarini yaziyoruz.
    En sonda da kullaniciya oyuna devam etmek isteyip istemedigini soruyoruz, eger istiyorsa
    dongumuz en bastan calisiyor, istemiyorsa da cikis yapiyor.
     */

        // https://youtu.be/iTzMEUi7AUQ
        // tas (1)- Kagit(2)- Makas (3)

        Scanner scan = new Scanner(System.in);
        int bilgisayarSkoru =0;
        int userSkoru =0;
        String yeniSecim;

        System.out.println("Tas Kagit Makas oyunumuza hosgeldiniz");
        System.out.println("Tas icin   : 1 tuslayiniz\nKagit icin : 2 tuslayiniz\nMakas icin : 3 tuslayiniz \nCikis icin : 4 tuslayiniz");


        int user;
        do {
            System.out.println("\nLütfen seciminizi giriniz :");
          user = scan.nextInt();
            if (user==4){
                System.out.println("cikis yaptiniz");
                System.exit(0);
            }
            while (user > 3 || user < 1) {
                System.err.println("Lütfen seçinizi kontrol ederek tekrar girin:");
                user = scan.nextInt();// Kullanıcıdan seçimi aldık
            }


            System.out.println("Oyuncunun seçiminiz: " + isim(user));


            int computer = (int)(Math.random()*3+1);

            System.out.println("Bilgisayarin secimi :"+isim(computer)+"\n");
            if (user==computer){
                System.out.println("berabere");
                System.out.println("Score ====>      Computer  = "+bilgisayarSkoru+"   -  user = "+userSkoru);
            }else if ((computer==1 && user ==3)||(computer==2 && user ==3) ||
                    (computer ==3 && user ==1)) {
                System.out.println("user kazandi");
                userSkoru++;
                System.out.println("Score ====>      Computer  = "+bilgisayarSkoru+"   -  user = "+userSkoru);
            }else {
                System.out.println("bilgisayar kazandi");
                bilgisayarSkoru++;
                System.out.println("Score ====>      Computer  = "+bilgisayarSkoru+"   -  user = "+userSkoru);
            }
            System.out.println("Tamam mı devam mı? evet icin\"E\"  hayir icin \"H\" giriniz\"");
            yeniSecim=scan.next();
            if (yeniSecim.substring(0,1).equalsIgnoreCase("e")){
                System.out.println("\nLütfen seciminizi giriniz :");

            } else if (yeniSecim.substring(0,1).equalsIgnoreCase("h")) {
                System.out.println("Score ====>      Computer  = "+bilgisayarSkoru+"   -  user = "+userSkoru);
                System.exit(0);
            }else {
                System.out.println("Hatali giris yaptiniz tekrar deneyiniz");
            }
        }while (user!=4);

        if (bilgisayarSkoru ==userSkoru) System.out.println("berabere");
        else if (bilgisayarSkoru>userSkoru) System.out.println("Computer kazandi");
        else System.out.println("user kazandi");
        System.out.println("Score==>      Computer = "+bilgisayarSkoru+"   -user = "+userSkoru);


    }


    private static String isim(int user) {
        if (user==1){
            return "Tas";
        } else if (user==2) {
            return "Kagit";
        }else {
            return "Makas";
        }


    }


}
