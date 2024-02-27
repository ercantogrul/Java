package day36_InterviewQuestions.Day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q01_CountsOfCharactersWithArray {
    /*
     Kullanicidan bir String aliniz.
     String'de var olan her character'in sayisini(kaç adet olduğunu) ekrana yazdiriniz.
     Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
            abaa   ==> a=3  b=1
    */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir string giriniz :");
        String str = scan.nextLine();
        str = str.trim().replace(",", "").replace(" ", "");
        String[] arr = str.split("");
        System.out.println(Arrays.toString(arr));

        birinciYol(arr,str);
        ikinciYol(arr,str);
        cozumLambda(arr,str);




    }

    private static void cozumLambda(String[] arr, String str) {
        System.out.println("\nucuncu yol=================================");
        List<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        do {
            String s = list.getFirst();
            int lengt= list.size();
            list.removeIf(p->p.equals(s));
            System.out.println(s+" harfi "+(lengt- list.size())+" adettir");
        } while(!list.isEmpty());
    }


    private static void ikinciYol(String[] arr, String str) {
        System.out.println("ikinci yol=================================");
        String metin="";
        int sayac = 0;
        for (int i = 0; i < arr.length; i++) {
            sayac = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    sayac++;
                }
            }
            if (!metin.contains(arr[i])){
                metin+=arr[i];
                System.out.print(arr[i] + "=" + sayac+" ");
            }
        }
    }

    private static void birinciYol(String[] arr,String str) {
        System.out.println("birinci yol======================");
        String str2 = str;
        String harf = "";
        int counter = 0;

        for (int i = 0; i < str2.length(); i++) {
            if (str.length() > 0) {
                counter = 0;
                harf = str.substring(0, 1);
                for (int j = 0; j < str.length(); j++) {
                    if (harf.equals(str.charAt(j) + "")) {
                        counter++;
                    }
                }
            } else break;
            System.out.print(harf + "=" + counter+" ");
            str = str.replace(harf, "");

        }
        System.out.println();
    }

}
