package z_calismalar.OCI_sinav._223.Q003_LocalDate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q003 {
    public static void main(String[] args) {

        String date = LocalDate
                .parse("2014-05-04")        		// time is not assigned here
                .format(DateTimeFormatter.ISO_DATE_TIME);  	//_TIME should be removed
        System.out.println(date);

         /* ÖNEMLI
        String date1 = LocalDate.parse("2016-05-02").format(DateTimeFormatter.ISO_DATE);  olsaydi
         System.out.println(date1); //2016-05-02
         */





    }

}
    /*  What is the result?
        A. May 04, 2014T00:00:00.000
        B. 2014-05-04T00:00: 00.000
        C. 5/4/14T00:00:00.000
        D. An exception is thrown at runtime.








D    */