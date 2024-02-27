package day02_DataTyps_WrapperClass.C04_WrapperClass;

public class C04_WrapperClass {

    public static void main(String[] args) {

        /*
    WrapperClass:primitive  data türleri sadece değer tutar.bunlardan nesne üretmemiz mumkun olmuyor.bunun icin
    Java da hazir Wrapper Classlar var onlari kullaniyoruz. primitive  data türlerinin isimlari ile aynidir,
    sadece ilk harfleri buyüktur. (Byte-Short-Integer-Long-Float-Double-Character-Boolean)

    int sayi =7;  int primitive data turu,sayi variable degiskeni-  7 ise bu degiskene tanimlanan deger.
             sayi degiskenin int tipinden degeri 7 dir
     //sayi. yazinca herhangi bir method gelmez.

    // ama ben 7 nesnesi üretmek istiyorum --Integer sayi2=7; burada sayi2. yazinca cok sayida method gelir.
    // sayi2. deyince Wrapper Class tan urettigim objeyi methodlar ile islemler yapabilirim.sayi2. yazinca methodlar gelir.

    //Wrapper Class larini en çok tercih edilmesinin sebebi o Class daki method lara ulasmak.
         */

        int s1 = 11, s2 = 21, s3 = 51, s4 = 45;
        int b1 = Integer.max(s1, s2);
        int b2 = Integer.max(s3, s4);
        int enB = Integer.max(b1, b2);
        System.out.println("en Büyük sayi="+" "+Integer.max(b1,b2));  // en Büyük sayi= 51
        System.out.println(" en buyuk sayi : "+ Integer.max(Integer.max(Integer.max(s1,s2),s3),s4));




    }
}
