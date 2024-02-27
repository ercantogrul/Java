package day13_ilk_13Ders_degerlendirme_sorulari.DE13Ilk13DersDegerlendirmeSorulari_ilk.Level_3;

import java.util.Scanner;

public class T10_Tas_kagit_makas {
    public static void main(String[] args) {
        // Bİlgisayara karşı oynan taş-kağıt-makas oyunu yapınız

        // https://youtu.be/iTzMEUi7AUQ
        // tas (1)- Kagit(2)- Makas (3)

        System.out.println("Tas-Kagit-Makas oyununa baslayabilirsiniz");
        System.out.print("simdi kullanici secimini yapsin : \nTas icin   : 1 tuslayiniz\nKagit icin : 2 tuslayiniz\nMakas icin : 3 tuslayiniz\n");

        oyun();

        // println colar format



    }

    private static int integerRead(int min, int max) {
        Scanner scan = new Scanner(System.in);
        int number =0;
        boolean readingOK =false;
        do {
            try{
                number = Integer.parseInt(scan.nextLine());
                readingOK =true;
            }catch (NumberFormatException e) {

            }
            if (number<min || number>max || !readingOK) {
                System.out.print("Incorrect- Plase Re-enter("+min+" - "+max+") : ");
            }

        }while (!readingOK ||number<min ||number>max);


        return  number;
    }
    public static void oyun(){
        Scanner scan = new Scanner(System.in);
        String [] secim = new String[]{"","Tas","Kagit","Makas"};
        int computerChoice;
        int playerChoice;
        int numberOfComputerWin=0;
        int numberOfPlayerWin=0;
        String yeniSecim;

        do {
            playerChoice=integerRead(0,3);
            computerChoice= (int) (Math.random()*3+1);
            System.out.print("\ncomputer Choice : "+secim[computerChoice]);
            System.out.println("     player Choice : "+secim[playerChoice]);
            if (playerChoice!=0){
                if (computerChoice==playerChoice){
                    System.out.println("berabere");
                } else if ((computerChoice==1 && playerChoice ==3)||(computerChoice==2 && playerChoice ==1) ||
                        (computerChoice ==3 && playerChoice ==2)) {
                    numberOfComputerWin++;
                    System.out.println("computer win  ");
                    System.out.println("Score ====>      Computer  = "+numberOfComputerWin+"   -  Player = "+numberOfPlayerWin);

                }else {
                    numberOfPlayerWin++;
                    System.out.println("Player win  ");
                    System.out.println("Score==>      Computer  = "+numberOfComputerWin+"   -  Player = "+numberOfPlayerWin);
                }
            }
            System.out.println("Oynamaya devam etmek istiyorsaniz evet icin\"E\"  hayir icin \"H\" giriniz");
            yeniSecim=scan.next();
            if (yeniSecim.substring(0,1).equalsIgnoreCase("e")){
                System.out.println("Simdi kullanici secimini yapsin");
                oyun();

            } else if (yeniSecim.substring(0,1).equalsIgnoreCase("h")) {
                playerChoice=0;
            }else {
                System.out.println("Hatali giris yaptiniz tekrar deneyiniz");
            }

        }while (playerChoice!=0);

        if (numberOfComputerWin ==numberOfPlayerWin) System.out.println("berabere");
        else if (numberOfComputerWin>numberOfPlayerWin) System.out.println("Computer win");
        else System.out.println("Player win");
        System.out.println("Score==>      Computer = "+numberOfComputerWin+"   -Player = "+numberOfPlayerWin);


    }
}
