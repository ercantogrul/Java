package day12_Arrays.DE12_Arrays_ilk.Tasks;

public class Task16_sonElemanlarinCarpimi {
    public static void main(String[] args) {
        // task-> sayi arr'deki son elemanların çarpımını print eden code create ediniz

        int[] arr = {1, 2, 3, 4, 7, 9};
        sonElemanlarinCarpimi(arr);
    }

    private static void sonElemanlarinCarpimi(int[] arr) {
        int sonE = arr[arr.length-1];
        System.out.println(sonE);
        int sondanOnceki = arr[arr.length-2];
        System.out.println("Son terimlerin carpimi::: = "+ (sonE*sondanOnceki));


    }
}
