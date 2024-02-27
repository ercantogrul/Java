package day08_Loops.DE08_Loops.L01_ForLoops;

public class C05_NestedFor {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <(n-i) ; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
