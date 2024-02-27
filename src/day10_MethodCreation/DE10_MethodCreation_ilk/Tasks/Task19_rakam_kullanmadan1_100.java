package day10_MethodCreation.DE10_MethodCreation_ilk.Tasks;

public class Task19_rakam_kullanmadan1_100 {

    public static void main(String[] args) {
        /*
   task->
   INTERVIEW SORUSU !!!
   1'den 100'e kadar hic rakam  kullanmadan sayilari print eden METHOD create ediniz

    */

        char ch1 =1;
        char ch2 =100;
        System.out.println(sayiKullanmadan(ch1,ch2));

    }

    private static String sayiKullanmadan(char ch1, char ch2) {
        String str3="";
        for (int i = ch1; i<ch2 ; i++) {
            str3 =str3+ i+", ";

        }
        return str3;


    }
}
