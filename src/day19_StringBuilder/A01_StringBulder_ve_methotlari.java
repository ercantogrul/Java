package day19_StringBuilder;

public class A01_StringBulder_ve_methotlari {
    public static void main(String[] args) {

        // Bize bilgi getiren methodlar SB'i degistirmez
        //====STRİNGBUİLDERS====
        //Obje oluşturma:
        StringBuilder sb1= new StringBuilder(); // Bos bir SB olusturur
        System.out.println("sb1 : " + sb1); //

        StringBuilder sb2= new StringBuilder("haluk"); // icinde haluk degeri olan bir SB uretir
        System.out.println("sb2 : " + sb2);// haluk

        StringBuilder sb3= new StringBuilder(10); // 10 karakter kapasitesi olan bir SB uretir
        System.out.println("sb3 : " + sb3);//


        //Verilen SB nin sonuna String (concat)ekleme:
        sb1.append("Rumeysa ").append("Cetinturk");  // verilen SB'in sonuna istedigimiz String degerlerini ekler
        System.out.println(sb1); // Rumeysa Cetinturk


        //*****BU METHOD STRING de yok****Verilen SB nin sonuna String in bir kısmını ekleme:
        String cumle="Javayi cok sever";
        sb1.append(cumle, 6, 10); // Baska bir String'den istedigimiz bolumu SB'in sonuna ekler
        // baslangic indexi inclusive, bitis indexi exclusive'dir
        System.out.println(sb1); //Rumeysa Cetinturk cok


        // SB nin uzunluğu (kapasite default=16):
        System.out.println(sb1.length()); // 21 SB'in uzunluk bilgisini verir
        System.out.println(sb1.capacity()); //34 SB'in kapasite bilgisini verir.
        // (kapasite= SB obje oluşturulduğunda constructor parantezine kapasitesi yazılabilir,
        // o kapasiteyi doldurmak zorunda değiliz, doldurana kadar String girdiğimizde kapasitesini sorarsak,
        // ilk yazdığımız kapasiteyi verir,kapasite  yazılmazsa 16 atanır.)


        //İstenilen index teki karakteri bulma(charAt gibi):
        System.out.println(sb1.charAt(1));// u SB'in istedigimiz indexde olan karakterin bilgisini verir

        sb1.charAt(5); // Bize bilgi getiren methodlar SB'i degistirmez
        System.out.println(sb1); //Rumeysa Cetinturk cok


        //*****BU METHOD STRING de yok****İstenilen index teki yada iki index arasındaki karakteri silme:
        sb1.delete(17, 21); // SB'in istedigimiz index'leri arasindaki kismini siler (yine 17 dahil 21 hariç)
        System.out.println(sb1); // //Rumeysa Cetinturk

        sb1.deleteCharAt(16); // SB'in istedigimiz index'deki karakterini siler
        System.out.println(sb1); //Rumeysa Cetintur



        //İstenilen harf yada kelimenin index ini bulma:
        System.out.println(sb1.indexOf("Cetin")   ); // 8.. SB'da arama yapar
        System.out.println(sb1.indexOf("e", 6)); // 9.. istedigimiz indexten sonrasinda arama yapar

        System.out.println(sb1.indexOf("Kazim")); // -1 aradigimiz String'i SB'da bulamazsa -1 döndürür


        //*****BU METHOD STRING de yok****SB nin istenilen yerine String in verilen index lerdeki karakterlerini ekleme:
        sb1.insert(7, " "); // istedigimiz index'den itibaren istenen Stringi ekler

        System.out.println(sb1); // Rumeysa  Cetintur

        cumle="Merhaba dunya";
        sb1.insert(0, cumle, 0, 8); //sb1.insert(index, str, offset, len)  // Merhaba Rumeysa  Cetintur

         // 0 : SB'a hangi index'den itibaren eklenecek
         // cumle : Hangi String'den eklenecek
         // 0 : cumlenin hangi indexinden baslanacak
         // 8 : bitis indexi

        sb1.insert(25, cumle, 8, 13);
        System.out.println(sb1); // Merhaba Rumeysa  Cetinturdunya


        //SB nin istenilen Stringin (yada harfin) kullanıldığı son index:
        System.out.println(sb1.lastIndexOf("t")); //22 istenen String'in kullanildigi son indexi verir
        System.out.println(sb1.lastIndexOf("a", 22 )); //14 istenen indexten oncesine bakar


        //SB nin istenilen index leri arasını, verilen String ile değiştirme:
        sb1.replace(8, 16, "Seher"); // SB'in baslangic ve bitis index'leri arasindaki kismi
     // verilen String ile degistirir
        System.out.println(sb1); // Merhaba Seher Cetinturdunya


        //*****BU METHOD STRING de yok**** SB yi tersten yazdırma:
        sb1.reverse();
        System.out.println(sb1); // aynudrutniteC reheS abahreM
        sb1.reverse();


        //*****BU METHOD STRING de yok****İstenilen index teki bir harfi, istenilen harfle değiştirme:
        sb1.setCharAt(10, 'k');
        System.out.println(sb1); // Merhaba Seker Cetinturdunya


       // *****BU METHOD STRING de yok**** SB nin istenilen index ler arasındaki karakterini verme (substring gibi):(bilgi verir, SB yi değiştirmez)
        System.out.println(sb1.subSequence(8, 13)); // Seker  SB'in istedigimiz index'ler
        System.out.println(sb1.substring(8)); // Seker Cetinturdunya baslangic index'inden sona kadar

        sb1.subSequence(8,13);
        System.out.println(sb1); // Merhaba Seker Cetinturdunya
        sb1.substring(8, 13);
        System.out.println(sb1); // Merhaba Seker Cetinturdunya


       // SB de eşitlik kontrolü:
        // =====SB ve String====
        String isim= "Rumeysa Cetintur";
        System.out.println(sb1.equals(isim)); // false verir.. data turleri farkli oldugu icin
       // icerigin kiyaslanmasi mumkun degildir

        //StringBuilder sb2= new StringBuilder("Rumeysa Cetintur");

        System.out.println(sb1==sb2); // false
        System.out.println(sb1.equals(sb2)); // false SB'da equals method"u String'den farkli calisir
     // ancak ayni obje ile kiyaslandiginda true
     // String'deki == gibi calisir
        System.out.println("____"+sb1.equals(sb1)); // true




      //======SB ve SB=====
       // StringBuilder sb3=new StringBuilder("Java cok guzel");
        StringBuilder sb4=new StringBuilder("Java cok guzel");
        System.out.println(sb3.equals(sb4)); // false



     // iceriklerinin esit olup olmadigina bakmak icin String'deki equals method'unu kullanalim
     // SB yi String e çevirme:
        System.out.println(sb3.toString().equals(sb4.toString())); // true



        sb3.toString().concat(" Insanin sevdikce sevesi geliyor"); // String class'ina ait methodlar kullaninca kalici deg. olmaz

        System.out.println(sb3);
       //toString() method'unu kullaninca SB String'e donusmus olur dolayisiyla tum String methodlari kullanilabilir

        System.out.println(sb3.toString().concat(" Insanin sevdikce sevesi geliyor"));
       // Java cok guzel Insanin sevdikce sevesi geliyor



        System.out.println(sb1.length()); // 27
        System.out.println(sb1.capacity()); //48

        sb1.trimToSize(); // SB icin hazirlanan kapasitedeki fazlaliklari siler length ile kapasiteyi esit duruma getirir
        System.out.println(sb1.length()); // 27
        System.out.println(sb1.capacity()); //27

// System.out.println(sb3.compareTo(sb4));


    }
}
