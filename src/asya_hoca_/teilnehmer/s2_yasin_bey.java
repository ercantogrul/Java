package asya_hoca_.teilnehmer;

import java.util.Scanner;

public class s2_yasin_bey {
    public static void main(String[] args) {
        // Bankadan para cekmek icin gittiniz. Password girdiniz.
// Cekmek istediginiz miktari girin.
// Banka, Password icersinde bulunan sesli harflerin 10 ile carpimi kadar istediginizden eksik para verecek.
// Banka, Password icersinde bulunan rakamlarin 10 ile carpimi kadar istediginizden fazla para verecek.
// Eger password de bosluk varsa hic para vermeyecek.

        Scanner scan = new Scanner(System.in);
        System.out.println("password giriniz");
        String password = scan.nextLine();
        password =password.toLowerCase();
        System.out.println("cekmek istediginiz miktari giriniz");
        int cek_miktar = scan.nextInt();
        int eksikV = (password.length()-password.toLowerCase().replaceAll("[aeiou]","").length())*10;
        System.out.println(eksikV);
        int fazladan =(password.length()-password.replaceAll("[0-9]","").length())*10;
        System.out.println(fazladan);

        if ((password.contains(" "))){
            System.out.println("para cekemezsiniz");
        }else
            if (password.contains("a")||password.contains("e")||password.contains("i")||password.contains("o")||password.contains("u") &&
                    password.contains("0")||password.contains("1")||password.contains("2")||password.contains("3")||password.contains("4")||
                    password.contains("5")||password.contains("6")||password.contains("7")||password.contains("8")||password.contains("9")) {
                System.out.println(cek_miktar-eksikV+fazladan);
        } else if (password.contains("a")||password.contains("e")||password.contains("i")||password.contains("o")||password.contains("u")) {
                System.out.println( cek_miktar-eksikV);
        } else if ( password.contains("0")||password.contains("1")||password.contains("2")||password.contains("3")||password.contains("4")||
                    password.contains("5")||password.contains("6")||password.contains("7")||password.contains("8")||password.contains("9")) {
                System.out.println(cek_miktar+fazladan);
        }else
            System.out.println("yanlis password gidiniz");

















    }
}
