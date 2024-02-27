package day01_Variable.DE3_01Variable_ilk;

public class AnaClass {
    public static void main(String[] args) {
       	/* java escape special characters -> https://www.w3schools.com/java/java_strings_specchars.asp

	  \n (or \r): starts from a new line : metni bir alt satırdan itibaren yazdırır.
	          \t:  horizontal tab : metni yatayda 1 tab miktarı kaydırır.
	          \\: prints a back slash :\ (ters slash) yazdırır
	          \': prints single quote :' tek tırnak yazdırır.
	          veya ' ' direk tek tirernak yazdiri
	          \": prints double quote :"" Çift tırnak yazdırır.
	          , virgül direk yazdirir
	          / kesme isareti direk yazdirir.

	          ----ln veya \n isareti bir alt satirda yazdiri
	          --NOT;-- ama sadece String ifadelerin basina yazilir. veriler int ise "\n" cift tirnak icerisinde string olarak yazilir.

	 */
        int number1;
        number1 = 5;
        System.out.println("Hello\tWorld " + number1);     //   Hello     World
        System.out.println("Hello\\World " + number1);     //    Hello\World
        System.out.println("'HelloWorld' " + number1);     //   'HelloWorld'
        System.out.println("\'HelloWorld\' " + number1);   //   'HelloWorld'
        System.out.println(" \"HelloWorld\" " + number1);  //   "HelloWorld"
        System.out.println(" Hello, World " + number1);    //   Hello, World
        System.out.println(" Hello / World " + number1);    //   Hello / World


        //=======ÖNEMLI=========ln veya \n isaretleri alt satira gönderiri ==========
        System.out.print("a");
        System.out.print("l");
        System.out.print("o");  // üc satiri yatay olarak alo (aynen böyle) seklinde yanyana yazar ve son satirda kalir.
        System.out.println("----o satirinda print te ln olmadigi icin bu satirida onun yanina yazar");

        System.out.println("a");   // a yaz alt satira gec, l yaz alt satira gec
        System.out.println("l");    // l yaz alt satira gec  demektir
        System.out.println("o"); //bu uc satirda print de ln oldugu icin yukardan asagiya alo yazar ve alt sayira gönderir.

        System.out.println("a\nl\no\n");  // \n isareti alt alta yazdiri, yukardan asagiya alo yazar ve alt sayira gönderir.
        System.out.print("a\nl\no\n");  // \n isareti alt alta yazdiri, yukardan asagiya alo yazar ve alt sayira gönderir.

        ///---------ÖNEMLI---------/////////////////____________________

        String txt = "Hello";
        System.out.println(txt.length()); // 5 //Txt dizesinin uzunluğunu yazdırmak için doğru yöntemi kullanın.
        String tx = "Hello";
        System.out.println(tx.toUpperCase());  // HELLO  //tx değerini büyük harfe dönüştürün.

        String firstName = "John ";
        String lastName = "Doe";
        System.out.println(firstName.concat(lastName));  // John Doe // ad soyad .concat ile birlestirilebilir.
        System.out.println(firstName+(lastName));  // John Doe // ad soyad + ile birlestirilebilir.

        String ab = "Hello Everybody";
        System.out.println(ab.indexOf("e"));  //1  // "e"nin ilk geçtiği yerin dizinini (konumunu) gösterir.:









    }
}
