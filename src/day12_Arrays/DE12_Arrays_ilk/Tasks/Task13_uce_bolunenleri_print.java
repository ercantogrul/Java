package day12_Arrays.DE12_Arrays_ilk.Tasks;

import java.util.Scanner;

public class Task13_uce_bolunenleri_print {

    public static void main(String[] args) {
        /* TASK :
        Girilen 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini print eden  code create ediniz (negatif sayilar dahil )

         */
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[8];
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            System.out.print(i+ ". nummer : ");
            arr[i] = scanner.nextInt();
            if (arr[i] % 3 == 0) {
                count++;
            }
        }
        System.out.println("count = " + count);



    }

}
