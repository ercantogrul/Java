package projects.BilgisayarProje;

import projects.BilgisayarProje.ENUM.BOYUT;
import projects.BilgisayarProje.ENUM.MODEL;
import projects.BilgisayarProje.ENUM.RAM;
import projects.BilgisayarProje.ENUM.RENK;

import java.util.Scanner;


public class Casper extends Islemler implements ComputerInterface {
    static int CasperPrice = 1500;

    public static void CasperIslem() {
        System.out.println(RenkFormat.c_BLUE+ "Casper menusune hosgeldiniz: ");
        Runner.ID++;

        Casper comp = new Casper();
        comp.ID = Runner.ID;
        comp.Renk = comp.getColor();
        comp.Boyut = comp.getSize();
        comp.model = MODEL.CASPER.name();
        comp.Ram=comp.getRam();
        comp.fiyat = CasperPrice;
        System.out.println(comp);
        System.out.println("Satisi onayliyormusunuz (E/H)");
        Scanner scanner= new Scanner(System.in);
        String secim= scanner.next().substring(0,1);
        if (secim.equalsIgnoreCase("E")){
        Runner.computers.put(Runner.ID,comp);
        System.out.println(Runner.computers);
        CasperPrice=1500;
        }
        else {
            CasperPrice=1500;
            CasperIslem();
        }

    }

    public String getColor() {
        String secim="";
        do{
            System.out.println("""
                            Hangi renk almak istiyorsunuz:
                            1. RED
                            2. WHITE
                            3. BLACK
                            4. SILVER
                            5. Cikis
                """);
            Scanner scanner = new Scanner(System.in);
            secim = scanner.next();
            switch (secim) {
                case "1": {
                    CasperPrice += 100;
                    return RENK.RED.name();
                }
                case "2": {
                    CasperPrice += 200;
                    return RENK.WHITE.name();
                }
                case "3": {
                    CasperPrice += 300;
                    return RENK.BLACK.name();
                }
                case "4": {
                    CasperPrice += 400;
                    return RENK.SILVER.name();
                }
                case "5": {
                    Runner.satinAlmaMenusu();
                }
                default: {
                    System.out.println("Yanlis secim yaptiniz. Tekrar deneyiniz.");
                }
            }
        }while (!secim.equals("5"));
        return null;
    }
    @Override
    public String getSize() {
        String secim="";
        do{
            System.out.println("""
                            Hangi boyutta almak istiyorsunuz:
                            1. XL
                            2. Large
                            3. Cikis
                """);
            Scanner scanner = new Scanner(System.in);
            secim = scanner.next();
            switch (secim) {
                case "1": {
                    CasperPrice += 400;
                    return BOYUT.XL.name();
                }
                case "2": {
                    CasperPrice += 400;
                    return BOYUT.LARGE.name();
                }
                case "3": {
                    Runner.satinAlmaMenusu();
                }
                default: {
                    System.out.println("Yanlis secim yaptiniz. Tekrar deneyiniz.");
                }
            }
        }while (!secim.equals("3"));
        return null;
    }

    @Override
    public String getRam() {
        String secim="";
        do{
            System.out.println("""
                            Hangi boyutta RAM almak istiyorsunuz:
                             1. 32 GB
                             2. 16 GB
                             3. 8  GB
                             4. Cikis 
                """);
            Scanner scanner = new Scanner(System.in);
            secim = scanner.next();
            switch (secim) {
                case "1": {
                    CasperPrice += 400;
                    return RAM.R32GB.name();
                }
                case "2": {
                    CasperPrice += 400;
                    return RAM.R16GB.name();
                }
                case "3": {
                    CasperPrice += 400;
                    return RAM.R8GB.name();
                }
                case "4": {
                    Runner.satinAlmaMenusu();
                }
                default: {
                    System.out.println("Yanlis secim yaptiniz. Tekrar deneyiniz.");
                }
            }
        }while (!secim.equals("4"));
        return null;
    }


}
