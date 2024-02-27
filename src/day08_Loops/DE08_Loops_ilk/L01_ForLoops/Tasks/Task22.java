package day08_Loops.DE08_Loops_ilk.L01_ForLoops.Tasks;

public class Task22 {

    public static void main(String[] args) {

        /* task-> 100'den 0'a kadar bütün tek sayıları print eden code create ediniz.
        99-98-97-96....
        */

        int teksayilar;

        for (int i = 100; i > 0; i--) {
            if(i%2!=0){
                teksayilar=i;
                System.out.print(teksayilar+", ");
            }

        }
        System.out.println("=======ikinci yontem:=======================");

        for (int i = 99; i > 0 ; i-=2) {
            System.out.print(i+", ");
        }


    }
}
