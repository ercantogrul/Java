package day10_MethodCreation.DE10_MethodCreation_ilk.Tasks;

import java.util.Scanner;

public class Task05_dortIslem_swich_case {
    /* task-> girilen iki sayıyı seçilen dört işleme göre
         hesaplayıp print eden METHOD create ediniz
        işlem toplam ise sayıları toplayın, çarpma ise çarpın .....v.b.
        */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("lütfen bir sayi giriniz : ");
        int i1 = input.nextInt();
        System.out.print("lütfen ikinci sayiyi giriniz : ");
        int i2 = input.nextInt();

        islem (i1,i2);

    }//main sonu

    private static void islem(int i1, int i2) {
        Scanner input = new Scanner(System.in);
        System.out.println("yapmak istediginiz islami belirtin:" );
        System.out.println("1-toplamak islemi \n2-cikarma islemi \n3-carpma islemi \n4-Bölme islemi");
        int islem = input.nextInt();

        switch (islem){
            case  1 : System.out.println("toplama(i1,i2) = " + toplama(i1, i2));break;
            case  2 : System.out.println("cikarma( i1, i2) = " + cikarma(i1, i2));break;
            case  3 : System.out.println("carpma(i1,i2) = " + carpma(i1, i2)); break;
            case  4 : System.out.println("bolme(i1,i2) = " + bolme(i1, i2));break;
            default: System.out.println("hatali giris yaptiniz");
        }

    }

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
