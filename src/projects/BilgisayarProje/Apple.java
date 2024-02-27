package projects.BilgisayarProje;

import projects.BilgisayarProje.ENUM.BOYUT;
import projects.BilgisayarProje.ENUM.MODEL;
import projects.BilgisayarProje.ENUM.RAM;
import projects.BilgisayarProje.ENUM.RENK;

import java.util.Scanner;



public class Apple extends Islemler implements ComputerInterface {
    static int ApplePrice = 1500;

    public static void AppleIslem() {
        System.out.println(RenkFormat.c_GREEN+"Apple menusune hosgeldiniz: ");
        Runner.ID++;

        Apple comp = new Apple();
        comp.ID = Runner.ID;
        comp.Renk = comp.getColor();
        comp.Boyut = comp.getSize();
        comp.model = MODEL.APPLE.name();
        comp.Ram = comp.getRam();
        comp.fiyat = ApplePrice;
        System.out.println(comp);
        System.out.println("Satisi onayliyormusunuz (E/H)");
        Scanner scanner = new Scanner(System.in);
        String secim = scanner.next().substring(0, 1);
        if (secim.equalsIgnoreCase("E")) {
            Runner.computers.put(Runner.ID, comp);
            ApplePrice = 1500;
            System.out.println(Runner.computers);
        } else {
            ApplePrice = 1500;
            AppleIslem();
        }
    }

    public String getColor() {
        String secim = "";
        do {
            System.out.println("""
                                Hangi renk almak istiyorsunuz:
                                1. WHITE
                                2. BLACK
                                3. SILVER
                                4. Cikis
                    """);
            Scanner scanner = new Scanner(System.in);
            secim = scanner.next();
            switch (secim) {
                case "1": {
                    ApplePrice += 200;
                    return RENK.WHITE.name();
                }
                case "2": {
                    ApplePrice += 300;
                    return RENK.BLACK.name();
                }
                case "3": {
                    ApplePrice += 400;
                    return RENK.SILVER.name();
                }
                case "4": {
                    Runner.satinAlmaMenusu();
                }
                default: {
                    System.out.println("Yanlis secim yaptiniz. Tekrar deneyiniz.");
                }
            }
        } while (!secim.equals("4"));
        return null;
    }


    @Override
    public String getSize() {
        String secim = "";
        do {
            System.out.println("""
                                Hangi boyutta almak istiyorsunuz:
                                1. XXL
                                2. XL
                                3. Large
                                4. Small
                                5. Cikis
                    """);
            Scanner scanner = new Scanner(System.in);
            secim = scanner.next();
            switch (secim) {
                case "1": {
                    ApplePrice += 400;
                    return BOYUT.XXL.name();
                }
                case "2": {
                    ApplePrice += 400;
                    return BOYUT.XL.name();
                }
                case "3": {
                    ApplePrice += 400;
                    return BOYUT.LARGE.name();
                }
                case "4": {
                    ApplePrice += 400;
                    return BOYUT.SMALL.name();
                }
                case "5": {
                    Runner.satinAlmaMenusu();
                }
                default: {
                    System.out.println("Yanlis secim yaptiniz. Tekrar deneyiniz.");
                }
            }
        } while (!secim.equals("5"));
        return null;
    }

    @Override
    public String getRam() {
        String secim = "";
        do {
            System.out.println("""
                                Hangi boyutta RAM almak istiyorsunuz:
                                 1. 32 GB
                                 2. 16 GB
                                 3. 8  GB
                                 4. 4  GB
                                 5. Cikis 
                    """);
            Scanner scanner = new Scanner(System.in);
            secim = scanner.next();
            switch (secim) {
                case "1": {
                    ApplePrice += 400;
                    return RAM.R32GB.name();
                }
                case "2": {
                    ApplePrice += 400;
                    return RAM.R16GB.name();
                }
                case "3": {
                    ApplePrice += 400;
                    return RAM.R8GB.name();
                }
                case "4": {
                    ApplePrice += 400;
                    return RAM.R4GB.name();
                }
                case "5": {
                    Runner.satinAlmaMenusu();
                }
                default: {
                    System.out.println("Yanlis secim yaptiniz. Tekrar deneyiniz.");
                }
            }
        } while (!secim.equals("5"));
        return null;
    }


}
