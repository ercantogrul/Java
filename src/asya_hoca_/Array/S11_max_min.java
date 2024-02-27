package asya_hoca_.Array;

public class S11_max_min {
    public static void main(String[] args) {
         /*
    Create a function that takes an array and the difference between the largest
    and the smallest numbers.
    Ask user to enter array elements.
    Girilen  bir array'in en buyuk elemani ile
    en kucuk elemanının  farkını return eden  method create ediniz.
        */
        int[] arr = {2, 6, 4, 5, 8, 9};
        enBveEnKelemanFarki(arr);
    }
    private static void enBveEnKelemanFarki(int[] arr) {
        int enB = arr[0];
        int enK = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>enB) {
                enB=arr[i];
            } else if (arr[i]<enK) {
                enK=arr[i];
            }
        }System.out.println("enB ve enK sayilari farki:"+ (enB-enK ));


    }
}
