package day26_Exception.j26_Exceptions;


import java.util.ArrayList;

public class C12_Errors {

    public static void main(String[] args) {

        //System.out.println(20/0);  // RTE-> RunTimeException

        //String str = "asd;  // CTE -> " eksik  CTE_(CompileTimeError)

        // Error -> handle edilemeyen cheked, code ile  çözülemeyen sistemden kaynaklı buyuk hatalardır.

        // Errorlar unchecked'dır ve öngörülemezler ancak gerçekleştiğinde  app. çalışması durdurulur.

        ArrayList<String> liste = new ArrayList<>();
        String str="";
        for (int i = 0; i < 10000000 ; i++) {
            str+=i;
            liste.add(str);
            if (i%100000==0) System.out.println(i);

        }
    }
}
