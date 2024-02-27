package day12_Arrays.DE12_Arrays_ilk.Tasks02;

import java.util.Arrays;

public class T01 {
    public static void main(String[] args) {

        String str2 = "Selamlar mehmet bey nasılsınız";
        String[] strArr2=str2.split(" ");
        System.out.println(Arrays.toString(strArr2));//[Selamlar, mehmet, bey, nasılsınız]

        String str3 = Arrays.toString(strArr2);
        System.out.println(str3);                   //[Selamlar, mehmet, bey, nasılsınız]
        // yukarıdaki strArr2 dizisini string cevirin ama str2 dekinin aynısı olsun
        // en az 2 yöntem

        birinciyol(str3);
        ikinciciyol(str3);


    }
    private static void birinciyol(String str3) {
        String yeni = str3.substring(1,str3.length()-1);
        System.out.println("yeni String 1.yol : "+yeni);
    }
    private static void ikinciciyol(String str3) {
        String str = str3+" ";            // Stringe formülümüz icin bir bosluk ekledik
        String kelime = "";
        for (int i = 0; i < str.length(); i++) {

            kelime += str.substring(0, str.indexOf(" "))+" ";
            str = str.substring(str.indexOf(" ")+1);// her seferinde ilk bosluktan itibaren str yi kisalttik

        }System.out.println(kelime);
    }
}
