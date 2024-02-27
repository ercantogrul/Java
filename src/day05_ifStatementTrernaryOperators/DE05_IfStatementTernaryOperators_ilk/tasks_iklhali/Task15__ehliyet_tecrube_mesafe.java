package day05_ifStatementTrernaryOperators.DE05_IfStatementTernaryOperators_ilk.tasks_iklhali;

import java.util.Scanner;

public class Task15__ehliyet_tecrube_mesafe {

    public static void main(String[] args) {
        /*
          TASK -> Kullanıcının ehliyetinin varlığını kontrol ediniz.
          Ehliyeti varsa yıl tecrübesi 7 yıl ve üstü ise aldıgı mesafe 100000 km ve üzeri ise kontak anahtarını veriniz
          aksi durumda tecrübe yılı ve mesafe eksiklerini print eden code create ediniz
         */

        Scanner scan = new Scanner(System.in);
        System.out.println(" ehliyetiniz var mi? : ");
        String ehliyet = scan.next();

        System.out.println("ehliyet tecrübenizi giriniz");
        int yil = scan.nextInt();

        System.out.println("yaptiginiz mesafeyi giriniz");
        int mesafe = scan.nextInt();

        if (ehliyet.equalsIgnoreCase("VAR")){
            if ( yil>=7 && mesafe>=100000){
                System.out.println("kontak anahtarını alabilirsiniz");
            } else if (yil<7 || mesafe<100000) {
                System.out.println("eksik yil tecrubeniz : " +(7-yil) + ", eksik mesafeniz : " + (100000+mesafe)+ "km dir");

                }
            }

            }

        }



























