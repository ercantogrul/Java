package day02_DataTyps_WrapperClass.DE03_DataTypes_WrapperClass_Concatenation_ilk;

public class C01_CreateVariables {
    public static void main(String[] args) {
         /*Variable bellekte (memory) ayrilmis olan alanin (reserved area) adidir.
          Variable icinde deger saklayan bir konteynirdir
        bir variable oluştururken içerisine koyacağimiz datanın değer alabileceği değerlere uygun bir data türü seçmeliyiz
        örneğin bir şehrin nufusundan bahsediyorsak variablemızın data türü String,boolean,char veya double alamayız
        geriye kalan tamsayı  turlerınden şehrin nufusunu içine alabilecek büyüklükte bir data turu seceebiliriz
        kurs boyunca genelde tam sayılar için int ondalıklı sayılar için double kullanacagız
        2 tür variable var
        1 - primitive , kucuk harfle başlar
        2 - non-primitive ( class) variable, buyuk harfle başlar

         variable create(Değişken oluşturmak) için..
         1- DataType(Değişken türü) VariableName(Değişken ismi) "=" value(değişken değeri) ";"
                     int                  yas                    =  48  ;
                        Declaration(Tanımlama)                   =  Assaignment(Atama)
        Variable nasil olusturulur?

        1)Access Modifier   2)Data Type     3)Variable ismi     4) =       5)Deger    6);

         Java'da ";" Ingilizce'deki "." gibidir
         Ingilizce'de "cumle" deriz, Java'da "statement" deriz

         "=" sembolu "Assignment(Atama) Operator" olarak adlandirilir
         "Assignment(Atama) Operator" sagdaki degeri alir soldaki variable'in icine koyar
         */
        int sayi,sayi2,say3; // null
        sayi = 25;
        int sayi4 = 17;
        System.out.println(sayi+sayi4);
        String str = "Merhaba ayşe"; //
        double dd = 20;
        System.out.println(dd);
        System.out.println(sayi/sayi4);

        System.out.println(sayi/dd);                                // 1.25
        System.out.println(1.0*sayi/sayi4);                        //  1.4705882352941178
        dd = 1.0*sayi/sayi4; // bu sayiyi double seklinde gösterir.
        System.out.println(dd);                                     //  1.4705882352941178
        int yas = 48;
        System.out.println("----------");
        System.out.println("yas");
        System.out.println(yas);
        System.out.println(50);
    }
}
