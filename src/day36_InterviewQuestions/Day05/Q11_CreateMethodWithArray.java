package day36_InterviewQuestions.Day05;

import java.util.Arrays;

public class Q11_CreateMethodWithArray {
    /*
            ||This Part Should be in Main Method||

             -Create an array of size 5, assign some random values from 0 to 10
             -(use random class and for loop to assign values)


            ||You should create public static void methods fori loop
            (Parameter should be int Array for methods)||

             -1-Create a method that prints array like "2 3 1 10 2",
             space between elements of array
             -2-Create a method that prints the sum of an array
             -3-Create a method that prints the max element of an array

            P.S: Return type should be void because we are not returning anything just printing
    */
    public static void main(String[] args) {
        int[] arr = new int[5];

        methodarr(arr);
    }
    private static void methodarr(int[] arr) {
        int toplam = 0;
        int max= arr[0];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10 + 1);
            toplam+=arr[i];
            if (max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("toplam = " + toplam);
        System.out.println("max = " + max);


    }


}
