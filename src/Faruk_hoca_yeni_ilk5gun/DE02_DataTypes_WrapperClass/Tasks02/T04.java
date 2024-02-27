package Faruk_hoca_yeni_ilk5gun.DE02_DataTypes_WrapperClass.Tasks02;

public class T04 {
    public static void main(String[] args) {
        // 4 adet int sayı veriliyor, en küçük olanı yazdırınız (* tek bir satırda)
        int s1 = 22, s2 = 11, s3 = 17, s4 = 29;
        int enBuyuk ;
        enBuyuk = Integer.max(Integer.max(s1,s2),Integer.max(s3,s4))  ;
        // 3 sayının en buyuyunu bulalım
        enBuyuk = Integer.max(  s1  ,   Integer.max(s2,s3)   )  ;

        System.out.println(enBuyuk);
    }
}
