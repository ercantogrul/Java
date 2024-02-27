package day10_MethodCreation.DE10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {
        //Task-> Girilen 3  sayıdan en küçüğünü print eden METHOD  create ediniz
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();
        enKucuk(n1,n2,n3);
        enKucuk2(n1,n2,n3);
        System.out.println(enKucuk3(n1,n2,n3));
    }//main sonu

    private static void enKucuk(int n1, int n2, int n3) {
        int enK;
        if (n1<n2) {
            if (n1<n3) enK=n1;
            else enK=n3;
        } else {
            if (n2<n3) enK=n2;
            else enK=n3;
        }
        System.out.println(enK);
    }
    private static void enKucuk2(int n1, int n2, int n3) {
        int enK = Math.min(n1,Math.min(n2,n3));
        System.out.println(enK);
    }
    private static int enKucuk3(int n1, int n2, int n3) {
        return Math.min(n1,Math.min(n2,n3));
    }


}
