package day12_Arrays.DE12_Arrays.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class _12_Array_no14 {

    public static void main(String[] args) {

        /*
        int array oluşturun (intArr)
        Eğer 1 " ve" 4 elemanlarına aynı anda sahip değilse true dönsün.
        Eğer 1 ve 4 elemanlarına aynı anda sahipse false dönsün.

        no14([1, 2, 3]) → true
        no14([1, 2, 3, 4]) → false
        no14([2, 3, 4]) → true

        bir array oluşturun ve elemanları : 1,2,3,4
        Sonuç false olmalı
        NOT: Array elemanlarını 1,2,3 olarak değiştirirseniz sonuç doğru olmalı
         */

        // code start here

        Scanner scan = new Scanner(System.in);

        String str1 = scan.nextLine();

        String[] arr1 = str1.split(" ");

        int[] intArr = new int[arr1.length];

        int count = 0;

        for (int i = 0; i < intArr.length; i++) {

            int i1 = Integer.parseInt(arr1[i]);

            intArr[count] = i1;

            count++;
        }

        //Kod buradan başlıyor.. Yukarısını değiştirmeyiniz..
        // intArr ı kullanın.
        boolean bir=false;
        boolean dort=false;
        for (int i = 0; i < intArr.length ; i++) {
            if (intArr[i] == 1) bir=true;
            if (intArr[i] == 4) dort=true;
        }

        if (bir && dort) System.out.println(false);
        else System.out.println(true);

        // 2. yol (ustteki tercih edilir)
        int birS=0;
        int dortS=0;
        for (int i = 0; i < intArr.length ; i++) {
            if (intArr[i] == 1) birS++;
            if (intArr[i] == 4) dortS++;
        }
        if (birS>0 && dortS>0 )System.out.println(false);
        else System.out.println(true);
       // 3. yol ( 0:false ve 1:true düşünün aynı boolen gibi olur
        birS=0;
        dortS=0;
        for (int i = 0; i < intArr.length ; i++) {
            if (intArr[i] == 1) birS=1;
            if (intArr[i] == 4) dortS=1;
        }
        if (birS>0 && dortS>0 )System.out.println(false);
        else System.out.println(true);

    }
}