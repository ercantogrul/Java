package day02_DataTyps_WrapperClass.DE03_DataTypes_WrapperClass_Concatenation_ilk.Tasks02;

public class T03 {
    // 4 adet double sayı veriliyor, en küçük olanı yazdırınız
    public static void main(String[] args) {
        double sayi1 = 3.14;
        double sayi2 = 4.48;
        double sayi3 = 2.4567;
        double sayi4 = 12.432;
        double b1 = Double.max(sayi1, sayi2);
        double b2 = Double.max(sayi3, sayi4);

        System.out.println("en Büyük sayi="+" "+ Double.max(Double.max(sayi1,sayi2), Double.max(sayi3, sayi4)));
        System.out.println("en Büyük sayi="+" "+Double.max(b1,b2));
    }
}
