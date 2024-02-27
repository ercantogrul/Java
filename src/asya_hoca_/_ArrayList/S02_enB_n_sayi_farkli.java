package asya_hoca_._ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class S02_enB_n_sayi_farkli {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] arr={1,2,3,4,5,6,7,8,67,3,45,15,30,46};
        System.out.println("Kac adet maksimum sayi ciksin");
        int n = scanner.nextInt();
        int eBuyuk= Integer.MIN_VALUE;

        List<Integer> list= new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>eBuyuk){
                eBuyuk= arr[i];
                list.add(0,eBuyuk);
            } else list.add(arr[i]);
        }
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
        for (int i = list.size()-1; i > list.size()-n-1; i--) {
            System.out.println(list.get(i));
        }
    }
}
