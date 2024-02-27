package z_calismalar.OCI_sinav._223.Q053_;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int num [] [] = new int [3] [2];
        for (int i = 0; i < num.length; i++) {  // num.length = 3
            for (int j = 0; j < num[i].length; j++) {  // num[i].length =2
                num [i][j]= 10;
            }
        }
        System.out.println(Arrays.deepToString(num));


    }
}
