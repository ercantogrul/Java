package asya_hoca_.Projects.Manav2;

public class RunnerManav2 {
    public static void main(String[] args) {
        Manav2 sec = new Manav2();
        sec.urunVeFiyatBilgilendirme();
        sec.urunSecim();
        System.out.println("\"Toplam odenmesi gereken tutar: = " + sec.toplamUcret);
    }

}
