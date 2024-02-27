package day35_Lambda;

import java.util.Arrays;
import java.util.List;
@FunctionalInterface  // bunu yazmak zorunda degiliz
interface Iaa{ // tek method icerir. iki tane olursa lamda ifadesi ile hangisinin cagrildugi belli olmaz
    void method();  // parametresiz method
}
@FunctionalInterface
interface Iaa2{
    void method2(int a);  // tek parametreli method
}
@FunctionalInterface
interface Iaa3{
    int method3(int a); //return type olan method
}

public class C01_Lamda {
    public static void main(String[] args) {
        Iaa aa = new Iaa() {
            @Override
            public void method() {
            }
        };

        Iaa aa1 = ()->{  // yukardaki interface icindeki methodu lamda ifadesi ile kullaniyoruz isimsiz ve parametresiz bir method..
            System.out.println("selamlar");  // methodu burada doldurduk
        };

        aa1.method(); // method cagrilinca...  selamlar ...yazdi


    //==========================================

        Iaa2 aa2 = (i) ->{
            System.out.println("selam 2");
        };
        aa2.method2(5);  //selam 2

        Iaa2 aa2_1 = i->{
            System.out.println("selam 2");
        };

        Iaa2 aa2_2 =i-> System.out.println("selam 2");
    //=====================return type olan ============
        Iaa3 aa3 = i-> {return i*2;};
        System.out.println(aa3.method3(7));

        System.out.println("=============");//===================================================
        int sayi = (int) (Math.random()*5);
        switch (sayi){
            case 0-> {
                System.out.println("sifir");
            }
            case 1-> System.out.println("bir");
            case 2-> System.out.println("iki");
            case 3-> System.out.println("üc");
            case 4-> System.out.println("dört"); // sanki sonda break var
            //case 4 : System.out.println("dört");break ikiside ayni
        }
    //=====================================================================

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.forEach(s-> System.out.print(s+" "));  //1 2 3 4 5

    }
}
