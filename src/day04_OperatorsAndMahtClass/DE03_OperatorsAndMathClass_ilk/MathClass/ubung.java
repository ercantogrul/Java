package day04_OperatorsAndMahtClass.DE03_OperatorsAndMathClass_ilk.MathClass;

public class ubung {
    public static void main(String[] args) {

        int s1= 4,s2=-16, s3=24,s4=-49,s5=64, s6=2;
        double d1 =24.57; float f =23.21f;

        System.out.println(Math.abs(s4)+"," + Math.abs(s2));

        System.out.println(Math.max(s2,s4));
        System.out.println(Math.min(s1,s3));

        System.out.println(Math.sqrt(s5));

        System.out.println(Math.round(d1));      // 25
        System.out.println(Math.round(f));       // 23

        System.out.println(Math.floor(d1));      // 24.0

        System.out.println(Math.pow(s1,s6));     // 16.0
        System.out.println(Math.pow(4,2));       // 16.0
        System.out.println((int)Math.pow(4,2));  //16         // sayiyi int e cevirdik caste ile.

        System.out.println(Math.random()*90+10);    // random bir sayi veriyor
        System.out.println((double) (Math.random()*90+10));   // bu random bir sayi veriyor.
        System.out.println((int)Math.random()*90+10);   //bu sürekli 10 veriyor---int olarak yazdirmaz hata veriri.
        System.out.println((int)(Math.random()*90+10));   // bu dogru
        System.out.println((double) (Math.random()*90+10));   // bu random bir sayi veriyor.








    }
}
