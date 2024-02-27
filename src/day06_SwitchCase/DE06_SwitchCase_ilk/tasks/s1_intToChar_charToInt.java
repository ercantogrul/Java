package day06_SwitchCase.DE06_SwitchCase_ilk.tasks;

import java.util.Scanner;

public class s1_intToChar_charToInt {
    public static void main(String[] args) {

           //kullanicidan bir char karakter isteyin
        //girilen char dan sonraki 3 karakteri yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen Ascii tablosundan bir karakter giriniz");
        char girilenKrk = scan.next().charAt(0);

        System.out.println("dirilen karakter : " + girilenKrk);
        System.out.println("Girilen karakter'den sinraki 3 karakter : " + (girilenKrk+1) +", "+ (girilenKrk+2)+ ", "+(girilenKrk+3));
        System.out.println("Girilen karakter'den sinraki 3 karakter : " + (char)(girilenKrk+1) +", "+ (char)(girilenKrk+2)+ ", "+(char)(girilenKrk+3));

      // birincisi girilen karakter'i gösterir
        // ikincisi gililen karakterden sonraki 3 karakterin ascii degerlerini veriri
        //ücüncüsü ascii deki degerine gore bu karakterleri harfe cevirir

        String str = "Java Candir";
        System.out.println(str.charAt(3)); //a





    }
}
