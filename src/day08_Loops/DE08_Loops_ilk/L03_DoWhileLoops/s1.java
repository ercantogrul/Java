package day08_Loops.DE08_Loops_ilk.L03_DoWhileLoops;

public class s1 {
    public static void main(String[] args) {


        int sayi;
        do {
           sayi = (int) (Math.random()*11);
            System.out.print(sayi+" ");
        }while (sayi!=0);

        System.out.println("============ikinci yol while===============" );


        for (int i = 1; i <11 ; i++) {
            int sayi2 = (int) (Math.random()*11);
            if(sayi2==0) break; {

            }
            System.out.print(sayi2+" ");
        }

























    }
}
