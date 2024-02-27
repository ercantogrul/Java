package day07_StringManuplation.DE07_StringManuplation_ilk.tasks02;

public class Task02_04 {
    public static void main(String[] args) {
        // "ad soyad" şeklinde string veriliyor,  soy ad içierisinde ki ilk
       // "e" harfinin indexini bulun


        String ad ="emre kaerim";
        int eindex = ad.indexOf("e",ad.indexOf(" ")+1);  // bosluktan sonraki e yi bul
        System.out.println(eindex);              // 7 de












    }
}
