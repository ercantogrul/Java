package z_calismalar.OCI_sinav._223.Q003_LocalDate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class q003_2 {
    public static void main(String[] args) {
        /*
         String date = LocalDate
                .parse("2014-05-04")        		// time is not assigned here
                .format(DateTimeFormatter.ISO_DATE_TIME);  	//_TIME should be removed
        System.out.println(date);

         */


        String date1 = LocalDate
                .parse("2016-05-02")
                .format(DateTimeFormatter.ISO_DATE);
         System.out.println(date1); //2016-05-02


    }
}
