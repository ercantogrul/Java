package day18_ImmutableAndPassBy__.pass_by_value_und_pass_by_referance;

public class C01_ {
    public static void main(String[] args) {
        //java nin hafiza yönetimi ile alakali bir konudur
        //??? bir variable methoda pm yollandiginda o variable in degeri degisir mi?

       //1- pass by value : primitive tip degisken in kopyasi gider asil deger degismez.
       //2- pass by referance :  degiskenin kendisi gider ve degisikliklerden etkilenirler

        /*
        iki tür hafiza vardir 1:stack hafiza (uygulama basladiginda kayit yapar ve uygulama kapatildiginda kayitlar sininir,
        yani gecici hafizadir
         2:heap hafiza: ( uygulama basladiginda her new yapilan datalar burada olusur. uygulama bittiginda veriler orada kalir
         bunlari garbage collector bunlari siler.

         örnegin int a = 5; new yapilmadigi icin stack hafizada
         */
        int a =5;
        System.out.println("a nin ilk degeri : "+a); //5
        degistir(a);
        System.out.println("a nin son degeri : "+a); //5

        // a variable 5 degri olarak stack hafizada olusturuldu,
        // sonra a variable e methoda gonderildi .(NOT: orjinali degil bir kopyasi gönderildi)
        // method da o kopya üzerinde 10 ekledi.
        // dolayisi ile kopyasi üzerinde yapilan degisiklikler kalici olmuyor. asil deger korunuyor.
        // uygulama calisip bitince stack bellek siliniyor

        //ama:============================================
        //mutable class larda "new" yapilmadigi taktirde referans degismez ve metodda veya
        // normal olarak ekleme cikarma carpma vb yapilabilir ve bu referansi degistirmez
        int [] arr = {1,2,3,4,5};
        System.out.println("arr[0] in ilk degeri : "+arr[0]); //1
        degistir(arr[0]);
        System.out.println("arr[0] in son degeri : "+arr[0]); //11


    }
    private static void degistir(int [] arr) {
        arr [0] =arr[0]+10;
    }


    private static void degistir(int a) {
        a =a+10;  // a variablenin sönük olmasindan orjinal olmadigi kopya oldugu beklli oluyor
    }


    // ______mutable nesneler_______
/* Aklımızda kalması gereken,
   dizileri ve StrinBulder ları bir metota yolladığımızda , orada dizide yaptığımız değişiklikler
   ana kısımdaki (metotun çağrıldığı yerdeki) diziyide bağlar,

 * Ancak bu diziye yeni refreans atanırsa( yani new lenirse, yani dizi = new int[n] veya list=new ArrayList<>();),
   bu refarans atamasından sonraki değişiklikler yukarıyı(metotun çağrıldığı yeri) bağlamaz
   bu durum mutable (degistirilebilir) class olan varable için geçerlidir
   (Arrays, List, set , Map, StringBulder, Queue)

 * mutable class larda "new" yapilmadigi taktirde referans degismez ama metodda veya normal olarak ekleme cikarma carpma vb yapilabilir ve bu referansi degistirmez

   ____Immutable nesneler,_____
   yani değiştirilemez nesneler, bellekteki durumları değiştirilemeyen nesnelerdir.
    Bu sınıfların değerleri bir kez belirlenir ve daha sonra değiştirilemez.

 * Ama  unmutable classlar da ; metodda veya normal olarak ekleme cikarma carpma vb yapilabilir AMA BU REFERANSI DEGISTIRIR

  Immutable olanlar:  * (int,double,byte,short,char, long,float,String),
                     * (String, Boolean, Integer gibi bütün wrapper classlar
 */
}
