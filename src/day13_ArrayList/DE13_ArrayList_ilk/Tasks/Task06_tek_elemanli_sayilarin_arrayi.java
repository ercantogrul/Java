package day13_ArrayList.DE13_ArrayList_ilk.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task06_tek_elemanli_sayilarin_arrayi {
    public static void main(String[] args) {
         /* TASK :
        Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        sadece tek elemanlarını ayrı diziye bir metodda atayarak
         print eden code create ediniz.

        */

        int[] sayiArr = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < sayiArr.length; i++) {
            System.out.print(i + 1 + ". elemanı agam giresen :");
            sayiArr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(sayiArr));

        tekElemanlariBaskaDiziyeAta(sayiArr);


    }

    private static void tekElemanlariBaskaDiziyeAta(int[] sayiArr) {

        int counter = 0;
        for (int i = 0; i < sayiArr.length; i++) {
            if (sayiArr[i] > 9) counter++;
        }
        System.out.println( "tek eleman olmayanlarin sayisi :"+counter);

        int [] arr = new int[sayiArr.length-counter];// tel elemanli sayilar icin yeni bir array tanimladik
        for (int i = 0; i < sayiArr.length; i++) {
            if (sayiArr[i] <= 9) {
                arr[i]=sayiArr[i];
            }
        }
        System.out.println("tek elemanlilarin yer aldigi arr :"+Arrays.toString(arr));


    }


}
