package day10_MethodCreation.DE10_MethodCreation;

import java.util.Scanner;

public class C02_Method {
    /*
      code okunabilirliği ve sadeliği için sürekli kullanılan aksiyonlar için method create edip
      main method'a call edip run etmek uygulamanın test edilmesi maintanance ve reusable açısından tercih edilir.
      1) Java method'larin sadece name  değil  name + parametre'lere göre run eder
      parametre sayisi, parametre'lerin data tiplerin ve parametrelerin sırası methodu belirler.

      str.endsWith("el");   Bu method'un gorevi gidip kelimenin son kismini kontrol etmek
                            bu method'u kullanmak icin bu method'un kontrol ettikten sonra
                            bana rapor olarak ne getirdigini bilmem lazim (true/false)

      2) Bir method create edildiğinde  method'un aksiyonuna ve aksiyon çıktısı da method içinde create edilir

      3) Bir method olusturulurken  " str.indexOf(String str, int fromIndex) "
         de oldugu gibi
         disaridan kabul edecegi parametreleri ve bu parametrelerin data tiplerini
         deklare edilmeli

         method call edildiğinde  Parametre olarak
         declare edilen data tiplerine uygun value'ler (ARGUMENT)  girilmeli.
  */
    public static void main(String[] args) {
        /* Soru 1: topla adında bir metot yazınız, bu metot scanner class ile iki double variable okusun
        ve bunları toplayıp ekrana yazsın
         Soru 2: topla2 adında bir metot yazınız, bu metot scanner class ile main metotta okuttuğunu
         iki  double variable ı parametre olarak alsın, ve bunları toplayıp ekrana yazssın
         Soru 3:  topla3 adında bir metot yazınız, bu metot scanner class ile main metotta okuttuğunu
               iki  double variable ı parametre olarak alsın, ve bunları toplayıp return etsin
         ve main metot ta yazdırın

         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen iki sayi giriniz");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double sonuc = topla3(a,b);
        System.out.println(sonuc);

    }

    private static double topla3(double s1, double s2) {
        return s1+s2;
    }

//    private static double topla3(double s1, double s2) {
//        // parametre a ve b olarak bönderilmiş, buruda s1=a , s2=b şeklinde işleme girer,
//        // metot içindeki parametre adları çağrıldığı yer ile aynı olmak zorunda değildir
//        // ancak veri tipi, sırası ve sayısı önemlidir.
//        return s1 + s2;
//    }

}
