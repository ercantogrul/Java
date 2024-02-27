package asya_hoca_.Array;

import java.util.Arrays;

public class S13_iki_dizidekiOrtakElemanlardanYeniDizi_farkliCozum {
    public static void main(String[] args) {
        //İki dizinin ortak elemanlarını başka bir dizide gösterin
        String[] a = {"akın", "hüseyin", "zehra", "ali", "ahmet", "Zeynep", "yusuf"};
        String[] b = {"hüseyin", "zehra", "hamit"};
        int n = 0;
        if (a.length > b.length) {
            for (int i = 0; i < b.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    if (b[i].equals(a[j])) {
                        n++;                 // ayni olan kelime sayisi bulunur, yeni dizi icin eleman sayisi
                    }
                }
            }
            String[] c = new String[n];
            for (int i = 0; i < b.length; i++) {
                for (int j = 0; j < a.length; j++) {

                    if (b[i].equals(a[j])) {
                        c[i] = b[i];
                    }
                }
            }
            System.out.println(Arrays.toString(c));
        } else {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b.length; j++) {
                    if (a[i].equals(b[j])) {
                        n++;
                    }
                }
            }
            String[] c = new String[n];
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b.length; j++) {
                    if (a[i].equals(b[j])) {
                        c[i] = a[i];
                    }
                }
            }
            System.out.println(Arrays.toString(c));


        }
    }
}