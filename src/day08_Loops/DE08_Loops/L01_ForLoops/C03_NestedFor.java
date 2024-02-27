package day08_Loops.DE08_Loops.L01_ForLoops;

public class C03_NestedFor {
    public static void main(String[] args) {
        for (int i = 0; i <7; i++) {
            System.out.print(i+"--> ");
            for (int j = 10; j <15 ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i <7 ; i++) {
            System.out.print(i+"--> ");
            for (int j = 10; j <15 ; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
