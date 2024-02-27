package day02_DataTyps_WrapperClass.DE03_DataTypes_WrapperClass_Concatenation_ilk.Tasks02;

// 2 adet byte sayı veriliyor, küçük olanı yazdırınız
public class T02 {
    public static void main(String[] args) {
        byte sayi1 = 12;
        byte sayi2 = 17;
        System.out.println("enBuyuk sayi="+" "+Integer.max(sayi1,sayi2));//bu tam dogru degil hoca yanlislikla vermis.
        //her data kendi cinsinde hesaplanir.--- Byte,max yok---



    }

}
