package z_calismalar.OCI_sinav._223.Q052;

public class ztest1 {
    public static void main(String[] args) {
        String [] [] chs = new String [2] []; // chs.length =2
        chs[0] = new String [1]; // chs[0] a 97 atanacak sonra ikinci elemani yani 98 i atamaya calisacak ancak eleman sayisi 1 oldugu icin ArrayIndexOutOfBoundsException hatasi verir
        chs[1] = new String[5];
        int i =97;
        for (int a = 0; a < chs.length; a++) {
            for (int b = 0; b < chs.length; b++) {//length e kadar istemis 2 ye kadar
                chs [a][b]= " " + i;
                i++;
            }
        }
        for (String[] ca : chs) {
            for (String c : ca) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
		/*
		String []  a = new String [5]; // bestane null var
		System.out.println(Arrays.toString(a));
		 */
    }
}
