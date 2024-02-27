package day08_Loops.DE08_Loops_ilk.L02_WhileLoops.Tasks;

public class Task09 {
    public static void main(String[] args) {
        // task-> istenilen kadar tamsayının toplamını print eden code create ediniz

        int n =10;
        int toplam =0;
        for (int i = 0; i <= n; i++) {
            toplam+=i;

        }
        System.out.println(toplam);
        //=========
        int j =0;
        int topl =0;
        while (j<=n) {
            topl+=j;
            j++;

        }
        System.out.println(topl);


    }

}
