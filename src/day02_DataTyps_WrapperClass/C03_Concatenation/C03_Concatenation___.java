package day02_DataTyps_WrapperClass.C03_Concatenation;

public class C03_Concatenation___ {
    public static void main(String[] args) {
        String vorname = "Ercan";
        String name = "Togrul";
        System.out.println("name  vorname=" + name + " " + vorname);  // name  vorname = Togrul Ercan

        int alt = 45;
        System.out.println(vorname + " " + name + " " + alt + " " + "yasindadir");// Ercan Togrul 45 yasindadir

        int jahr = 2023;
        int geburtsdatum = 1978;
        int alt1 = jahr - geburtsdatum;
        System.out.println(alt1);

        System.out.println(vorname + " " + name + " " + geburtsdatum + "'de dogdu");
        String info = vorname + " " + name + " " + geburtsdatum + " de dogdu ve " + alt1 + " " + "yasindadir";
        System.out.println(info); // Ercan Togrul 1978 de dogdu ve 45 yasindadir

        char gender1 = 'F', gender2 = 'M';
        System.out.println(gender1 + " & " + gender2); // F & M

        String gender = gender1 + " & " + gender2;// string veri turunte tanimlayip vonra onun varaible ile te cikti alinabilir.
        System.out.println(gender);

        //=================================================================

        int a = 15;
        System.out.println("a=" + a);
        int b = 30;
        System.out.println("a=" + b);

        int s1 = 13,s2=5,s3=7;
        char ch ='A';
        System.out.println(ch+s1);//  78  ÖNEMLI char bir karekteri ile sayi ile toplarsak (4 islem) yazarsak, o karakterin Ascii degeri ile o islem yapilir.
        System.out.println("sonuc: "+ch+s1); //sonuc: A13  ama string bir ifade olursa islem yaplaz yan yana yazar.
        System.out.println(s1+s2+ch+s3+"sonuc");  //90sonuc mat daki gibi islem oncelikli islem yapar(+ veya- soldan baslar saga dogru gider. string sonda oldugu icin son islem birlesme olmus


        //======================================================
        // CTRL+Alt+L==komutlara format atip düzenler
        // CTRL+R==refaktor rename (toplu isim düzeltme)

        float f = 123.45f;
        long l = 12567878956l;
        double d = 55.555;
        System.out.println("flout="+f+ "\n"+"long="+l+"\n"+"douple="+ d );

        //=================================================
        //Ford Puma XL 2023 4.2 x
        String carName="Ford";
        String carModel="Puma";
        String type="XL";

        // variable name does not contain charaters --( _ ve &)

        short year=2023;
        float motor_type=4.2f;
        char model='X';
        String carinfo=carName+" "+carModel+" "+type+" "+year+" "+motor_type+" "+model;

        System.out.println(carinfo);
        //=============================================================================






    }
}
