package day10_MethodCreation.DE10_MethodCreation;

public class C04_RecursiveMethod {
    public static void main(String[] args) {

     //   mtt1(0,"dfh");
        for (long i = 0; i <Long.MAX_VALUE ; i++) {
            if (i%Integer.MAX_VALUE == 0) System.out.println(i);
        }
    }
    private static void mtt1(int a,String str){

        if (a<6000) {
            System.out.print(a+",");
            a++;
            mtt1(a,str);
        }
        System.out.println("Son");
    }

}
