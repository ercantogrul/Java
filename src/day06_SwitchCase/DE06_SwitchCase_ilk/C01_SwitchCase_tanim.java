package day06_SwitchCase.DE06_SwitchCase_ilk;
import java.util.Scanner;
public class C01_SwitchCase_tanim {
    /*
    Switch-Case yapısı  if statement'e benzer action alır.
    Çok sayida if statement bloklari code okunabilirliği ve clean code olarak tavsiye edilmez.
    Bir app actionda sabit bir degeri çoklu durum ile karsilastirmak için switch-case blok kullanılır.
    Switch-case blok'da  degiskene göre bir     çok durumdan değişkene uyan durum gerçeklesir.
    if statement blok ile  switch-case blok birlikte tanımlanabiir.
    çoklu koşul içeren durumlarda switch-case blok if statement'e göre app. hızı açısından daha avantajlıdır.
    (Best Practice)
     Switch-Case ile if statement arasında önemli bir performans farklılığı yoktur.

      ahan da CISSS TRICK-> Switch Statement'de long,double,float ve boolean asla KULLANILMAZZZ..

      Switch de sadece: int, byte, short, char, String data type  kullanilabilir
      Eger 3 den fazla durum varsa switch() tercih edilir.

*** kesin olan belli durumlariniz vardir. o durumlara göre aksiyon yaptirmak istiyorsunuz. bu tür durumlarda kullanili.
tek bir sartiniz var
      ör:
      1 e basildiginda anamenü
      2 ye basildiginda islemler
      3 e basilduginda cikis
      System.out.print("ana menü icin 1 e \nislemler icine 2 ye \ncikis icin 3 e basiniz");
      Scanner scanner = new Scanner(System.in);
      int secim  = scanner.nextInt();

      switch (secim) {
            case 1: System.out.print("ana menü");break;
            case 2: System.out.print("islemler");break;
            case 3: System.out.print("cikis yaptiniz yine bekleriz");break;
            default :
                     System.out.print("hatali tuslama yaptiniz");break;-----****

           yada
           if (secim==1) {
                 System.out.print("ana menü");
           }else if (secim==2) {
                 System.out.print("islemler");break;
           }else if (secim==3) {
                 System.out.print("islemler");break;
           }else System.out.print("hatali tuslama yaptiniz")
 */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir rakam giriniz : ");
        int sayi  = scanner.nextInt();
        {
            System.out.println("   ***   if   ***   ");
            if (sayi == 0) {
                System.out.println(" sıfır ");
            } else if (sayi == 1) {
                System.out.println(" bir ");
            } else if (sayi == 2) {
                System.out.println(" iki ");
            } else if (sayi == 3) {
                System.out.println(" üç ");
            } else if (sayi == 4) {
                System.out.println(" dort ");
            } else if (sayi == 5) {
                System.out.println(" beş ");
            } else if (sayi == 6) {
                System.out.println(" altı ");
            } else if (sayi == 7) {
                System.out.println(" yedi");
            } else if (sayi == 8) {
                System.out.println(" sekiz ");
            } else if (sayi == 9) {
                System.out.println(" dokuz");
            } else System.out.println("canin yiyim ne yazirsen :( ");
        }
        System.out.println("   ***   switch   ***   ");
        switch (sayi) {
            case 1 : System.out.println("bir"); break;
            case 2 : System.out.println("iki"); break;
            case 3 : System.out.println("üç"); break;
            case 4 : System.out.println("Dört"); break;
            case 5 : System.out.println("beş");break;
            case 6 : System.out.println("Altı");break;
            case 7 : System.out.println("yedi"); break;
            case 8 : System.out.println("Sekiz"); break;
            case 9 : System.out.println("Dokuz"); break;
            case 0 : System.out.println("Sıfır"); break;
            default: // yukarıdakilerin dışındaysa yani else ise
                System.out.println("tek rakam girmeliydiniz");
        }
// şubat 28, ocak,mart,mayıs,temmuz,agustos,ekım,aralık 31,
// nisan, haziran, eylul, kasım 30

    }
}
