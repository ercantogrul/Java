package day12_Arrays.DE12_Arrays_ilk.Tasks;

public class _11_Average_of_Array {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
        Array'in ortalamasını alınız.
         */
        //Kodu aşağıya yazınız.

        int [] array = {12, 14 , 21 ,23 , 10 ,4};

        int ortalama = ortalama(array);
        System.out.println("Array'in elemanlari ortalaması : "+ortalama);

    }

    private static int ortalama(int[] array) {
        int toplam = 0;
        int ortalama =0;
        for (int i = 0; i < array.length; i++) {
            toplam += array[i];
            ortalama = toplam/array.length;

        }
       return ortalama;
    }


}