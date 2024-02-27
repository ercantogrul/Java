package day06_SwitchCase.DE06_SwitchCase_ilk;

import java.util.Scanner;

public class C04_SwitchCase {

    public static void main(String[] args) {
        // Task-> Girilen ay numarasına göre  mevsimini print eden code create ediniz...
        Scanner input = new Scanner(System.in);
        System.out.print("Dadaş hele bir ayın sayisini gir : ");
       int aySayi = input.nextInt();

       switch (aySayi) {
           case 1:
           case 2:
           case 12:
               System.out.println("kis");
               break;
           case 3:
           case 4:
           case 5:
               System.out.println("ILK BAHAR");
               break;
           case 6:
           case 7:
           case 8:
               System.out.println(" BAHAR");
               break;
           case 9:
           case 10:
           case 11:
               System.out.println("SON BAHAR");
               break;
           default:
               System.out.println("");

       }
       }

    }
       /*


        switch (aySayi) {
            default://switch hiç bir case için calışmzsa devreye girer.switch blok'da yeri önemli değildir.
                System.out.println("kurban olim sizin köyde bir yılda kaç ay var :( ");
                break;
            case 12:
            case 1:
            case 2:

                System.out.println("girilen ay KIŞ mevsimine ait");
                break;
            case 3:
            case 4:
            case 5://yukarıdaki tüm case'ler aynı aksiyonu alacagı için break atılmadı

                System.out.println("girilen ay İLKBAHAR mevsimine ait");
                break;
            case 6:
            case 7:
            case 8:
                System.out.print("girilen ay YAZ  mevsimine ait");
                break;
            case 9:
            case 10:
            case 11:
                System.out.print("girilen ay SONBAHAR  mevsimine ait");
                break;

        }
        System.out.println("dadaş code cincik oldu DEWAMKEE...");//bu komut console'de görülürse yukarıdaki bloklardan çıkılmış demektir
           */



