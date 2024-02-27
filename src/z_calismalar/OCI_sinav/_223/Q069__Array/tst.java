package z_calismalar.OCI_sinav._223.Q069__Array;

public class tst {
    public static void main(String[] args) {
        String[][] chs = new String[2][2];  //
        chs[0] = new String[3];
        chs[1] = new String[5]; // diger Arraylar tanimlanmadigi icin
        int i = 97;

        for (int a = 0; a < chs.length; a++) { // eleman sayisi 2 oldugu icin hata vermez
            for (int b = 0; b < chs.length; b++) {
                chs[a][b] = " " + i;
                i++;
            }
        }
        for (String[] ca : chs) {
            for (String c : ca) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
