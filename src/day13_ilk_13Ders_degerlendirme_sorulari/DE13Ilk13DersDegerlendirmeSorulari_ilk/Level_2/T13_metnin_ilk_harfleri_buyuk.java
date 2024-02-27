package day13_ilk_13Ders_degerlendirme_sorulari.DE13Ilk13DersDegerlendirmeSorulari_ilk.Level_2;

import java.util.Scanner;

public class T13_metnin_ilk_harfleri_buyuk {
    public static void main(String[] args) {
        // Klavyeden girilen bir stringin ilk harifleri büyük gerisi küçük olacak şekilde düzenleyin
        // input  : "jAva ile haYAT güzel"
        // output : "Java İle Hayat Güzel"

        Scanner scan = new Scanner(System.in);
        System.out.println("bir metin giriniz");
        String str = scan.nextLine();
        str = str.trim().substring(0)+" ";
        int bosluk = str.indexOf(" ");

        String kelime = "";
        for (int i = 0; i < str.length(); i++) {
            kelime+= str.substring(0,1).toUpperCase()+str.substring(1,bosluk).toLowerCase()+" ";

            str= str.substring(bosluk+1);
            bosluk = str.indexOf(" ");

        } System.out.println(kelime);



    }
}
