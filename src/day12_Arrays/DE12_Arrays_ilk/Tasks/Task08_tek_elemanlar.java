package day12_Arrays.DE12_Arrays_ilk.Tasks;

public class Task08_tek_elemanlar {
    public static void main(String[] args) {
        //Task-> girilen 7 elemanlı bir int  arrayın tek elemanlarını print eden code create ediniz.
        int [] array = {1,2,3,4,5,6,7};

        tekEleman(array);

    }

    private static void tekEleman(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (!(array[i]%2==0)) {
                System.out.print(array[i]+", ");
            }

        }
    }
}
