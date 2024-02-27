package day20_Constructor.DE20_Constructor_ilk.Tasks.Teacher;

import java.util.ArrayList;
import java.util.Scanner;

public class TeacherRunner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Teacher bilgiler ;

        ArrayList<Teacher> kisiler = new ArrayList<>();
        int sayac=0;
        do {
            bilgiler = new Teacher();
            bilgiler = veriOkuma();
            kisiler.add(bilgiler);
            System.out.println("yeni kisi bilgisi ekleyiniz");
            sayac++;

        } while (sayac<10);


        for (int i = 0; i < kisiler.size(); i++) {
            if (kisiler.get(i).emekli==false){
                System.out.println("Emekli olmayanlarin listesi : "+kisiler.get(i).ad+" "+kisiler.get(i).soyad+" "+kisiler.get(i).maas);
            }

        }


    }
    private static Teacher veriOkuma() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("adi giriniz : "); String ad  = scanner.next();
        System.out.print("soyadi giriniz: "); String soyad = scanner.next();
        System.out.print("brans giriniz : "); String brans   = scanner.next();
        System.out.print("tecrube  giriniz : "); int tecrube   = scanner.nextInt();
        System.out.print("maas giriniz : "); int maas   = scanner.nextInt();
        System.out.print("emekli bilgisi giriniz : "); boolean emekli   = scanner.nextBoolean();
        Teacher bilgiler = new Teacher(ad, soyad, brans,tecrube,maas,emekli);
        return bilgiler;



    }
}
