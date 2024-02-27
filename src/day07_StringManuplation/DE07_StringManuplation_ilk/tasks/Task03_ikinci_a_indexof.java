package day07_StringManuplation.DE07_StringManuplation_ilk.tasks;

public class Task03_ikinci_a_indexof {
    public static void main(String[] args) {
        // Task-> "Alamanya" Stringindeki ikinci 'a' caharacterinin indexini return eden code create ediniz

        String str = "Alamanya";

        int harf = str.indexOf('a',str.indexOf('a')+1);  // ikinci 'a' caharacterinin indexini---a+1 den sonra ki 'a' yi goster.
        System.out.println("ikinci a harfinin karakter yeri: "+harf);
        System.out.println(str.indexOf('a',str.indexOf('m')));     // m den sonraki a harfinin indeksini göster.
        int abc = str.indexOf('a','m');                  //  char oldugu icin  ' ' KULLANMALIYIZ





        /*
        int ilk_a_index = str3.indexOf('a');
        int ikinci_a_index = str3.indexOf('a', ilk_a_index+1);
        System.out.println("ikinci_a_index :"+ ikinci_a_index);
        */

        String str3 = "Alamanya";
        int ilk_a_index     = str3.indexOf('a',0);
        int ikinic_a_index  = str3.indexOf('a',ilk_a_index+1);
        System.out.println("ikinic_a_index = " + ikinic_a_index);

        // 2.yol

        ikinic_a_index = str3.indexOf('a',str3.indexOf('a')+1);
        System.out.println("ikinic_a_index = " + ikinic_a_index);

    }












}
