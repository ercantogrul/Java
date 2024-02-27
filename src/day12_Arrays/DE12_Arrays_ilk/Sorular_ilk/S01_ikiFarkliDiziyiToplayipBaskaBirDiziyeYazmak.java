package day12_Arrays.DE12_Arrays_ilk.Sorular_ilk;

import java.util.Arrays;

public class S01_ikiFarkliDiziyiToplayipBaskaBirDiziyeYazmak {
    public static void main(String[] args) {
        // soru 6:arr ve arr2 dizilerinin ilk elemanlarini toplayip arrT dizisinin ilk elemanina atayin, sirayla digerlerini de yapin.
        int[] arr2=new int [] {5,1,11,4,6};
        int [] arr = {3,6,1,3,5};
        int [] arrT = new int[5];

        arrT [0]= arr [0]+ arr2[0]; System.out.println(arrT[0]);
        arrT [1]= arr [1]+ arr2[1]; System.out.println(arrT[1]);
        arrT [2]= arr [2]+ arr2[2]; System.out.println(arrT[2]);
        arrT [3]= arr [3]+ arr2[3]; System.out.println(arrT[3]);
        arrT [4]= arr [4]+ arr2[4]; System.out.println(arrT[4]);
        System.out.println("=========ikinci yol==============================" );

        for (int i = 0; i < arrT.length; i++) {
            arrT [i] = arr [i]+arr2[i];      //[8, 7, 12, 7, 11]
        }
        System.out.println(Arrays.toString(arrT));

        //================farkli yol====eksik biraz===========
        System.out.println("==========================");

        int n1 = arr.length;
        int n2 =arr2.length;
        for (int i = 0; i < n1; i++) {
            arrT [i] = arr [i];
        }
        System.out.println(Arrays.toString(arrT));
        for (int i = 0; i < n2; i++) {
            arrT[i] += arr2[i];       //[8, 7, 12, 7, 11]
        }System.out.println(Arrays.toString(arrT));


    }
}
