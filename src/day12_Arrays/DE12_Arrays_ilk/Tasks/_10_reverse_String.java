package day12_Arrays.DE12_Arrays_ilk.Tasks;

public class _10_reverse_String {

    public static void main(String[] args) {

        /*
        Bir String oluşturun : "Hello World"
        Stringi tersten yazdırın ve print edin.
        Cevap böyle olmalı :  "dlroW olleH"
         */
        String [] array = {"Hello World"};
        String yeni = array[0];
        System.out.println(yeni);

        String tersten ="";
        for (int i = yeni.length()-1; i >=0 ; i--) {
            tersten += yeni.charAt(i)+"";

        }System.out.println(tersten);




    }
}