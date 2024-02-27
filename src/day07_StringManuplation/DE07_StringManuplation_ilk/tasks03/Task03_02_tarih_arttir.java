package day07_StringManuplation.DE07_StringManuplation_ilk.tasks03;

public class Task03_02_tarih_arttir {
    public static void main(String[] args) {
        // Bir tarih string olarak veriliyor , bir sonraki günün tarihini yazdırınız
        // tüm aylar 30 gün olarak düşünün, ( yıl aşımını dikkate almayın 3.kademe)  (
        // input = "20/11/2022" , input 2 : "30/11/2022"
        // output= "21/11/2022" , output 2: "01/12/2022"

        String tarih = "20/11/2022";  // istenen tarih "21/11/2022"
        // eger tarih "30/11/2022" ise yeni tarih "01/12/2022" olacak

        String yeniTarih="";
        int gun = Integer.parseInt(tarih.substring(0,2));   // stringi int e ceviriyoruz.
        gun++;

        if ( gun>30) {
            int ay = Integer.parseInt(tarih.substring(3,5));
            ay++;
            yeniTarih = "01/"+ay+tarih.substring(5);
        }else {
            yeniTarih=gun+tarih.substring(2);
        }

        System.out.println(yeniTarih);







    }
}
