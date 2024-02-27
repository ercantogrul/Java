package z_calismalar.OCI_sinav._223.Q011_146_201;

public class tst {
    public static void main(String[] args) {
        String[] strs = {"A", "B"};
        int idx = 0;
        for (String s : strs) {
            strs[idx]=strs[idx].concat(" element " + idx);
            idx++;                                    //0. elemana A element 0 eklenir sonrada idx bir artar
        }                                             //1. elemana B element 1 eklenir
        // String[] strs = {"A element 0", "B element 1"}; olur
        for (idx = 0; idx < strs.length; idx++) {
            System.out.println(strs[idx]);
        }
    }
}
