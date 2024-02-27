package day12_Arrays.DE12_Arrays_ilk.Tasks;

public class _03_Create_array3_int {

    public static void main(String[] args) {
    /*    İnt Array oluştur ve elemanları   : 25,30,30,35,100
          Array in elemanlarının toplamını yazdır.
          Cevap 220 olmalı.
     */
        //Kodu aşağıya yazınız..

        int [] array = {25,30,30,35,100};
        elemanlariTopla(array);

    }

    private static void elemanlariTopla(int[] array) {
        int toplam =0;
        for (int i = 0; i < array.length; i++) {
            toplam += array[i];
        }
        System.out.println(toplam);
    }
}