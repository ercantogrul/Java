package day08_Loops.DE08_Loops.L01_ForLoops.Tasks;

import java.util.Scanner;

public class Task25 {

    /*
           TASK  :
           Bir String içindeki tüm karakterleri en fazla bir kez print eden  create ediniz.
           Test Data:
           input: "aabbcccccddddaaa"
           output: abcd

        */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir string giriniz");
        String str = input.nextLine();//"aabbcccccddddaaa"
        String output = "";//işleme etki etmeyecek boş kutu tanımlandı
        for (int i = 0; i <str.length() ; i++) {
            String ch = ""+str.charAt(i);
            if (!output.contains(ch)) output = output + ch;
        }
        System.out.println(output);

        // 2.yol
        output=str;
        for (int i = 0; i <str.length() ; i++) {
            String ch = ""+str.charAt(i);
            output = output.replace(ch,"")+ch;
        }
        System.out.println(output);
    }
}
