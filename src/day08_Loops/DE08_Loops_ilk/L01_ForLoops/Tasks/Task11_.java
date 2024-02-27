package day08_Loops.DE08_Loops_ilk.L01_ForLoops.Tasks;

public class Task11_ {
    public static void main(String[] args) {

        /*
        A               //1. satıra 1 harf
        A B             //2. satıra 2 harf
        A B C           //3. satıra 3 harf
        A B C D
        A B C D E
        A B C D E F
        şekli print eden code create ediniz.  65=A'nın ascıı değeri

        */



        for (int i = 65; i <71; i++) {
            for (int j = 65; j <=i; j++) {

                char ch = (char) j;
                System.out.print(" "+ ch);

            }
            System.out.println();

        }



    }
}
