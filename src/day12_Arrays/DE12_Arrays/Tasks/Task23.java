package day12_Arrays.DE12_Arrays.Tasks;

import java.util.Arrays;

public class Task23 {
    public static void main(String[] args) {
        // N elemanlı bir dizi üretin, rastgele doldurun , yazdırın
        // sonra başka bir dizi kullanmadan bu diziyi ters çevirin
        // [4,7,9,1,1,0,5]
        // [5,0,1,1,9,7,4]
        int n = 10;
        int [] dizi = new int[n];
        for (int i = 0; i <n ; i++) {
            dizi[i] = (int) (Math.random()*20);
        }
        System.out.println(Arrays.toString(dizi));
        for (int i = 0,j=n-1; i < n/2 ; i++,j--) {
            int temp = dizi[i];
            dizi[i] = dizi[j];
            dizi[j] = temp;
        }
        System.out.println(Arrays.toString(dizi));

    }
}
