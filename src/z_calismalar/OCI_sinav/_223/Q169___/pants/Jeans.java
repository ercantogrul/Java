package z_calismalar.OCI_sinav._223.Q169___.pants;




// line n1  // üstteki class veya class icindeki methodu buraya import etmeliyiz
//sadece package import edersek onun icindeki class da bulunan methodu cagiramayiz----import package name---- seklinde olmaz
// import sekli:1-(import package name.class name) veya -----------import Q169.Shirt;
//              2-(import package name.*) -------------------------import Q169.*;
//              3-(import package name.class name.method name)-----import static Q169.Shirt.getColor;
public class Jeans {

    public void matchShirt() {
        //line n2
        String color = ""; // Bu satır soruda yok
        if(color.equals("Green")) {
            System.out.println("Fit");
        }
    }
    public static void main(String[] args) {
        Jeans trouser = new Jeans ();
        trouser.matchShirt();

        //*** ayni package icinde ki claslari import etmek zorunda degiliz
        //*** Farkli package icinde ki claslari import etmek zorundayiz (cünkü birden fazla package de birden fazla ayni isimde Method veya Variable olabilir)

    }

}
/* Which two sets of actions, independently, enable the code fragment to print Fit?

A). At line n1 insert: import Q169.Shirt; // burada Shirt class i import edilmis-- dolayisiyla o  class daki methoda artik ulasabilirim
    At line n2 insert: String color = Shirt.getColor(); // class import edilince class ismi ile (static oldugu icin ) cagirabilirim

B)  At line n1 insert: import Q169;
    At line n2 insert: String color = Shirt.getColor();

C)  At line n1 insert: import static Q169.Shirt.getColor;  // burada methodu direk import etmis
    At line n2 insert: String color = getColor();  // ve burada ise methodu dogrudan cagirmis

D)	At line n1 no changes required.
    At line n2 insert: String color = Shirt.getColor();

E)	At line n1 insert: import Shirt;
    At line n2 insert: String color = Shirt.getColor();

    A VE C

*/