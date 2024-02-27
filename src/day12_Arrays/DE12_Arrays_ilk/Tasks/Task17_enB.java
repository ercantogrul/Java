package day12_Arrays.DE12_Arrays_ilk.Tasks;

public class Task17_enB {
    public static void main(String[] args) {
        // task-> sayi arr'deki en buyuk elemanı print eden code create ediniz...

        int[] arr = {25, 2, 32, 4, 5, 6};
        enBuyukEleman(arr);
    }

    private static void enBuyukEleman(int[] arr) {
        int enBuyuk = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>enBuyuk) enBuyuk=arr[i];
        }
        System.out.println("enBuyuk = " + enBuyuk);



    }
}
