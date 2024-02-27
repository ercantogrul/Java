package day14_ForEachLoops.DE14_ForEachLoops.Tasks;

public class Task04 {
    public static void main(String[] args) {
        // aşağıdakı dizinin tüm elemanlarının ortalamasını hesaplayınız (for-each kullanılacak
        int[][] arr = {{2, 3, 1}, {4,1}, {1, 2, 5, 6, 7}};

        int toplam =0;
        int ortalama =0;
        for (int[] icArr:arr) {
            toplam =0;
            ortalama =0;
            int elemanSayisi=0;
            for (int eleman:icArr ) {
                toplam+=eleman;
                elemanSayisi++;
                ortalama = toplam/elemanSayisi;
            } System.out.println("Her bir elemanin ortalamasi = " + ortalama);
        }

        System.out.print("genel ortalama = ");

        int toplam1 =0;
        int ortalama1 =0;
        int elemanSayisi=0;
        for (int[] icArr:arr) {
            for (int eleman:icArr ) {
                toplam+=eleman;
                elemanSayisi++;
                ortalama = toplam/elemanSayisi;
            }
        }System.out.print(ortalama);



    }
}
