package day08_Loops.DE08_Loops_ilk.L01_ForLoops.Tasks;

import java.util.Scanner;

public class Task25___en_fazla_bir_karakter_yaz {

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

        String yeniMetin = "";

        for (int i = 0; i < str.length(); i++) {
            String harf = str.substring(i, i + 1);

            if (!yeniMetin.contains(harf)) {
                yeniMetin = yeniMetin + harf;
            }
        }
        System.out.println(yeniMetin);



        System.out.println("========ikinci yöntem=================");
        //===================================================
        for (int i = 0; i < str.length(); i++) {
            String ch = ""+str.charAt(i);
            yeniMetin = yeniMetin.replace(ch, "") + ch;             // ayni olan bütün karakterleri siliyor ve sonuna bir tane ekliyor

        }
        System.out.println(yeniMetin);









    }
}