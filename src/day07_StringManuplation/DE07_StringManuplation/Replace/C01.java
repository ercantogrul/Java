package day07_StringManuplation.DE07_StringManuplation.Replace;

public class C01 {
    public static void main(String[] args) {
        String str = "Mehabalar Hasan";
        System.out.println(str); // Mehabalar Hasan
        str = str.replace(" "," bosluk ");
        System.out.println(str); // Mehabalar bosluk Hasan
        str = str.replaceFirst("s","ş");
        System.out.println(str); //Mehabalar boşluk Hasan
        str = str.replace("a","*");
        System.out.println(str); // Meh*b*l*r boşluk H*s*n
        str = str.replace("luk","-");
        System.out.println(str);


    }
}
