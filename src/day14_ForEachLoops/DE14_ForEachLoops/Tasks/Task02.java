package day14_ForEachLoops.DE14_ForEachLoops.Tasks;

public class Task02 {
    public static void main(String[] args) {
        double[] arr = {23, 5, 6.5, 5, 15.7, 45};
        // yukarıdaki şekilde bir array verilmiştir for-each kullanarak elemanlarının ortalamasını bulun
        // ortalama = elemanların_toplamı / toplam_eleman_sayısı for-each ile yapın

        double toplam =0;
        int ortalama =0;
        for (double sayi :arr) {
            toplam+=sayi;

        }
        System.out.println("toplam = " + toplam);
        System.out.println("ortalama = " + (toplam/arr.length));

    }
}
