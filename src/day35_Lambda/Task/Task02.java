package day35_Lambda.Task;

import java.util.ArrayList;
import java.util.List;

public class Task02 {
    /* Rastgele 20 Integer(1 den 100 e kadar) elemandan oluşan bir List yapın
    stream yardım ile
   a) Bu list in tek elemanlarına, 1 ekleyin, çift elemalarını ise kaldırın (silin)
   b) aynısını stream içerisinde metot kullanarak yapın

     */
    public static void main(String[] args) {

        List<Integer> liest = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int sayi = (int) (Math.random() * 100 + 1);
            liest.add(sayi);
        }
        System.out.println(liest);

        liest.stream().filter(p->p%2==1).forEach(p-> System.out.print((p+1)+" "));
        System.out.println();
        liest.stream().filter(p->p%2==1).map(p->p+1).forEach(p-> System.out.print((p)+" "));
        System.out.println();
        liest.stream().filter(Task02::tekRakanmlariAlBirEkle).forEach(p-> System.out.print(p+1+" "));





    }

    private static boolean tekRakanmlariAlBirEkle(Integer p) {
        if (p%2==1){
            //System.out.print(p+1);
            return true;
        }
        else return false;
    }
}
