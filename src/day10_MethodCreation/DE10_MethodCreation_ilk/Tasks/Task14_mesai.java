package day10_MethodCreation.DE10_MethodCreation_ilk.Tasks;

import java.util.Scanner;

public class Task14_mesai {

    public static void main(String[] args) {

    /* task->
    Fazla mesaiyi hesaplayan ve toplam kazancı return eden method create ediniz

    Kullanıcıdan saatlik çalışma ücretini, hangi saatler arasında çalıştığını ve
    fazla mesaiye kalırsa kazancını kaç ile katlayacağını alalım.

    Örnek :
    saatlik çalışma ücreti : 40.0
   iş başı saati : 9.0
    paydos saati : 20.0
    fazla mesaiyi saat ücreti çarpanı: 1.8

    ucretHesapla(9.0,20.0,40.0,1.8);

    9 ile 17 arasında toplam çalışma 8 saat olduğu için 8 x 40 = 320
    17 ile 20 arasında toplam çalışma 3 saat olduğu için 3 x 40 x 1.8 =  216

    toplam = 536.0
    */


        mesai_ve_toplamKazanc();



    }//main sonu

    private static void mesai_ve_toplamKazanc() {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen saatlik calisma ücretinizi giriniz: ");
        double saatlikucr = scan.nextDouble();
        System.out.println("lütfen ise baslama saatini giriniz: ");
        double isbasi = scan.nextDouble();
        System.out.println("lütfen paydos saatini giriniz: ");
        double paydos = scan.nextDouble();
        System.out.println("lütfen fazla mesai saat carpani : ");
        double mesaicarp = scan.nextDouble();

        double gunlukmesai = 8;
        double gNormalKazanc = gunlukmesai*saatlikucr;
        double gMesaiKazanci = ((paydos-isbasi)-8)*saatlikucr*mesaicarp;
        double gtoplamKazanc =gNormalKazanc+gMesaiKazanci;
        System.out.println(gtoplamKazanc);

    }


}//class sonu
