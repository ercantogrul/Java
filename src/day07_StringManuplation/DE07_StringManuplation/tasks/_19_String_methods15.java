package day07_StringManuplation.DE07_StringManuplation.tasks;

public class _19_String_methods15 {

    public static void main(String[] args) {

        /* Main method oluşturun.
            Mouse değerinde bir String oluştur.
            Mouse String'inin 2. sırasındaki karakteri yazdırın.  */

        //Kodu buraya yazınız.
        String str = "Mouse";
        char ikinciKarekter = str.charAt(2);
        System.out.println("str nin 2.karekteri = " + str.charAt(2));
        System.out.println("str nin 2.karekteri = " + ikinciKarekter);

        System.out.println("str nin 2.karekteri = " + str.substring(2,3));

        // "merhaba dunya" bosluktan sonrakini alalım
        String s = "merhaba dünya";
        System.out.println(s.substring(s.indexOf(" ")+1));

        // dünyanın ilk karekteri buyuk olsun
        int bi = s.indexOf(" ");
        System.out.println(s.substring(bi+1,bi+2).toUpperCase()+s.substring(bi+2));


    }
}
