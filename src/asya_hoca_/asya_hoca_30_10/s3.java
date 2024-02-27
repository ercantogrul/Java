package asya_hoca_.asya_hoca_30_10;

import java.util.Scanner;

public class s3 {
    public static void main(String[] args) {
//Kullanıcı "benimle evlenir misin ?" diye soracak
//Evet ise  mutluluklar
//Hayır ise nasip değil
//maybe ise sormaya devam

        Scanner scanner = new Scanner(System.in);
        System.out.println("Benimle evlenir misin :  ");
        String cevap = scanner.next();

        while ("maybe".equalsIgnoreCase(cevap)){
            System.out.println("Sormaya devam ediniz");
            cevap = scanner.next();
        }
        if ("Evet".equalsIgnoreCase(cevap)){
            System.out.println("mutluluklar");
        }else if ("Hayir".equalsIgnoreCase(cevap)){
            System.out.println("nasip degil");
        }


    }
}