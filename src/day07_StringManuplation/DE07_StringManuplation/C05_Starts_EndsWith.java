package day07_StringManuplation.DE07_StringManuplation;

import java.util.Scanner;

public class C05_Starts_EndsWith {
    public static void main(String[] args) {
        /*
          startsWith()
          Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
          String'in basladigi characteri dogrular
          endsWith()
          Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         */

        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        if (str.toLowerCase().startsWith("as")) {
            System.out.println("As ile başlıyor");
        } else System.out.println("As ile başlamıyor");

        if (str.toLowerCase().endsWith("ss")) {
            System.out.println("ss ile bitiyor");
        } else System.out.println("ss ile bitmiyor");


        String str2="dkjshf";
        if (str.toUpperCase().equals(str2.toUpperCase())) {
            // equalsIgnoreCase() = bunu devre dışı burakmak için yaptık
        }
        //Task-> girilen e-mail hesabının  @gmail.com içermiyorsa "lütfen gmail hesabı giriniz"
        // @gmail.com ile  bitiyorsa "hesabınız onaylandı" aksi durumda "geçerli hesap giriniz print edn code creae ediniz.



    }
}
