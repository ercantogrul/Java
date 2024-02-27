package day32_Enum.DE32_Enum.enum5;


import java.util.Arrays;

import static day32_Enum.DE32_Enum.enum5.ILLER.*;

public class Runner {
    public static void main(String[] args) {

        System.out.println(ADANA);
        System.out.println(ILLER.ADANA.getPlkCode());
        System.out.println(TRABZON.getPlkCode()); // ILLER import edilince ILLER yazmaya gerek kalmadi

        System.out.println(ILLER.getIL("20"));
        System.out.println(ILLER.getIL("63"));
        System.out.println(getIL("35")); // yukardaki ile ayni

        System.out.println(Arrays.toString(ILLER.values()));
        //[ADANA, ADIYAMAN, ANKARA, ISTANBUL, IZMIR, SANLURFA, TRABZON]





    }
}
