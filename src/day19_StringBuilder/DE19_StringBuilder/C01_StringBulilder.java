package day19_StringBuilder.DE19_StringBuilder;

public class C01_StringBulilder {
    /*
  String = > daha yavas ,Immutable==> degismez,
  String'lerde method kullanarak String'i degistirmek atama yapmadan mumkun degildir.

  1) Java pass-by-value kullanir.dublor
  2) String Class'i immutable Class'dir.değişmez

   StringBuffer =mutable==>degisebilir,less efficient/ daha yavas(StringBulder e göre) ,
   StringBuffer synchronized,thread safe.

  StringBuilders = mutable==>degisebilir ,
  not senkronized/not thread safe,fakat more efficient(daha etkili,ve hizli )

  1) String Class'i immutable(Degistirilemez)dir. Java mutable Stringler uretebilmemiz icin
  StringBuilder isimli bir class uretmistir.
  2) Java'da StringBuilder ile hemen hemen ayni isi yapan bir de StringBuffer classi vardir.
  "StringBuffer" Class'i StringBuilder Class'indan daha once uretilmistir.
  "StringBuffer" yavas calisan bir class'dir, "StringBuilder" ise hizli calisir.
  "StringBuffer"  "synchronize" islemlerini yapabilir, ama "StringBuilder" yapamaz.
  3) Ayni anda bir cok isin yapilmasina "multi threading" denir. "multi" = Cok, "thread"= Yapilan islerin herbiri
     Multi threading varsa, bu islerin siraya konulmasi lazim.Islerin siraya konulmasina "synchronization" denir.

                */
    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder("Hasandfadsfadsfadsf"); // Tanım  String str;
        StringBuilder str2 = new StringBuilder("Hasan"); // String str2 = "Hasan";
        str2.append(10).append("a"+"fdads").append("20");
        str1.delete(0, str1.length()).append(str2);  //
        str2.append("-----");
        System.out.println(str2); //
        System.out.println(str1); // ikiside aynı yazar
        //str1 = str2; // Dikkat! bu durumda referanslar eşitlenid ve biri değiştiğinde diğeride değişir



      // String,StringBuffer ve String Builder hız karşılaştırması
        String string ="";
        StringBuilder sBuilder = new StringBuilder();
        StringBuffer sBuffer = new StringBuffer();
        long t1 = System.currentTimeMillis();
        for (int i = 0; i <50000 ; i++) {
            string=string+i;
        }
        long t2 = System.currentTimeMillis();

        for (int i = 0; i <50000 ; i++) {
            sBuilder.append(i);
        }
        long t3 = System.currentTimeMillis();
        for (int i = 0; i <50000 ; i++) {
            sBuffer.append(i);
        }
        long t4 = System.currentTimeMillis();
        System.out.println("String  süresi = "+(t2-t1));
        System.out.println("Builder süresi = "+(t3-t2));
        System.out.println("Buffer  süresi = "+(t4-t3));


    }
}
