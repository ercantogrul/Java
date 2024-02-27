package day12_Arrays.DE12_Arrays.Tasks;

import java.util.Arrays;

public class Task03 {

    public static void main(String[] args) {
		
		 /*
       Task-> Verilen  bir arrayin tum elemanlarini
        bir sonraki konuma print eden code create ediniz
       input:  [1,2, 3]
        output [2, 3, 1]
        */
        int [] dizi = {3,5,7,1,3,33,5,2,34};
        int[] yeniDizi=new int[dizi.length];
        for (int i = 1; i <dizi.length ; i++) {
            yeniDizi[i-1] = dizi[i];
        }
        yeniDizi[dizi.length-1] = dizi[0];
        System.out.println(Arrays.toString(dizi));
        System.out.println(Arrays.toString(yeniDizi));
    }

}
