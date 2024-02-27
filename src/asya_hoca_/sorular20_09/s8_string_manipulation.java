package asya_hoca_.sorular20_09;

import java.util.Scanner;

public class s8_string_manipulation {
    public static void main(String[] args) {
        /*Kullanıcıdan ayrı ayrı alınan isim ve soy isim bilgilerini tek bir satırda çıktısını alın.
 İlk harfler büyük olmalı.Soy ismin tamamı büyük
 Kullanıcının birden fazla ismi olabilir
 Ör:
 isim : asya zeynep
 soyisim: coOl
 Çıktı: Asya Zeynep COOL

 Ör:
 isim asya
 soyisim: coll
 Çıktı: Asya COLL
 */
        Scanner scan =new Scanner(System.in);
        System.out.print("isminizi giriniz: ");
        String str = scan.nextLine();
        System.out.print("soyisminizi giriniz: ");
        String str2 = scan.nextLine();

        int bosluk = str.indexOf(" ");


        if (str.contains(" ")) {
            System.out.println(str.substring(0,1).toUpperCase()+str.substring(1,bosluk).toLowerCase()+
                    " "+str.substring(bosluk+1,bosluk+2).toUpperCase()+str.substring(bosluk+2).toLowerCase()+
                    " "+ str2.toUpperCase());

        }else System.out.println(str.substring(0,1).toUpperCase()+str.substring(1).toLowerCase()+ " "+str2.toUpperCase());




























    }
}
