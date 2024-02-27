package day02_DataTyps_WrapperClass.DE03_DataTypes_WrapperClass_Concatenation_ilk.Tasks02;

public class T04 {
    public static void main(String[] args) {
        // 4 adet int sayı veriliyor, en küçük olanı yazdırınız (* tek bir satırda)
        int s1 = 22, s2 = 11, s3 = 17, s4 = 29;
        int b1=Integer.max(s1,s2);
        int b2=Integer.max(s3,s4);

        int enB = Integer.max(Integer.max(s1,s2),Integer.max(s3,s4));// bu sekildede yapilabilir

        // enBuyuk = ???  ;
        System.out.println("enBuyuk sayi="+" "+Integer.max(b1,b2));// iki sekildede olur
        System.out.println("enBuyuk sayi="+" "+enB); // once int enB tanimladik, sonra print yaptirdik

    }
}
