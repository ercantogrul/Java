package Faruk_hoca_yeni_ilk5gun.DE02_DataTypes_WrapperClass;

public class C05_SwapInterviewQuestions {
    public static void main(String[] args) {
        double a = 22.35;
        double b = 33.01;
        double c = a;
        a = b;   // a=33.01 , b=33.01 , c = 22.35;
        b = c;
        System.out.println(a); // 33.01
        System.out.println(b); // 22.35


    }
}
