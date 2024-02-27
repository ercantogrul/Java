package day07_StringManuplation.DE07_StringManuplation_ilk;

import java.util.Scanner;

public class C11_StartsWith_EndsWith {
    public static void main(String[] args) {
        /*
          startsWith()
          Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
          String'in basladigi characteri dogrular
          endsWith()
          Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         */
        String str = "Java cok guzel";
        // str Java ile mi basliyor?
        System.out.println(str.startsWith("Java")); // true
        // str J ile mi baslar
        System.out.println(str.startsWith("J")); // true
        // str Ja ile mi basliyor
        System.out.println(str.startsWith("Ja")); // true
        // str "Java cok guzel" ile mi basliyor ?
        System.out.println(str.startsWith("Java cok guzel")); // true

        System.out.println(str.startsWith("")); // true

        // 5.indexden sonrasi (5. index dahil) c ile mi baslar ?
        System.out.println(str.startsWith("c",5)); // true    //cok guzel

        // 6.indexden sonrasi ok ile mi baslar ?
        System.out.println(str.startsWith("ok",6)); // true

  //===========EndsWith====================================
        //"Java cok guzel";
        // str guzel ile mi biter?
        System.out.println(str.endsWith("guzel")); // true
        // str el ile mi biter?
        System.out.println(str.endsWith("el")); // true
        // str Java cok guzel ile mi biter ?
        System.out.println(str.endsWith("Java cok guzel")); // true

        // str "" ile mi biter ?
        System.out.println(str.endsWith("")); // true
        // str " " ile mi biter ?
        System.out.println(str.endsWith(" ")); // false


        // SORU : kullanicidan bir mail alin
        //       - mail @ icermiyorsa "gecersiz mail"
        //       - mail @gmail.com icermiyorsa, "mail gmail olmali"
        //       - mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var" yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen mail adresiniz giriniz");
        String mail = scanner.nextLine();

        if (!mail.contains("@")){
            System.out.println("gecersiz mail");
        } else if (!mail.contains("@gmail.com")) {
            System.out.println("mail gmail olmali");
        } else if (!mail.endsWith("@gmail.com")) {
            System.out.println("mailde yazim hatasi var");
        }


        Scanner scan = new Scanner(System.in);
        String str4 = scan.next();
        if (str4.toLowerCase().startsWith("as")) {       // girilen metni once kücük harflere cevrildi sonra kelime "as" ile basliyor ise;
            System.out.println("As ile başlıyor");
        } else System.out.println("As ile başlamıyor");

        if (str4.toLowerCase().endsWith("ss")) {             // girilen metin ss ile bitiyor mu
            System.out.println("ss ile bitiyor");
        } else System.out.println("ss ile bitmiyor");


        String str2="dkjshf";
        if (str4.toUpperCase().equals(str2.toUpperCase())) {
            // equalsIgnoreCase() = bunu devre dışı burakmak için yaptık
        }
        //Task-> girilen e-mail hesabının  @gmail.com içermiyorsa "lütfen gmail hesabı giriniz"
        // @gmail.com ile  bitiyorsa "hesabınız onaylandı" aksi durumda "geçerli hesap giriniz print edn code creae ediniz.






    }
}
