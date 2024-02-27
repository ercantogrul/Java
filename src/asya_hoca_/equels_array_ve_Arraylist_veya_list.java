package asya_hoca_;

import java.util.ArrayList;

public class equels_array_ve_Arraylist_veya_list {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        System.out.println(System.identityHashCode(list1));
        list1.add(4);
        System.out.println(System.identityHashCode(list1));
        list1.add(5);
        list1.remove(0);
        System.out.println(System.identityHashCode(list1));


//==========================================================
        String[] arr1 = new String[2];
        System.out.println(System.identityHashCode(arr1));//boş
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = "hasan";//aktardık dizi güncellendi
        }
        System.out.println(System.identityHashCode(arr1));//boş
        int k = 0;
        k++;
        String str = "hasan";
        System.out.println(System.identityHashCode(str));//

        System.out.println(System.identityHashCode(str.toUpperCase()));//


        int[] arr = {1, 2, 3, 4};
        int[] arr2 = {1, 2, 3, 4};
        int a = 3;
        int b = 3;
        int c = 1;
        int d= c+2;

        System.out.println(arr == arr2);//false
        System.out.println(a == b);//true
        System.out.println(a == d);//true
    }


}
