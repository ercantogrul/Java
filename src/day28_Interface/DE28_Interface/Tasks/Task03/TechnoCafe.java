package day28_Interface.DE28_Interface.Tasks.Task03;

import java.util.ArrayList;
import java.util.Scanner;

public class TechnoCafe {
    public static void main(String[] args) {
        gunlukMenu();

        ArrayList<String> yemekSiparisList = new ArrayList<>();

        String yeniSecim;
        do {
            Scanner scan = new Scanner(System.in);
            yemekSiparisList.add(yemekSiparisiAl());
            System.out.println("Baska bir sey istermisiniz. Evet icin \"E\" hayir icin \"H\" cikis icin : \"X\" \nSeciniz..:");
            yeniSecim = scan.next();
            if (yeniSecim.equalsIgnoreCase("E")){
                yemekSiparisList.add(yemekSiparisiAl());
            } else if (yeniSecim.equalsIgnoreCase("H")) {
                System.out.println("yemekSiparisList = " + yemekSiparisList);
                break;
            }else if (yeniSecim.equalsIgnoreCase("x")){
                System.out.println("Cikis yaptiniz");
            }else {
                System.out.println("Hatali giris yaptiniz tekrar deneyiniz");
            }

        }while (!yeniSecim.equalsIgnoreCase("x"));
        yemekSiparisListesiMethodu(yemekSiparisList);

    }
    public static void yemekSiparisListesiMethodu (ArrayList<String> yemekSiparisList){
        System.out.println(yemekSiparisList);
        for (int i = 0; i < yemekSiparisList.size(); i++) {
            System.out.println("yemekSiparisList.get(i) = " + yemekSiparisList.get(i));

        }

    }
    public static void gunlukMenu(){
        System.out.println("****TechnoCafe'ye hosgeldiniz**** ");
        System.out.println(" Bugünkü Menümüz\n"+
                " AdanaKebab: marinade, grill\n" +
                " Lahmacun  : dough, topping, bake\n" +
                " Borsh     : boil\n" +
                " Palov     : fry, boil");
    }
    public static String yemekSiparisiAl (){
        Scanner scan = new Scanner(System.in);
        System.out.println("\nNe almak istersiniz : ");
        System.out.println("\nAdanaKebab marinade icin: 1A \nAdanaKebab grill icin   : 1B" +
                "\nLahmacun dough icin     : 2A \nLahmacun topping icin   : 2B \nLahmacun bake icn \t\t: 2C" +
                "\nBorsh boil icin \t\t: 3A" +
                "\nPalov fry icin  \t\t: 4A   \nPalov boil icin \t\t: 4B \nSeciniz...:");
        String secim = scan.next();
        if (secim.equalsIgnoreCase("1a")) {
            System.out.println("AdanaKebab marinade sectiniz ");
        } else if (secim.equalsIgnoreCase("1b")) {
            System.out.println("AdanaKebab grill sectiniz ");
        } else if (secim.equalsIgnoreCase("2a")) {
            System.out.println("Lahmacun dough sectiniz ");
        } else if (secim.equalsIgnoreCase("2b")) {
            System.out.println("Lahmacun toppin sectiniz ");
        }else if (secim.equalsIgnoreCase("2c")) {
            System.out.println("Lahmacun bake sectiniz ");
        }else if (secim.equalsIgnoreCase("3a")) {
            System.out.println("Borsh boil sectiniz ");
        }else if (secim.equalsIgnoreCase("4a")) {
            System.out.println("Palov fry sectiniz ");
        }else if (secim.equalsIgnoreCase("4b")){
            System.out.println("Palov boil sectiniz ");
        }else {
            System.out.println("Hatali secim yaptiniz tekrar deneyiniz");
        }
        return secim;
    }
}
