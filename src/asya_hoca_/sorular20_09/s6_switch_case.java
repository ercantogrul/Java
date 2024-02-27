package asya_hoca_.sorular20_09;

import java.util.Scanner;

public class s6_switch_case {
    public static void main(String[] args) {
          /*
    switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
    switch() de int, byte, short, char, String kullanilir.
     */
 /*  Task->
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri
    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri
    gun carsamba veya cumartesi ise:
    SQL dersi gunleri
    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/
        Scanner scan =new Scanner(System.in);
        System.out.print("gün ismi giriniz : ");
        String gun = scan.next();
        gun = gun.toLowerCase();

        switch (gun){
            case "pazartesi" :
            case "sali"      : System.out.println("Java dersi gunleri");break;
            case "persembe"  :
            case "cuma"      : System.out.println("Selenyum dersi gunleri");break;
            case "carsamba"  :
            case "cumartesi" : System.out.println("SQL dersi gunleri");break;
            case "pazar"     : System.out.println("izin günü");break;
            default:
                System.out.println("hatali giris yaptiniz");
        }











    }
}
