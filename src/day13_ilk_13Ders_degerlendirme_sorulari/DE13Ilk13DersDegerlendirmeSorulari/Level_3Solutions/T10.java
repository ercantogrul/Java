package day13_ilk_13Ders_degerlendirme_sorulari.DE13Ilk13DersDegerlendirmeSorulari.Level_3Solutions;

import java.util.Scanner;

public class T10 {
    public static void main(String[] args) {
        // https://youtu.be/iTzMEUi7AUQ
        // tas (1)- Kagit(2)- Makas (3)

        Scanner scan = new Scanner(System.in);
        String [] secim = new String[]{"","Tas","Kagit","Makas"};
        int computerChoice;
        int playerChoice;
        int numberOfComputerWin=0;
        int numberOfPlayerWin=0;
        do {

            computerChoice= (int) (Math.random()*3+1);
            System.out.print("simdi kullanici secimini yapsin : ");
            playerChoice=integerRead(0,3);

            System.out.print("computer Choice : "+secim[computerChoice]);
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

        }while (playerChoice!=0);

        if (numberOfComputerWin ==numberOfPlayerWin) System.out.println("berabere");
        else if (numberOfComputerWin>numberOfPlayerWin) System.out.println("Computer win");
        else System.out.println("Player win");
        System.out.println("Score==>      Computer = "+numberOfComputerWin+"   -Player = "+numberOfPlayerWin);

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
}
