package day08_Loops.DE08_Loops.L01_ForLoops;

public class C06_Printf {
    public static void main(String[] args) {
        int num1  = 25;
        int num2  = 12;
        double dd = 356.20;
        String str="Hasan";


        System.out.printf("ISIM=%10s%5d%5d%10.3f\n",str,num1,num2,dd);

        System.out.printf("ISIM=%10S%5d%-5d%10.3f\n",str,num1,num2,dd);
        System.out.printf("ISIM=+%10S+%5d+%-5d+%10.3f\n",str,num1,num2,dd);
    }
}
