package day07_StringManuplation.DE07_StringManuplation_ilk.tasks;

public class _19_String_methods15__charAt_ {

    public static void main(String[] args) {

        /* Main method oluşturun.
            Mouse değerinde bir String oluştur.
            Mouse String'inin 2. sırasındaki karakteri yazdırın.  */

        //Kodu buraya yazınız.

        String str = "Mouse";
        char ikinciKarekter = str.charAt(2);
        System.out.println("str nin 2.karekteri = " + str.charAt(2));
        System.out.println("str nin 2.karekteri = " + ikinciKarekter);   // ikinci siradaki karakter yazdirildi  --u

  // ikinci yöntem===================
        System.out.println("str nin ikinci karakteri :"+ str.substring(2,3));     // ikinci siradaki karakter yazdirildi  --u
//_________________________________________________________________________________________________

        String ab = "Maus Micky";
        int indexBosluk = ab.indexOf(" ");
        System.out.println(ab.substring(2,ab.indexOf(" "))+'a');  // 2. karakterden bosluk karakterine kadar al 'a' ile birlestir. //  usa


        // "merhaba dunya" bosluktan sonrakini alalım
        String s = "merhaba dünya";
        System.out.println(s.substring(s.indexOf(" ")+1));      //dünya

        // dünyanın ilk karekteri buyuk olsun
        int bi = s.indexOf(" ");
        System.out.println(s.substring(bi+1,bi+2).toUpperCase()+s.substring(bi+2));   //Dünya









    }
}
