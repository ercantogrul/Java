package z_calismalar.OCI_sinav._223.Q053_;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        int num [] [] = new int [3] [1];
        //System.out.println(Arrays.deepToString(num));
        for (int i = 0; i < num.length; i++) {  // num.length = 1
            for (int j = 0; j < num[i].length; j++) {  // num[i].length =3
                num [i][j]= 10;
            }
        }
        System.out.println(Arrays.deepToString(num));
        System.out.println(num [0][0]);
        System.out.println(num [1][0]);
        System.out.println(num [2][0]);
    }
}
