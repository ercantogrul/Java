package day14_ForEachLoops;

public class C02_ForEach_2D {
    public static void main(String[] args) {
        // task -> array elamanlarının çarpımını print eden code create ediniz...-> with for-each

        int[][] arr = {{2, 3, 1}, {4,1}, {1, 2, 5, 6, 7}};

        int carpim =1;
        for (int[] icArr : arr) {
            for (int eleman : icArr) {

                carpim*=eleman;
                System.out.println(carpim);
            }
            System.out.println();
        }

    }
}
