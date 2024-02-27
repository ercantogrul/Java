package asya_hoca_.B01_Methodlar;

import java.util.Scanner;

public class B05_sifre_kontrol {
    public static void main(String[] args) {
        //password: Clarus123*
//Şifrenin doğruluğunu test eden method create ediniz
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sifrenizi giriniz : ");
        String sifre = scanner.nextLine();
        System.out.println("Username giriniz : ");
        String username = scanner.nextLine();
        System.out.println(control(sifre, username));

    }

    private static boolean control(String sifre, String username) {
        String password = "Clarus123*";
        String ad = "Yasin";
        return (sifre.equals(password) && username.equals(ad));

    }

    }

