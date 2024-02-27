package day15_Varargs.DE15_Varargs_ilk;

public class Task02 {
    public static void main(String[] args) {
         /*
        Task ->
        Girilen ilk sayı hariç diğerlerini toplayan ve toplam ile ilk sayıyı çarpan METHOD create ediniz.

         */
        int[] sayiArr = {2, 24, 23, 38, 33, 21, 59, 26, 10};

        ilkSayiHaricToplama(sayiArr);
    }

    private static void ilkSayiHaricToplama(int... dizi) {
        int toplam = 0;
        int ilkEleman = dizi[0];
        System.out.println(ilkEleman);
        for (int eleman : dizi) {
            toplam+=eleman;
        }
        System.out.println("toplam = " + toplam);
        int ilkSayiHaricToplam = toplam-ilkEleman;
        System.out.println("ilkSayiHaricToplam = " + ilkSayiHaricToplam);
        System.out.println("ilkSayiHaricToplam*ilkEleman = " + ilkSayiHaricToplam * ilkEleman);


    }

}
