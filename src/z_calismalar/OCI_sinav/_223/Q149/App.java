package z_calismalar.OCI_sinav._223.Q149;

public class App {
	public static void main(String[] args) {
        Boolean[] bool = new Boolean[2];

        bool[0] = new Boolean(Boolean.parseBoolean("TRUE")); // birinci elemana true degeri atanmis bu degerde Wrapper Boolean a cevrilmis. büyük harfle de yazilsaydi true dönerdi
        // primitive boolean sadece kucuk harflerle true ve false alir iken....
        //Wrapper olan Boolean True veya TreuE vb seklinde yazilsada true dönderir.
        bool[1] = new Boolean(null);
        // boolean sadece false ve true degeri alir.bunun haricinde null veya sayi degeri verilmesi durumunda false dönderir.

        System.out.println(bool[0] + " " + bool[1]);

                //boolean = sadece true, false degerlerini alir
                //Boolean = ise    true, false ve null degerlerini alabilir


    }
}


/*Second Version
this is changed
bool[0] = new Boolean(1);
//parseBoolean =Returns the value of this {@code Boolean} object as a boolean primitive.
//stringi boolean a ceviriyo
bool[1]=new Boolean(boolean.parseBoolean("true"));
.println(bool[0]+" "+bool[1]);
//answer is =
false true
*///cengiz: if you dont see true then false


// What is teh result?
// A True False
//B. True null
//C. Compilation fails
//D. A NullPointerException is thrown at runtime

//Answer : A



