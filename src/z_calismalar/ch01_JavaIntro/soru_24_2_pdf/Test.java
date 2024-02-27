package z_calismalar.ch01_JavaIntro.soru_24_2_pdf;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String[] strs = new String[2];
        System.out.println("Arrays.toString(strs) = " + Arrays.toString(strs)); // Arrays.toString(strs) = [null, null]
        int idx =0;
        strs[0]="s";
        strs[1]="s";
        System.out.println("strs[0] = " + strs[0]); // strs[0] = null
        for(String s : strs){
           strs[idx].concat(" element " + idx); // burada NullPointerException alinir
            idx++;
        }
        for (idx =0; idx < strs.length; idx++){
            System.out.println("strs[idx] = " + strs[idx]);

        }
    }
}
