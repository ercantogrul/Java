package day05_ifStatementTrernaryOperators.DE05_IfStatementTernaryOperators_ilk.tasks_iklhali;

import java.util.Scanner;

public class Task01__yas_hangi_Evre {
    public static void main(String[] args) {
        /*
         Task->
         Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu asagidaki tabloya gore print eden code create ediniz.
        0 - 4 => bebek
        5 - 12 => cocuk
        13 - 20 => genc
        21 - 30 => yetiskin
        Tanimlanmamis evre
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("yasi giriniz");
        int yas = scan.nextInt();
        String durum;
        durum = yas < 4 ? "bebek" : yas < 12 ? "cocuk" : yas < 20 ? "genc" : yas < 30 ? "yetiskin" : "tanimlanmamis evre";
        System.out.println(durum);

        //  2.yontem====
        if (yas < 4) System.out.println("bebek");
        else if (yas < 12) System.out.println("cocok");
        else if (yas < 20) System.out.println("genc");
        else if (yas < 30) System.out.println("yetiskin");
            else System.out.println("tanimlanmamis");



        /*bu yöntem yerine  yukardakiler daha iyi
         if (yas >= 0 && yas <= 4) {
            System.out.println("bebek");
        } else if (yas >= 5 && yas <= 12) {
            System.out.println("cocuk");

        } else if (yas >= 13 && yas <= 20) {
            System.out.println("genc");

        } else if (yas >= 21 && yas <= 30) {
            System.out.println("yetiskin");

        }
         */
            }
        }


