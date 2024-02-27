package asya_hoca_.Array.Array_toplu;

public class ArraySumMinMax {
    public static void main(String[] args) {
        /*
    Create a function that takes an array and the difference between the largest
    and the smallest numbers.
    Ask user to enter array elements.
    Girilen  bir array'in en buyuk elemani ile
    en kucuk elemanının  farkını return eden  method create ediniz.
 */
        int[] arr={1,2,2,4,45,67,45};


        dif(arr);


    }

    private static int dif(int[] arr) {
        int max=arr[0];//1
        int min=arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){//max değerim dizinin elemanında küçükse
                max=arr[i];//yensi maks değerim
            }
            if (min>arr[i]){
                min=arr[i];//yeni min değer
            }
        }
        System.out.println(max-min);
        return max-min;
    }
}
