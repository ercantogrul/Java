package Faruk_hoca_yeni_ilk5gun.DE07zIlk7dersDegerlendirmeSorulari_meine_lösung.Level_1;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        /* Klavyeden girilen ve 3 harften oluşan bir string i, her satıra bir harf gelecek şekilde yazdırınız
        Örnek input : ali,
         output
         a
         l
         i
          */

        Scanner scan = new Scanner(System.in);
        System.out.println("metni giriniz");
        String str = scan.next();
        System.out.println(str.substring(0,1)+"\n"+str.substring(1,2)+"\n"+str.substring(2));

        //==================ikinco yol

        System.out.println(str.charAt(0)+"\n"+str.charAt(1)+"\n"+str.charAt(2));  // bu yol daha kolay

        // ucuncu yol=================






    }
}
