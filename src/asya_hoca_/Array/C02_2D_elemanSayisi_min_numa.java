package asya_hoca_.Array;

public class C02_2D_elemanSayisi_min_numa {
    /*
     * {{1,2,3}, {2,3,-8} , {5,2,5} , {-12,1,3}} int 2D arrayini  olustur
     *  2D arrayinden min numberı ve dizinin her bir elemanı kaç diziden olştuğunu yazdırın
     */

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {2, 3, -8}, {5, 2, 5}, {-12, 1, 3}};
        int min = Integer.MAX_VALUE;
        int elemanSayisi = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                elemanSayisi=arr[i].length ;
                if (min>arr[i][j]) min=arr[i][j];

            }
            System.out.println(i + ". eleman sayisi = " + elemanSayisi);
        }
        System.out.println("min degeri: "+min);


    }


}
