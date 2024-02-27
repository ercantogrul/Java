package day07_StringManuplation.DE07_StringManuplation_ilk;

public class C05_Substring__parca_bolum_almak {
    public static void main(String[] args) {
          /*
        substring()
        Metin icinde, istenilen araliktaki bir parcasina ya da butunune ulasilabilir. Sonuc ise String dir.
        substring(i)->Method'a parametre olarak girilen  index'den sona kadar olan parcayi return eder
        substring(baslangicIndexi, bitisIndexi)->Method'a parametre olarak girilen  baslangicIndexi'den bitis
        indexi'e kadar parçayı return eder
        baslangic indexi ==> inclusive/dahil
        bitis indexi ==> exclusive/haric
         */
           /*
            substring() bize verilen bir String'in istenen parcasini alma imkani tanir

            2 turlu kullanimi vardir
            1- baslangic index'ini verirseniz, o indexten sona kadar olan kismi verir
            2- baslangic ve bitis indexlerini verirseniz
               baslangic index'inden (dahil) baslar
               bitis index'ine kadar(haric) aradaki karakterleri yazdirir
         */

        //===birinci kullanimi=========
        String str = "Merhaba dünya";
        // Baştan sona kadar kopar
        String str3 = str.substring(0,str.length());   //// Baştan sona kadar kopar
        System.out.println(str3);                        //Merhaba dünya
        //2.yontem
        String str4 = str.substring(0);
        System.out.println(str4);                    //Merhaba dünya

        String ss = str.substring(5); // 5. indexten itibaren (5 dahil) sonuna kadar kopar al
        System.out.println(ss);  //ba dünya

        //===ikinci kullanimi==============
        String str2 = str.substring(5,7);// 5.karekterden 7.karektere kadar al (5 dahil, 7 hariç)
        System.out.println(str2);                       //ba

        String sd = str.substring( 5,9); // 5 hahil 9 a kadar 9 dahil degil (5,6,7,8) kopar al
        System.out.println(sd); // ba d

        // son 3 harfi yazdirin
        System.out.println(str.substring(str.length()-3)); // dir


        // charAt()'e benzer ama arti bir ozelligi var
        // substring bize String verdigi icin manipulation yapmaya devam edebiliriz
        // 6.indexdeki harfi buyuk harf olarak yazdirin
        System.out.println(str.substring(6,7).toUpperCase());

        System.out.println(str.substring(3,3));     // hiclik yazdirir

        // System.out.println(str.substring(8,5)); // StringIndexOutOfBoundsException  //hata verir




        //task -> girilen 4 harfli kelimeyi tersten print eden code create ediniz. kale -> elak
    }
}
