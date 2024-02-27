package day12_Arrays.DE12_Arrays_ilk.Tasks;

public class Task15_Tum_elemanlarinCarpimi {
    public static void main(String[] args) {
        //task-> arr  tum elemalarının çarpımını print eden code create edinz

        int[] carpim = {1, 2, 3, 4, 5, 6};

        arrCarpim1(carpim);
    }

    private static void arrCarpim1(int[] carpim) {
        int sonuc = 1;
        for (int i = 0; i < carpim.length; i++) {
            sonuc*=carpim[i];


        }
        System.out.println(sonuc);
    }


}
