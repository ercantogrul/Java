package day10_MethodCreation.DE10_MethodCreation_ilk;

public class C01_Method {
    public static void main(String[] args) {
        /*


     1- Method’lar robotlara benzer, yapmasi main method icinde olusturmaktan biraz daha zahmetli olabilir ama programlamada olmazsa olmazlardandir.
     2- Method olusturmanin 2 temel faydasi vardir
	                                       - tekrar tekrar kullanabilme kolayligi
	                                       - main method’umuzu veya class’imizi basit ve anlasilabilir hale getirme
     4- Method’larin urettigi sonuca islem sonucu demeyiz. Bunun yerine ”bize su sonucu döndürür” deriz.
     5- bir method’un dondurdugu sonucun data turunu method deklarasyonunda goruruz.
     6- method’lar sonuc dondurme durumuna gore 2’ye ayrilirlar
	        - islemi yapip bize bir sey dondurmeyen(ogrenci kaydi, bankaya para yatirmak vb) veya islemi yapip sonucu
	          sadece konsolda yazdiran(elektrik parasini yatirip, makbuz almak gibi) method’larin return type’i void olur
	       -  islemi yapip, islem sonucunu bize donduren method’larin, return type’i dondurdukleri dataya uygun olur
	          (markete gonderdigimiz kapicinin, bizim istedigimiz urunu getirmesi gerektigi gibi)

   örnek:
   String ="Java Candir"
   str.subsitring(5); // bu method bize "Candir" döndürür. ancak, yazdirmazsak veya
   bir variable'a atamazsak bu method'un döndürdügü sonuc bir ise yaramaz
    String strIstenenBolum = str.substring(5);   // kaydeder ama yazdirmaz
    System.out.println(str.subsitring(5));     // yazdirir ama kaydetmez
 */
        // Statik metot içinde ancak statik bir metot doğrudan çağrılır
        C01_Method.ilkMetot();
        ilkMetot();
        int a = 10;
        int b = 7;
        buyukYaz(a,b);
        int toplam = C01_Method.topla(a,b);
        int toplam2= Integer.sum(a,b);

    }

    private static int topla(int a, int b) {
        // void yerin int olursa geriye int bir değer return etmelidir.
        int sum = a+b;
        return sum;
    }

    private static void buyukYaz(int a, int b) {
        System.out.println(a>b? a:b);
    }

    public static void ilkMetot(){ // () parantez arasına,
                                // bu metoda göndereceğimiz parametreler yazılır
                                // void : metot bize bişey geriye göndermeyecek demektir
        System.out.println(" ilk metot çağrıldı");
    }




}
