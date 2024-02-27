package Faruk_hoca_yeni_ilk5gun.DE01_Variable;

public class AnaClass {
    public static void main(String[] args) {
       	/* java escape special characters -> https://www.w3schools.com/java/java_strings_specchars.asp

	  \n (or \r): starts from a new line : metni bir alt satırdan itibaren yazdırır.
	          \t:  horizontal tab : metni yatayda 1 tab miktarı kaydırır.
	          \\: prints a back slash :\ (ters slash) yazdırır
	          \': prints single quote :' tek tırnak yazdırır.
	          \": prints double quote :"" Çift tırnak yazdırır.
	 */
        int number1;
        number1 = 5;
        System.out.println("Hello\tWorld " + number1);
        System.out.println("Hello\\World " + number1);
        System.out.println("'HelloWorld' " + number1);
        System.out.println(" \"HelloWorld\" " + number1);



    }
}
