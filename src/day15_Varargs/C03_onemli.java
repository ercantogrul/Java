package day15_Varargs;

public class C03_onemli {
    public static void main(String[] args) {

ortalamaHesaplama("ahmet",55,66,75);
ortalamaHesaplama("mehmet",50,86);
ortalamaHesaplama("serdar",45,72,85,90);



    }

    private static void ortalamaHesaplama(String isim, int...not) {
        int toplama =0;
        for (int w:not) {
            toplama+=w;
        }
        System.out.println(isim+" "+toplama/not.length);
    }
}
