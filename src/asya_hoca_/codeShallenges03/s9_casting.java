package asya_hoca_.codeShallenges03;

import java.util.Scanner;

public class s9_casting {
    public static void main(String[] args) {
        //Kullanıcıdan alınan short değerleri önce int'e atayın ardından double
        //Tüm değerleri ekrana yazdırın

        //Kullanıcıdan alınan double telefon numarasını int değere atayın ve ekrana
        // implicit casting: (Auto Widening- Otomatik Genisletme): dar veri tipinden daha genos veri tipine atama yapildiginda
        // Java Type casting otomatik olarak yapar. PARANTES ile belirtmek zorunda degiliz. veri kaybi olamaz.

        //explicit casting: (explicid Narrowing- Manuel Daralma):genis veri tipindan dar bir veri tipine atama yapildiginda
        // Java dönüsümü otomatik olarak yapmayacaktir. Java casting in bir problem olusturabilecegini varsayarak
        // MANUEL ONAY isteyecektir.  PARANTES ile belirtmek zorundayiz. veri kaybi olabilir.



        Scanner scan = new Scanner(System.in);
        System.out.println("telefon numaranizi giriniz");
        double phoneNummer = scan.nextDouble();
        System.out.println("phoneNummer: "+ phoneNummer);

        int phoneCode = (int) phoneNummer;  // zorunlu olarak casting yaptiriyor. veri kaybi olabilir.



        short s1 = scan.nextShort();
        int i1 = s1;                       // bunda ise zorunlu degil-- bunda  veri kaybi olmaz.
        System.out.println("i1 = " + i1);  // i1. yazip "soutv" basinca   System.out.println("i1 = " + i1); otomatik yazar.
        System.out.println("s1 = " + s1);



    }
}
