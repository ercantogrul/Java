package day36_InterviewQuestions.Day03;

import java.util.ArrayList;
import java.util.Arrays;

public class Q05_SpecialCharRemoveArray___ {
    /*
   Problem Tanımı :
   getSum isminde bir method oluşturun.
   Parametresi ArrayList'tir.
   Dizideki tüm $ ları kaldır ve tüm sayıları topla
   return yaptğımız veri tipi 'int' olmalıdır.
   sonuç 0'dan küçükse, -1 yazdırın.

   Örnek1:
   ArrayList = $13, $15, $20
   Cevap = 48 olmalı

   Örnek 2 :
   ArrayList= $-13, $0, $0
   Cevap = -1 olmalı.
    */


    //parse int : primitive return eder
    //value Of : non primitive return eder
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<String>(Arrays.asList("$13", "$15", "$20"));

        getSum(arrList);
        getSum2(arrList);
        System.out.println("Toplam : " + getSum2(arrList));

    }



    private static void getSum(ArrayList<String> arrList) {
        int toplam = 0;
        for (int i = 0; i < arrList.size(); i++) {
            toplam+= Integer.parseInt(arrList.get(i).substring(1,3));
        }
        System.out.println(toplam);
    }

    private static int getSum2(ArrayList<String> arrList) {
        int toplam=0;
        for (String eleman:arrList) {
            String str = eleman.replace("$","");
            toplam += Integer.parseInt(str);
        }
        return toplam;
    }

}