package day14_ForEachLoops.DE14_ForEachLoops;

public class C03_ForEach {
    public static void main(String[] args) {
        // task -> array elamanlarının çarpımını print eden code create ediniz...-> with for-each

        int[][] arr = {{2, 3, 1}, {4,1}, {1, 2, 5, 6, 7}};
        int carpim=1;
        for (int[] icArr:arr) {
            for (int eleman:icArr ) {
                carpim *=eleman;
            }
        }
        System.out.println("carpim = " + carpim);
    }
}
