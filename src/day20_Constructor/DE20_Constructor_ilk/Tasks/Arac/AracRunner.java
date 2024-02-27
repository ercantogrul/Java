package day20_Constructor.DE20_Constructor_ilk.Tasks.Arac;

import java.util.ArrayList;
import java.util.Scanner;

public class AracRunner {
    public static void main(String[] args) {

        //AracRunner aracBilgileri =new AracRunner("Volkswagen","Golf",11,154000,4800);

        Scanner scan = new Scanner(System.in);
        Arac aracBilgileri;

        ArrayList<Arac>araclist = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            aracBilgileri=veriOkuma();
            araclist.add(aracBilgileri);
        }
        System.out.println(araclist);

        System.out.println("hangi marka araba istiyorsunuz");
        String istenenMarka = scan.next();
        for (int i = 0; i < 10; i++) {
            if (istenenMarka.equals(araclist.get(i).marka)) System.out.println(araclist.get(i));

        }


    }

    private static Arac veriOkuma() {
        Scanner scan = new Scanner(System.in);
        Arac bilgi = new Arac(); // ______
        System.out.println("Arac markasi giriniz");
        bilgi.marka= scan.next();           // böyle de olabilir önce bilgi variable sini yukarda tanimlamaliyiz
        System.out.println("Arac modeli giriniz");
        String model= scan.next();
        System.out.println("Arac yasi giriniz");
        int yas= scan.nextInt();
        System.out.println("Arac km giriniz");
        int km= scan.nextInt();
        System.out.println("Arac fiyati giriniz");
        int fiyat =scan.nextInt();
        bilgi = new Arac(bilgi.marka,model,yas,km,fiyat);
        return bilgi;
    }


}
