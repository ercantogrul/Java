package day07_StringManuplation.DE07_StringManuplation;

public class C06_Substring {
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
        String str = "Merhaba dünya";
        String str2 = str.substring(5,7);// 5.karekterden 7.karektere kadar al (5 dahil, 7 hariç)

        // Baştan sona kadar kopar
        String str3 = str.substring(0,str.length());
        //2.yontem
        String str4 = str.substring(0);






        //task -> girilen 4 harfli kelimeyi tersten print eden code create ediniz. kale -> elak
    }
}
