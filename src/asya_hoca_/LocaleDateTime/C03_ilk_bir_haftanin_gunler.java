package asya_hoca_.LocaleDateTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class C03_ilk_bir_haftanin_gunler {
    public static void main(String[] args) {
        //Bu günden itibaren ilk bir haftanın tarihlerini bir listede yazdırınız.
        //Aşağıdaki listede polindrome olan kelimeri yazdırın.For Each Loop kullanarak
       // String[] words = {"asa", "level", "java", "küçük","kaza", "kazak", "yapay"};

        List<String> gunler = new ArrayList<>();

        LocalDate today = LocalDate.now();
        for (int i = 0; i < 7; i++) {

            gunler.add(String.valueOf(today.plusDays(i)));

        }System.out.println(gunler);


        //==========ikinci yol=================
        LocalDate heute= LocalDate.now();

        for (int i = 0; i < 7; i++) {
            System.out.print(today.plusDays(i).getDayOfWeek()+" ");
        }



    }
}
