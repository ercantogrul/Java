package day36_InterviewQuestions.DE40InterviewQuestions__.Day01;

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
        String str = scan.nextLine();// selamlaraa
        System.out.println("cozum lamda");
        cozumLambda(str);
        String[] arr = str.split("");
        Arrays.sort(arr);

        System.out.println("cozum 2 ");

        int counter=0;
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i-1].equals(arr[i])) {
                counter++;
            }
            else {
                System.out.println(arr[i-1]+ " sayisi = "+ (counter+1)+ " adettir");
                counter=0;
            }
            if(i== arr.length-1) {
                System.out.println(arr[i]+ " sayisi = "+ (counter+1)+ " adettir");
            }
        }

    }

    private static void cozumLambda(String str) {
        List<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        do {
            String s = list.getFirst();
            int lengt= list.size();
            list.removeIf(p->p.equals(s));
            System.out.println(s+" harfi "+(lengt- list.size())+" adettir");
        } while(!list.isEmpty());
    }


}
