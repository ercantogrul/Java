package day36_InterviewQuestions.Day03;

import java.util.ArrayList;

public class Q02_CreateRandomList_SetList {
    // int array list oluşturun 10 elemandan oluşmalı
    // random ekle isminde void bir metod oluşturun  ve parametresi int array list olsun.
    // bu metod array list içinde 0' dan 20 ye kadar değer atasın.
    // eğer çift sayı atarsa o elemanının yerine 111 yazsın
    // eğer çift sayı yoksa çift sayı yoktur mesajını versin.
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();


        randomEkleme(list);


    }

    private static void randomEkleme(ArrayList<Integer> list) {
        int eleman=0;
        int ciftSayi=1;
        for (int i = 0; i < 10; i++) {
             eleman= (int) (Math.random() * 20);
            if (eleman % 2 == 0) {
                list.add(i, 111);
            } else {
                list.add(i, eleman);
            }
        }
        System.out.println(list);

        if (!list.contains(111)) {
            System.out.println("çift sayı yoktur");
        }


    }


}
