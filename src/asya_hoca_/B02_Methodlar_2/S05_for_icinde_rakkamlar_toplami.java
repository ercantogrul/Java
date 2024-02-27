package asya_hoca_.B02_Methodlar_2;

import java.util.Scanner;

public class S05_for_icinde_rakkamlar_toplami {
    public static void main(String[] args) {
       /* task->
    Girilen bir tamsayı için
    Bu sayinin negatif veya pozitif oldugunu,
    tek mi cift mi oldugunu ve
    uc basamakli veya daha buyukse birler,onlar ve yuzler basamagindaki rakamlarin toplamini,
    100'den kucukse sadece birler basamagini print eden method'lar create ediniz.
    */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int sayi = scan.nextInt();

        negatifPozitifKontrolu(sayi);
        tekCiftKontrolu(sayi);
        basamakRakamiToplami(sayi);

    }
    private static void tekCiftKontrolu(int sayi) {
        if (sayi % 2 == 0) {
            System.out.println("sayi cifttir");
        } else System.out.println("sayi tektir");
    }
    private static void negatifPozitifKontrolu(int sayi) {
        if (sayi>0){
            System.out.println("sayi pozitif");
        }else System.out.println("sayi negatif");
    }
    private static void basamakRakamiToplami(int sayi) {
        if (sayi >= 100) {
            String numStr = String.valueOf(sayi);
            numStr= numStr.substring(numStr.length()-3);
            int toplam = 0;
            for (int i = 0; i < numStr.length(); i++) {
                int ch = Integer.parseInt(numStr.charAt(i) + "");
                toplam += ch;
            }
            System.out.println("Rakamlar toplami = " + toplam);
        } else {
            System.out.println("Birler Basamagi : " + sayi % 10);

        }



    }
}
