package day07_StringManuplation.DE07_StringManuplation.tasks;

public class Task03 {
    public static void main(String[] args) {
        // Task-> "Alamanya" Stringindeki ikinci 'a' caharacterinin indexini return eden code create ediniz

        String str = "Alamanya";
        int ilk_a_index     = str.indexOf('a',0);
        int ikinic_a_index  = str.indexOf('a',ilk_a_index+1);
        System.out.println("ikinic_a_index = " + ikinic_a_index);
        // 2.yol

        ikinic_a_index = str.indexOf('a',str.indexOf('a')+1);
        System.out.println("ikinic_a_index = " + ikinic_a_index);

    }
}
