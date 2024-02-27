package day13_ArrayList.DE13_ArrayList_ilk.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task03_istenen_sayinin_varligini_kontrol {
    public static void main(String[] args) {

        // Task ->  bir listte istenen sayının varlığı kontrol eden code create ediniz.

        ArrayList<Integer> listSayi = new ArrayList<>(Arrays.asList(1, 24, 23, 14, 19, 60, 1, 55, 27, 1, 38));

        Scanner sc = new Scanner(System.in);
        System.out.print("agam hangi sayı arirsen :");
        int ara = sc.nextInt();
        boolean varMi = false;

        for (int i = 0; i < listSayi.size(); i++) {
            if (listSayi.get(i).equals(ara)) {
                varMi =true;
                break;
            }else  varMi =false;
        }
        System.out.println(varMi);


    }
}
