package day07_StringManuplation.DE07_StringManuplation_ilk.tasks;

public class _18_String_methods14___stringe_yeni_atama_yapmayinca_ilk_halini_okur {

    public static void main(String[] args) {

        /*  String s1 = "      Techno Study          ";
            s1 String'inin önündeki ve arkasındaki boşlukları kaldırın.
            s1 String'ini yazdırın.  */

        //Kodu aşağıya yazınız.
        String str = "      Techno Study          ";
        System.out.println(str);                           // yazdirdik
        System.out.println(str.length());                  // uzunlugu hesapladik
        System.out.println(str.trim());                  //bosluklar alindi
        System.out.println(str.length());                // bosluklari alsak bile str yukarida tanimlandigi icin o sekliyle cikti alabiliriz== 28 karakter

          //ama str yi bosluklari alindiktan sonra tekrar tanimlarsak
        str = str.trim();
        System.out.println(str);
        System.out.println(str.length());            //uzunlugu hesapladik == 12 karakter oldu

        /*String str2 = str.trim();
        System.out.println(str2.length());   //bosluklardan sonra  uzunluk
        System.out.println(str2);
        */
        // hocanin cözümü

        String s1 = "      Techno Study          ";
        s1 = s1.trim();
        System.out.println("-"+s1+"-");






    }
}
