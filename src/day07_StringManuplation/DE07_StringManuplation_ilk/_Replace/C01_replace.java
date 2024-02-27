package day07_StringManuplation.DE07_StringManuplation_ilk._Replace;

public class C01_replace {
    public static void main(String[] args) {

        // bir seyin yerine baska bir sey koymak icin kullaniriz
        // ikiside ya char yada string olmali
        String str = "Merhabe hasan";
        str =str.replace(" ", " bosluk "); //  " " yerine "bosluk" yazdir
        System.out.println(str);                              //Merhabe bosluk hasan

        str = str.replaceFirst("s", "l");
        System.out.println(str);                             //Merhabe bolluk hasan

        str = str.replaceAll("a","*");       // bütün a larin yerine * yap
        System.out.println(str);                            //Merh*be bolluk h*s*n

        str = str.replace("luk","-");
        System.out.println(str);                            //Merh*be bol- h*s*n








    }
}
