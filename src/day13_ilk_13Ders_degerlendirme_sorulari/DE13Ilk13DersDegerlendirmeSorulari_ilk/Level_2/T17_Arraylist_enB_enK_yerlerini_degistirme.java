package day13_ilk_13Ders_degerlendirme_sorulari.DE13Ilk13DersDegerlendirmeSorulari_ilk.Level_2;

import java.util.ArrayList;
import java.util.Scanner;

public class T17_Arraylist_enB_enK_yerlerini_degistirme {
    /* rastgele n elemanlı ( ni klavyeden okutun) bir ArrayList üretin
    (sayılar 1 ila 100 arasında olsun)     bu arrayın en küçük elemanı ile
    en büyük elemanı yer değiştirin(yer değişme işlemi bir method içinde olsun)
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int n = scan.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add((int) (Math.random() * 100 + 1));
        }
        System.out.println("ilk list: " + list);

        enBenKyerDegistirme(list);


    }

    private static void enBenKyerDegistirme(ArrayList<Integer> list) {
        int enB = Integer.MIN_VALUE;
        int enK = Integer.MAX_VALUE;
        int enBidx = 0;
        int enKidx = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > enB) {
                enB = list.get(i);
                enBidx = i;
            }
            if (list.get(i) < enK) {
                enK = list.get(i);
                enKidx=i;
            }
        }
        System.out.println("enK sayi : "+ enK);
        System.out.println("enB sayi : "+enB);

        list.set(enBidx,enK);
        list.set(enKidx,enB);

        System.out.println("yeni list :"+list);











    }
}
