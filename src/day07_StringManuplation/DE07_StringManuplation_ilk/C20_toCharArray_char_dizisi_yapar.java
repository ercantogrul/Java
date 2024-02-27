package day07_StringManuplation.DE07_StringManuplation_ilk;

public class C20_toCharArray_char_dizisi_yapar {
    public static void main(String[] args) {
        // bir stringi yeni bir karakter dizisine dönüstürür. Char[] döndürür.

        String str = "Merhaba Dunya nereye kdjh a dfkjh";
        char [] chDizisi =str.toCharArray();
        System.out.println(chDizisi+"-");  //M-e-r-h-a-b-a- -D-u-n-y-a- -n-e-r-e-y-e- -k-d-j-h- -a- -d-f-k-j-h-
        System.out.println("======================================");

        for (int i = 0; i < chDizisi.length; i++) {
            System.out.print(chDizisi[i]+"-");  // M-e-r-h-a-b-a- -D-u-n-y-a- -n-e-r-e-y-e- -k-d-j-h- -a- -d-f-k-j-h-

        }

    }
}
