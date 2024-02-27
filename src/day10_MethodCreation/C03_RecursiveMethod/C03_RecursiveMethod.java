package day10_MethodCreation.C03_RecursiveMethod;

public class C03_RecursiveMethod {
    public static void main(String[] args) {
        // ic ice method kendi kendine cagirmak

        mtt1(0,"dfl");

    }
    private static void mtt1(int a,String str) {
        if ((a<6000)){
            System.out.println(a+" ");
            a++;
        }
        System.out.println("son");


    }
}
