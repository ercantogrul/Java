package z_calismalar.OCI_sinav._223.Q069__Array;

public class tst2 {
    public static void main(String[] args) {
        String[][] chs = new String[5][2];  //
        chs[0] = new String[3];
        chs[1] = new String[3];
        chs[2] = new String[2];
        chs[3] = new String[2];
        chs[4] = new String[2];
        int i = 97;

        for (int a = 0; a < chs.length; a++) { // eleman sayisi 5 oldugu icin hata vermez  ama
            for (int b = 0; b < chs.length; b++) {// her bir elemanin sayisi da  chs.length=5 dir ve her elemana 5 eleman atamak isteyecek
                // örn: ilk elemana 5 eleman atamak isteyecek 3. elemani atadiktan sonra ArrayIndexOutOfBoundsException verir
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
