package day26_Exception;

import java.io.IOException;

public class C02_ArithmeticException {
    public static void main(String[] args)  {
        int a = 5;
        try {
            a = a/(a-5);
        } catch (ArithmeticException e) {
          //  throw new RuntimeException(e);
        }

      //  System.out.println("a = " + a);
        String str ="10a";
        int aa = Integer.parseInt(str);


    }
}
