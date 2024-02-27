package day12_Arrays.DE12_Arrays_ilk.Tasks02;

public class T07 {
    //Task-> girilen 7 elemanlı bir int  arrayın tek elemanlarını
    // print eden code create ediniz.

    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7};
        int n= arr.length;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2!=0){
                System.out.print(arr[i]+",");
            }


        }


    }
}
