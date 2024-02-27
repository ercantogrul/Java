package day05_ifStatementTrernaryOperators.DE05_IfStatementTernaryOperators_ilk.tasks_iklhali;

import java.util.Scanner;

public class Task14__emeklilik_prim_yas {

    public static void main(String[] args) {
        /*
          TASK -> kullanıcının cinsiyeti KADIN ise 60 yasından buyuk ve prim gunu 6000 den  fazla ise emekliliğini
                kullanıcının cinsiyeti ERKEK ise 65 yasından buyuk ve prim gunu 7000 den  fazla ise emekliliğini
                kontrol edip kalan yıl ve prim gununu print eden code create ediniz...
         */
        Scanner scan = new Scanner(System.in);
        System.out.println(" cinsiyeti giriniz : ");
        String cinsiyet = scan.next();
        System.out.println("prim gununu giriniz");
        int prim = scan.nextInt();
        System.out.println("yasini giriniz");
        int yas = scan.nextInt();

        if (cinsiyet.equalsIgnoreCase("KADIN")) {
            if (prim>=6000 && yas >= 60) {
                System.out.println("Emekli olabilirsiniz");
            } if (prim<6000 || yas<60) {
                System.out.println("Kalan prim Gününüz: "+ (6000-prim) + " gün," + " kalan yasiniz : "+ (60-yas)+" yil");

            }
        }if (cinsiyet.equalsIgnoreCase("ERKEK")) {
            if (prim>=7000 && yas >=65) {
                System.out.println("Emekli olabilirsiniz");
            } else if ( prim>7000 || yas<65) {
                System.out.println( "Kalan prim Gününüz :"+ (7000-prim) + " gün,"+ " kalan yasiniz : "+ (65-yas)+" yil");

                }
            }

        }









    }

