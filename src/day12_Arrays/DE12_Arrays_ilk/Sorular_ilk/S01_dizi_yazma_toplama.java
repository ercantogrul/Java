package day12_Arrays.DE12_Arrays_ilk.Sorular_ilk;

import java.util.Arrays;

public class S01_dizi_yazma_toplama {
    public static void main(String[] args) {
        // soru 1: 5 elemanli arr adinda bir int dizisi olusturun, icerisine elemanlari 3,6,1,3,5 olsun
        int [] arr = {3,6,1,3,5};       //1. yol
        int [] arr6 = new int []{3,6,1,3,5}; //2. yol
        int [] arr3 = new int [5];       //3. yol
        arr [0] =3;     int a1 = 3;
        arr [1] =6;     int a2 = 6;
        arr [2] =1;     int a3 = 1;
        arr [3] =3;     int a4 = 3;
        arr [4] =5;     int a5 = 5;

        // soru : arr dizisinin ilk ve son elemanini print ediniz
        System.out.println(arr [0]);
        System.out.println(arr [arr.length-1]);

        // soru 3: dizinin ilk ve son elemanini toplayip bit toplam degiskenine atayin
        int toplam = arr [0]+ arr[arr.length-1];
        System.out.println(toplam);

        System.out.println("===============================");
        // soru4:bu diziyi bastan sona kadar bir for icerisinde yazdirin. Arrays class kullanmayin
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");  // arr dizisinin i elemanlarini for icerisinde yazdirmak // 3, 6, 1, 3, 5,
        }
        System.out.println();

        // soru 5: arr dizisinin elemanlarinin toplamini bulunuz
        int toplam1 =0;
        for (int i = 0; i < arr.length; i++) {
            toplam1 += arr [i];
        }
        System.out.println(toplam1);  // 18
        System.out.println();
        System.out.println("======================================");

        // soru 6:arr ve arr2 dizilerinin ilk elemanlarini toplayip arrT dizisinin ilk elemanina atayin, sirayla digerlerini de yapin.
        int[] arr2=new int [] {5,1,11,4,6};
        //int [] arr = {3,6,1,3,5};
        int [] arrT = new int[5];

        arrT [0]= arr [0]+ arr2[0]; System.out.println(arrT[0]);
        arrT [1]= arr [1]+ arr2[1]; System.out.println(arrT[1]);
        arrT [2]= arr [2]+ arr2[2]; System.out.println(arrT[2]);
        arrT [3]= arr [3]+ arr2[3]; System.out.println(arrT[3]);
        arrT [4]= arr [4]+ arr2[4]; System.out.println(arrT[4]);
        System.out.println("=========ikinci yol==============================" );

        for (int i = 0; i < arrT.length; i++) {
            arrT [i] = arr [i]+arr2[i];
        }
        System.out.println(Arrays.toString(arrT));












    }
}
