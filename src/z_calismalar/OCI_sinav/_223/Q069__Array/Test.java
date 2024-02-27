package z_calismalar.OCI_sinav._223.Q069__Array;

public class Test {
    public static void main(String[] args) {
        String[][] chs = new String[5][2];
        chs[0] = new String[2];
        chs[1] = new String[5]; // diger Arraylar tanimlanmadigi icin
        int i = 97;

        for (int a = 0; a < chs.length; a++) { // chs.length=5 oldugu icin halbuki iki eleman var. 3.,4.ve 5. elemani yazmak isteyecek ama yazamayacak ArrayIndexOutOfBoundsException verir
            for (int b = 0; b < chs.length; b++) { // her bir elemanlarin sayisi da  chs.length=5 oldugu icin örn: ilk elemana 5 meleman atamak isteyecek 2. elemani atadiktan sonra
                                                    // ArrayIndexOutOfBoundsException verir
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
/**
 * What is the result?
 * A. 97 9899 100 null null null
 * B. 97 9899 100 101 102 103
 * C. Compilation fails.
 * D. A NullPointerException is thrown at runtime.
 * E. An ArrayIndexOutOfBoundsException is thrown at runtime.
 */




// E
