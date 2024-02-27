package day12_Arrays.DE12_Arrays.Tasks;

public class _18_2d_array2 {

    public static void main(String[] args) {

        /*
        Şu şekilde olan bir 2D int Array'i oluşturunuz.  [{5,2,1} , {10,2,3,6} , {1,2}]
        2D array'de olan elemanları toplayınız.
        toplamı yazdırınız.
        Sonuç 32 olmalıdır.
         */
        int[][] dizi = {{5,2,1} , {10,2,3,6} , {1,2}};
        int toplam =0;// dizinin tüm elemanlarını toplamak için
        for (int i = 0; i < dizi.length ; i++) {
            for (int j = 0; j <dizi[i].length ; j++) {
             //   System.out.printf("%3d",dizi[i][j]);
                toplam    += dizi[i][j];
            }
            System.out.println();
        }
        System.out.println("Tüm toplam = " + toplam);


    }
}