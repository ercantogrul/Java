package day08_Loops.DE08_Loops_ilk.L02_WhileLoops.Tasks;

public class s1 {
    public static void main(String[] args) {
        int i=0;
        int sayac=0;
        int toplam =0;
        while (i<=333){
            sayac++;
            toplam =toplam+i;
            if(toplam>=333){
                System.out.println(sayac);
            }
            i++;
        }
    }
}
