package day02_DataTyps_WrapperClass.DE03_DataTypes_WrapperClass_Concatenation_ilk;

import java.util.Scanner;

public class C05_SwapInterviewQuestions {
    public static void main(String[] args) {

        // degerlerin yer degistirmesi demektir.

        double a= 22.35;
        double b= 33.01;
        double c= a;

        a=b;   // a=33.01, b= 33.01, c= 22.35
        b=c;
        System.out.println(a);   //33.01
        System.out.println(b);   //22.35

        //=====================farkli örnek=============

        Scanner scan = new Scanner(System.in);
        System.out.println("ilk sayiyi giriniz: ");
        int ilkSayi = scan.nextInt();                           //  10
        System.out.println("ikinci sayiyi giriniz: ");
        int ikinciSayi = scan.nextInt();

        int temp = ilkSayi;   //  gecici bir temp olusturulur.
        ilkSayi = ikinciSayi;                                  // 20
        ikinciSayi = temp;
        System.out.println("ilk sayinin yeni degeri:"+ ilkSayi+ ", ikinci sayi: " + ikinciSayi);  // yerleri degisti.ilk sayi :20, ikinci sayi : 10




    }

}
