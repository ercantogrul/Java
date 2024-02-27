package day05_ifStatementTrernaryOperators.DE05_IfStatementTernaryOperators_ilk;

public class C01_IfStatement {
    public static void main(String[] args) {

       /* Bagimsiz if cumleleri isminden de anlasilacagi uzere kodun kalani ile ilgilenmez
        sadece boolean sarta odaklanir sartin sonucu true ise if body'si calisir
        bolean sartin sonucu false ise if body'si devreye girmez

        YANIII
        birden fazla bagimsiz if cumlesi olan bir kod calistiginda
        kac tane if body'sinin calisacagi verilen degerlere baglidir

        tum if body'leri calisabilir bazilari calisabilir ya da hic bir if body'si calismayabilir
         */

        int a = -201;
        int b = 104;

        if (a>0){ // false
            System.out.println("a sayisi pozitif");
        }

        if (a+b>100){ // false
            System.out.println("sayilarin toplami 100'den buyuk");
        }

        if (b % 3 == 0){ // false
            System.out.println("b 3 ile tm bolunen bir tamsayidir");
        }

        if (b<100){ // false
            System.out.println("b 100'den kucuk bir tamsayidir");
        }




       /* Dikkat edilecekler
        1- eger boolean sarttan sonra {} kullanilmazsa Java if body'si olarak ilk ; e kadar olan bolumu alir
        digerleri if body'sinin disinda kalir
        2- if cumlesinde {} kullanmaz ve  boolean sartin sonuna ; yazarsaniz
        if cumlesi hic bir islem yapmaz  cunku body'si yoktur

        OZETLE
        if body'si tek satirdan olusuyorsa {} kullanmasaniz da olur
        ancak if body'si birden fazla satirdan olusuyorsa MUTLAKA {} kullanmalisiniz
        */

        int i1 = 35;
        int i2 = 30;

        if (i1 < i2){
            System.out.println("i1 i2'den kucuk 1");
            System.out.println("i1 i2'den kucuk 2");
            System.out.println("i1 i2'den kucuk 3");
        }


        if (i1 % 2 == 0)
            System.out.println("i1 2 ile tam bolunuyor 1"); // ilk ; e kadar olan kisim if body'sidir
            System.out.println("i1 2 ile tam bolunuyor 2"); // sonraki satirlarin if ile ilgisi yoktur
            System.out.println("i1 2 ile tam bolunuyor 3");









    }
}
