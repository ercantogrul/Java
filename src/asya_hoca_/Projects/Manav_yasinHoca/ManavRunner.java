package asya_hoca_.Projects.Manav_yasinHoca;

public class ManavRunner {
    public static void main(String[] args) {
        Manav sec =new Manav();
        menu();
        sec.secim();
        System.out.println(sec);
        System.out.println("Toplam odenmesi gereken tutar: "+sec.toplamUcret);
    }



    private static void menu() {
        System.out.println("            Kilo/Fiyat\n" +
                " 1. Domates :      30Tl\n" +
                " 2. Biber   :      40Tl\n" +
                " 3. Marul   :      20Tl\n" +
                " 4. Roka    :      40Tl\n" +
                " 5. Avakado :      30Tl\n" +
                " 6. Cikis");
    }
}
