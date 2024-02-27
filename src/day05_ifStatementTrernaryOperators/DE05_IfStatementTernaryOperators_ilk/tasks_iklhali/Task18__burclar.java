package day05_ifStatementTrernaryOperators.DE05_IfStatementTernaryOperators_ilk.tasks_iklhali;

import java.util.Scanner;

public class Task18__burclar {
    /* Koç Burcu : 21 Mart - 20 Nisan
       Boğa Burcu : 21 Nisan - 21 Mayıs
       İkizler Burcu : 22 Mayıs - 22 Haziran
       Yengeç Burcu : 23 Haziran - 22 Temmuz
       Aslan Burcu : 23 Temmuz - 22 Ağustos
       Başak Burcu : 23 Ağustos - 22 Eylül
       Terazi Burcu : 23 Eylül - 22 Ekim
       Akrep Burcu : 23 Ekim - 21 Kasım
       Yay Burcu : 22 Kasım - 21 Aralık
       Oğlak Burcu : 22 Aralık - 21 Ocak
       Kova Burcu : 22 Ocak - 19 Şubat
       Balık Burcu : 20 Şubat - 20 Mart

       switch-case kullanmadan yapınız. */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" burcunuzu giriniz : ");
        String burc =scan.next();

      if (burc.equalsIgnoreCase("koc")) System.out.println("21 Mart - 20 Nisan ");
      else if (burc.equalsIgnoreCase("boga")) System.out.println("21 Nisan - 21 Mayıs");
      else if (burc.equalsIgnoreCase("Yengeç")) System.out.println("23 Haziran - 22 Temmuz");
      else if (burc.equalsIgnoreCase("Aslan")) System.out.println("23 Temmuz - 22 Ağustos");
      else if (burc.equalsIgnoreCase("Başak")) System.out.println("23 Ağustos - 22 Eylül");
      else if (burc.equalsIgnoreCase("Terazi")) System.out.println("23 Eylül - 22 Ekim");
      else if (burc.equalsIgnoreCase("Akrep")) System.out.println("23 Ekim - 21 Kasım");
      else if (burc.equalsIgnoreCase("yay")) System.out.println("22 Kasım - 21 Aralık");
      else if (burc.equalsIgnoreCase("Oglak")) System.out.println("22 Aralık - 21 Ocak");
      else if (burc.equalsIgnoreCase("Kova")) System.out.println("22 Ocak - 19 Şubat");
      else if (burc.equalsIgnoreCase("Balık")) System.out.println("20 Şubat - 20 Mart");








    }
}
