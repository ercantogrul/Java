package Faruk_hoca_yeni_ilk5gun.DE04zIlk4dersDegerlendirmeSorulari;

public class C06_Math02 {
    public static void main(String[] args) {
        // verilen 3 double sayıdan büyük olanını, diğer ikisinin toplamından buyuk ise
        // ekran true, aksi halde ekrana false yazdırın
        double d1 = 10;
        double d2 = 20;
        double d3 = 12;

        double enB = Math.max(d1,Double.max(d2,d3)); // buyuyu bulduk
        double kucuklerinToplami = (d1+d2+d3) - enB;
        System.out.println(enB>kucuklerinToplami);

    }
}
