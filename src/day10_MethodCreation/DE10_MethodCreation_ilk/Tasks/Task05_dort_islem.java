package day10_MethodCreation.DE10_MethodCreation_ilk.Tasks;

import java.util.Scanner;

public class Task05_dort_islem {

    public static void main(String[] args) {
        /* task-> girilen iki sayıyı seçilen dört işleme göre
         hesaplayıp print eden METHOD create ediniz
        işlem toplam ise sayıları toplayın, çarpma ise çarpın .....v.b.
        */
        Scanner input = new Scanner(System.in);
        System.out.print("lütfen bir sayi giriniz : ");
        int i1 = input.nextInt();
        System.out.print("lütfen ikinci sayiyi giriniz : ");
        int i2 = input.nextInt();
        System.out.println("yapmak istediginiz islami belirtin \n toplamak islemi : +\n cikarmak islemi : -\n carpmak islemi : *\n bölmek islemi : / ");
        char ch = input.next().charAt(0);

        if(ch=='+') {
           int sonuc= toplama(i1,i2);
            System.out.println("toplama() = " + toplama(i1,i2));
        } else if (ch=='-') {
            System.out.println("cikarma() = " + cikarma(i1,i2));
        } else if (ch=='*') {
            System.out.println("carpma() = " + carpma(i1,i2));
        } else if (ch=='/') {
            System.out.println("bolme() = " + bolme(i1,i2));
        }else System.out.println("hatali giris yaptiniz");




    }//main sonu

    private static int toplama(int i1, int i2) {
        int toplama = i1+i2;
       return toplama ;
    }
    private static int cikarma(int i1, int i2) {
        int cikarma = i1-i1;
    return cikarma;
    }
    private static int carpma(int i1, int i2) {
        int carpma =i1*i2;
        return  carpma;
    }
    private static int bolme(int i1, int i2) {
        int bolme = i1/i2;
        return bolme;
    }


}
