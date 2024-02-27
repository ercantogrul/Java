package day08_Loops.DE08_Loops_ilk.L02_WhileLoops;

public class C02_WhileLoop {
    public static void main(String[] args) {
      /*  Başlangıç bitiş ve değişim değerleri net  bilinen tekrarlarda for loop ama adım sayısı değişim değeri
        net bilinmeyen belli bir şarta(durum-boolean) bağlı olan tekrarlara while loop kullanılması tercih edilir.
         */
        //Task01-> 3'den 20'ye kadar olan tamsayıları print eden code create ediniz.


        int i = 3;

        while (i <= 20) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        // 2.yol
        for (int j = 3; j <= 20; j++) {
            System.out.print(j + " ");
        }
        System.out.println();

        //3.yol========================================================
        i = 2;
        do {
            i++;
            System.out.print(i + " ");
        } while (i < 20);
        System.out.println();

        //4.yol
        i = 3;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 20);


    }


}
