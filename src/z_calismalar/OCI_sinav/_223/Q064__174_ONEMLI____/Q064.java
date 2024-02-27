package z_calismalar.OCI_sinav._223.Q064__174_ONEMLI____;


//MyString.Java:
//package p1;
class MyString {
    String msg;
    MyString(String msg){
        this.msg =msg;
    }
}
//Test.java:
//package p1;
public class Q064 {
    public static void main(String[] args) {
        //msg__ statick bir methodda kullanilamaz
        new MyString("sss");  // bu sekilde yazilabilir

        System.out.println("Hello "+ new StringBuilder("Java SE 8"));
        System.out.println("Hello "+ new MyString("Java SE 8")); // bu sekli ile hash kodunu yazar
//        System.out.println("Hello "+ new MyString("Java SE 8").msg); //ama bu sekilde olsaydi yazdirirdi. soruda .msg yok. O durumda hush code yazdirir
    }
}
/*NOT: Q064 --> soruda p1 yani package name olarak verilmis
    What is the result?
    A
    Hello Java SE 8
    Hello Java SE 8

    B
    Hello java.lang.StringBuilder@<<hashcode1>>
    Hello Q49_60.Q57.MyString@<<hashcode1>>

    C
    Hello Java SE 8
    Hello Q64.MyString@<<hashcode1>>

    D
    Compilation fails at the Test class

    A. Option A
    B. Option B
    C. Option C
    D. Option D
    Answer: C
*/