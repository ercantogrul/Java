package day10_MethodCreation.C01_Method;

public class A01_Method_void {
    //Soru 1- Kullanicidan input olarak verilen bir String,
    //        baslangic ve bitis indexlerine gore
    //        baslangic index'i dahil, bitis index'i haric olacak sekilde
    //        aradaki harfleri yazdiran bir method olusturun.
    //
    //          - kullanici baslangic degeri olarak,
    //          bitis degerinden buyuk bir sayi girerse, hata mesaji verin
    //          - kullanici str'da olan index'lerden daha buyuk bir index girerse
    //          hata mesaji yazdirin.

    public static void main(String[] args) {
     // java main method icerisinde calisir, main method bos ise method calismaz.
        // asagidaki veriler main method da silinse dahi olusturulan yeni method yazilirsa yine de calisir
      /*
        String str = "Java guzeldir";
        int basIndex =3;
        int bitINdex =7;
      */
        // method cagrilinca burada calisir

        altString("Java guzeldir",3,7); //a gu
        altString("Biraz sabir lutfen",5,4);  // Baslangic index'i bitis index'inden buyuk olamaz
        altString("Bu da mi gol degil ?" , 11,33); //verilen index sinirlarin disinda

        String str= "Aramiz bozulmasin";
        altString(str,5,10); // z boz

    } // main method sonu

    public static void altString(String metin, int basIndex, int bitIndex ){

        if (basIndex>bitIndex){
            System.out.println("Baslangic index'i bitis index'inden buyuk olamaz");
        } else if (basIndex>=metin.length() || bitIndex>=metin.length()) {
            System.out.println("verilen index sinirlarin disinda");
        }else{
            for (int i = basIndex; i <bitIndex ; i++) {
                System.out.print(metin.charAt(i));
            }
        }
        System.out.println("");




    }




}
