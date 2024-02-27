package day08_Loops.DE08_Loops.L01_ForLoops;

public class C04_NestedFor {
    public static void main(String[] args) {
        for (int i = 0; i <7; i++) {
            for (int j = 0; j <(i+1) ; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }

// System.out.printf("%2d%2d   ",i,j);

    }
}
