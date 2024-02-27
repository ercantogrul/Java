package day12_Arrays.DE12_Arrays_ilk.Tasks;

import java.util.Arrays;

public class Task18__icArray_lerin_toplami___ {
    public static void main(String[] args) {
        // task-> sayi arr'deki iç arr'lerin toplamını yeni bir arr'ya atayıp print eden code create ediniz
        // input :int sayi[][]={{1,2,3},{19,-8},{24,10,-41}};
        // output : int yeniArr[]={6,11,-7}

        int[][] sayi = {{1, 2, 3}, {19, -8}, {24, 10, -41}};

        ayniIndexliOlanlariToplama(sayi);

    }

    private static void ayniIndexliOlanlariToplama(int[][] sayi) {
        int[] newArr = new int[sayi.length];

        for (int i = 0; i < sayi.length; i++) {

            for (int j = 0; j < sayi[i].length; j++) {
                newArr[i] += sayi[i][j];

            }
        }
        System.out.println("newArr = " + Arrays.toString(newArr));
    }


}

































