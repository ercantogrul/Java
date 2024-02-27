package projects.BilgisayarProje;

import projects.BilgisayarProje.ENUM.BOYUT;
import projects.BilgisayarProje.ENUM.MODEL;
import projects.BilgisayarProje.ENUM.RAM;
import projects.BilgisayarProje.ENUM.RENK;

import java.util.Scanner;

public class HP extends Islemler implements ComputerInterface {
    static int HPPrice = 1300;

    public static void HPIslem() {
        System.out.println(RenkFormat.c_GREEN+"HP menusune hosgeldiniz: ");
        Runner.ID++;

        HP comp = new HP();
        comp.ID = Runner.ID;
        comp.Renk  = comp.getColor();
        comp.Boyut = comp.getSize();
        comp.model = MODEL.HP.name();
        comp.Ram   = comp.getRam();
        comp.fiyat = HPPrice;
        System.out.println("Sectiginiz bilgisayar ="+comp);
        System.out.println("Satisi onayliyormusunuz (E/H)");
        Scanner scanner= new Scanner(System.in);
        String secim= scanner.next().substring(0,1);

        if (secim.equalsIgnoreCase("E")){
            System.out.println("Satin Aldiginiz Bilgisayar =");
            Runner.computers.put(Runner.ID,comp);
            System.out.println(Runner.computers);
            HPPrice = 1300;}
        else {
            HPPrice = 1300;
            HPIslem();
        }
    }

    @Override
    public String getColor() {
        String secim="";
        do{
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
            case "1": {HPPrice += 200;return RENK.WHITE.name();
            }
            case "2": {HPPrice += 300;return RENK.BLACK.name();
            }
            case "3": {HPPrice += 400;return RENK.SILVER.name();
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



    @Override
    public String getSize() {
        String secim="";
        do{
        System.out.println("""
                            Hangi boyutta almak istiyorsunuz:
                            1. XL
                            2. Large
                            3. Small
                            4. Cikis
                """);
        Scanner scanner = new Scanner(System.in);
        secim = scanner.next();
        switch (secim) {
            case "1": {HPPrice += 400;return BOYUT.XL.name();
            }
            case "2": {HPPrice += 400;return BOYUT.LARGE.name();
            }
            case "3": {HPPrice += 400;return BOYUT.SMALL.name();
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

    @Override
    public String getRam() {
        String secim="";
        do{
        System.out.println("""
                            Hangi boyutta RAM almak istiyorsunuz:
                             1. 64 GB
                             2. 32 GB
                             3. 16 GB
                             4. 8  GB
                             5. 4  GB
                             6. Cikis 
                """);
        Scanner scanner = new Scanner(System.in);
        secim = scanner.next();
        switch (secim) {
            case "1": {HPPrice += 400;return RAM.R64GB.name();
            }
            case "2": {HPPrice += 400;return RAM.R32GB.name();
            }
            case "3": {HPPrice += 400;return RAM.R16GB.name();
            }
            case "4": {HPPrice += 400;return RAM.R8GB.name();
            }
            case "5": {HPPrice += 400;return RAM.R8GB.name();
            }
            case "6": {
                Runner.satinAlmaMenusu();
            }
            default: {
                System.out.println("Yanlis secim yaptiniz. Tekrar deneyiniz.");
            }
        }
        }while (!secim.equals("6"));
        return null;
    }


}
