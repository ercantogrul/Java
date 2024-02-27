package day06_SwitchCase.i_AsyaHoca_if_ileAlakaliOrnekler_;

import java.util.Scanner;

public class s5_OptimistPesimistsu_ {
    public static void main(String[] args) {
        /*    Task5:
         //Ekrana su seviyesi yüzde olarak veren random bir değer oluşturun.
         //Örn: Bardağın su miktarı %24 dir.Şeklinde çıktı alın
         //Ardından kullanıcıya "Siz bardağı nasıl tanımlarsınız?Yarısı "dolu" mu yarısı "boş" mu?"şeklinde sorun
         //Eğer kullanıcı su seviyesi %40 üzerinde iken dolu derse ekrana
        //You are optimist.Smile life :)
        //  Değilse     //" Be optimist" yazdırın Collapse
         */


        System.out.println(" su seviyesi yüzde olarak random bir değer giriniz : ");
        int persent = (int) (Math.random()*100);
        System.out.println("Bardağın su miktarı %" +persent+ "dir");
        System.out.println("siz bardagi nasil tanimlarsiniz? Yarisi \"dolu\" mu yarisi \" bos\" mu?: ");
        Scanner scan = new Scanner(System.in);
        String answer = scan.next();

        boolean isOptimist = answer.equalsIgnoreCase("dolu") && persent>40; // ==ONEMLI== dolu ve Su seviyesi>40 i TRUE diye boolean e atadik.
                                                                                        // yani bir kosulu boolean a tanimlayabiliriz.
        if (isOptimist){
            System.out.println("You are optimist.Smile life :)");
        }else System.out.println("Be optimist");

        ///===ternary==========
        System.out.println( "su seviyesi nekadar?");
        int sSeviyesi = (int) (Math.random()*100);
        System.out.println("bardagin su seviyesi % "+sSeviyesi);
        System.out.println( "Siz bardağı nasıl tanımlarsınız?Yarısı \"dolu\" mu yarısı \"boş\" mu?");
        Scanner sc = new Scanner(System.in);
        String cevap = sc.next();

        String durum = cevap.equalsIgnoreCase("dolu") && sSeviyesi >40? "You are optimist.Smile life :)" :"Be optimist ";
        System.out.println(durum);








    }
}
