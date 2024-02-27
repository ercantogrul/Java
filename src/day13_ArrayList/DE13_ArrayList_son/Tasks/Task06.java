package day13_ArrayList.DE13_ArrayList_son.Tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
         /* TASK :
        Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        sadece tek elemanlarını ayrı diziye bir metodda atayarak
         print eden code create ediniz.

        */

        int[] sayiArr =new int[6];
        Scanner sc =new Scanner(System.in);
        for (int i = 0; i < sayiArr.length; i++) {
            System.out.print(i+1+". elemanı agam giresen :");
            sayiArr[i]= sc.nextInt();
        }

    }//main sonu


}
