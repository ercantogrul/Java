package day12_Arrays.DE12_Arrays_ilk.Tasks;

public class _21_Array_reverse {

    public static void main(String[] args) {

        /*
        Girilen 123 Intiger'ının basamaklarını ters çevirin.
        Örnek:
        Input(girdi): 123
        Output(çıktı): 321
         */

        //Kodu aşağıya yazınız.

        int sayi = 123;
        String str = String.valueOf(sayi);
        String []dizi = str.split(""); // [1,2,3]

        for (int i = dizi.length-1; i >=0 ; i--) {


            System.out.print(dizi[i]);
        }

    }
}

