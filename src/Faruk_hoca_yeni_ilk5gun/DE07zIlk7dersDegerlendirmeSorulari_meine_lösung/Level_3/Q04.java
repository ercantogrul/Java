package Faruk_hoca_yeni_ilk5gun.DE07zIlk7dersDegerlendirmeSorulari_meine_lösung.Level_3;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        // 5 karekterden oluşan bir strin geriliyor, ters çevirin
        // Örnek    input : "Selam"
        //          output: "maleS"


        Scanner scan = new Scanner(System.in);
        System.out.print("bes karakterden olusan bir string veri giriniz "); // hatay
        String str = scan.nextLine();

        System.out.println(str.substring(4)+str.substring(3,4)+str.substring(2,3)+str.substring(1,2)+str.substring(0,1));

    }
}
