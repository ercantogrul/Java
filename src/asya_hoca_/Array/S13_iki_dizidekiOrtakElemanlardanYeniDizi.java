package asya_hoca_.Array;

import java.util.Arrays;

public class S13_iki_dizidekiOrtakElemanlardanYeniDizi {
    public static void main(String[] args) {
        //İki dizinin ortak elemanlarını başka bir dizide gösterin
        String[] a = {"akın", "hüseyin", "zehra", "ali", "ahmet", "Zeynep", "yusuf"};
        String[] b = {"hüseyin", "zehra",};

        birincicozum(a,b);
        birincicozum1(a,b);


    }

    private static void birincicozum1(String[] a, String[] b) {
    }

    private static void birincicozum(String[] a, String[] b) {
        int counter = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i].equalsIgnoreCase(b[j])) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
        String[] c = new String[counter];
        for (int i = 0; i < c.length; i++) {
            c [i]=b[i];

        }
        System.out.println(Arrays.toString(c));


    }
}
