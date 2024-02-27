package day02_DataTyps_WrapperClass.DE03_DataTypes_WrapperClass_Concatenation_ilk.Tasks02;

public class T01 {
    public static void main(String[] args) {
        //byte, short ve int'in maximum ve minimum degerlerini print eden code create ediniz.

        byte sayi1 = Byte.MAX_VALUE;
        byte sayi2 = Byte.MIN_VALUE;
        System.out.println("byte maximum:" + sayi1+", "+"byte minimum:" + sayi2); // veya
        System.out.println("byte maximum:" + Byte.MAX_VALUE+", byte minimum:"+ Byte.MIN_VALUE);

        short sayi3 = Short.MAX_VALUE;
        short sayi4 = Short.MIN_VALUE;
        System.out.println("shout maximum:" + sayi3+", "+"shout maximum:" + sayi4);

        int sayi5 = Integer.MAX_VALUE;
        int sayi6 = Integer.MIN_VALUE;
        System.out.println("int maximum:" + sayi5+", "+"int minimum:" + sayi6);






    }
}
