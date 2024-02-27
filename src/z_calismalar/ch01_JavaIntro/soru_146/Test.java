package z_calismalar.ch01_JavaIntro.soru_146;

public class Test {
    public static void main(String[] args) {

        String[] strs = new String[2];
        int idx = 0;
        strs[0] = "";
        strs[1] = "";
        for (String s : strs) {
            strs[idx].concat(" element " + idx);
            idx++;
        }
        for (idx =0; idx <strs.length; idx++){
            System.out.println("strs[" + idx + "] = " + strs[idx]);
        }

    }
}
