package day27_Abstraction.Task01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int p1 =10;
        int p2 =20;
        Sum oSum = new Sum();
        int resultSum = oSum.calculating(p1,p2);
        System.out.println("resultSum = " + resultSum);

    }
}
