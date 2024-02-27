package asya_hoca_.asya_hoca_25_10;

import java.util.Scanner;

public class s11_giris_sifresi_uc_defa {
    public static void main(String[] args) {

//ask user to enter username and password (Give 3 tries)
        //if true credential "login"
        //else try to 3 times


        Scanner scan = new Scanner(System.in);
        String kullaniciAdi = "ercan";
        String password = "abc123";

        for (int i = 1; i <=3; i++) {
            System.out.println("Kullanici adi giriniz : ");
            String userName = scan.nextLine();
            System.out.println("Sifrenizi giriniz : ");
            String gsifre = scan.nextLine();

            if (password.equals(gsifre)&& kullaniciAdi.equalsIgnoreCase(userName)) {
                System.out.println("giris basarili");break;

            }else System.out.println(3-i+" deneme hakkiniz kaldi.");
        }














    }
}
