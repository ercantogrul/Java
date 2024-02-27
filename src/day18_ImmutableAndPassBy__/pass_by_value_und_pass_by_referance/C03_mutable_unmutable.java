package day18_ImmutableAndPassBy__.pass_by_value_und_pass_by_referance;

import java.util.Arrays;

public class C03_mutable_unmutable {
    public static void main(String[] args) {
        // System.identityHashCode()
        int[] dizi = new int[10];
        System.out.println(Arrays.toString(dizi));
        System.out.println("dizi ref= "+System.identityHashCode(dizi));
        metotDizi(dizi);
        System.out.println("dizi ref= "+System.identityHashCode(dizi));
        System.out.println(Arrays.toString(dizi));  //method 1 de yapilan degisikliklerb oldugu gibi buraya aktarildi

        metotDizi2(dizi);   //  [4754, 1, 4, 9, 16, 25, 36, 49, 64, 81]
        System.out.println(Arrays.toString(dizi));
        System.out.println("clear comutu referansı ");

    }
    private static void metotDizi(int[] ss) {
        System.out.println("ss   ref= "+System.identityHashCode(ss));
        for (int i = 0; i <ss.length ; i++) {
            ss[i] = i*i;
        }
        System.out.println("ss   ref= "+System.identityHashCode(ss));
        System.out.println("----"+Arrays.toString(ss));
    }
    private static void metotDizi2(int[] ss) {
        System.out.println("ss2  ref:::= "+System.identityHashCode(ss));
        ss[0] = 4754;
        System.out.println("ss2  ref:::= "+System.identityHashCode(ss));
        System.out.println("****"+Arrays.toString(ss));    //****[4754, 1, 4, 9, 16, 25, 36, 49, 64, 81]
        ss = new int[10];// buradan itibaren çağrıldığı yerle irtibatı kopuyor ***BURASI ÖNEMLI****
        System.out.println("ss2  ref= "+System.identityHashCode(ss));
        for (int i = 0; i <ss.length ; i++) {
            ss[i] = 100+i;
        }
        System.out.println("__"+Arrays.toString(ss));   // new yapildiktan sonra ki dizi ile onceki arti farkli
                                                        // __[100, 101, 102, 103, 104, 105, 106, 107, 108, 109]
        System.out.println("ss2  ref= "+System.identityHashCode(ss));

    }
// ______mutable nesneler_______
/* Aklımızda kalması gereken,
   dizileri ve StrinBulder ları bir metota yolladığımızda , orada dizide yaptığımız değişiklikler
   ana kısımdaki (metotun çağrıldığı yerdeki) diziyide bağlar,

 * Ancak bu diziye yeni refreans atanırsa( yani new lenirse, yani dizi = new int[n] veya list=new ArrayList<>();),
   bu refarans atamasından sonraki değişiklikler yukarıyı(metotun çağrıldığı yeri) bağlamaz
   bu durum mutable (degistirilebilir) class olan varable için geçerlidir
   (Arrays, List, set , Map, StringBulder, Queue,Date)

 * mutable class larda "new" yapilmadigi taktirde referans degismez ve metodda veya
 normal olarak ekleme cikarma carpma vb yapilabilir ve bu referansi degistirmez

   ____Immutable nesneler,_____
   yani değiştirilemez nesneler, bellekteki durumları değiştirilemeyen nesnelerdir.
    Bu sınıfların değerleri bir kez belirlenir ve daha sonra değiştirilemez.

 * Ama  unmutable classlar da ; metodda veya normal olarak ekleme cikarma carpma vb yapilabilir AMA BU REFERANSI DEGISTIRIR

  Immutable olanlar:  * (int,double,byte,short,char, long,float,String),
                     * (String, Boolean, Integer gibi bütün wrapper classlar
                     * LocaleDate
 */

}
