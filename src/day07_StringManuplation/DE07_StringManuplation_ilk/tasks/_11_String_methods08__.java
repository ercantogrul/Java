package day07_StringManuplation.DE07_StringManuplation_ilk.tasks;

public class _11_String_methods08__ {

    public static void main(String[] args) {

        /*  apple olan bir String oluşturun.
            String'in içinde app olup olmadığını doğrula.   */

        //Kodu aşağıya yazınız.


        //===============
        String str = "apple";
        if (str.contains("app")) System.out.println("app vardır");
        else System.out.println("app yoktur");


        // yol2
        System.out.println(str.contains("app"));

        // büyük küç harf dikkat almasın dersek
        System.out.println(str.toUpperCase().contains("app".toUpperCase()));  //harfleri büyütülen Str nin icerisinde -iceriyor mu-harfleri büyütülen "app"-





    }
}
