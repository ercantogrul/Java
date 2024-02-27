package day08_Loops.DE08_Loops_ilk.L02_WhileLoops;

public class C01_WhileLoop {
    public static void main(String[] args) {

        //////////////====for============================
        for (int i = 0; i <10 ; i++) {
            // code
        }
        //////////////====while============================
        int i=0;
        while (i<10){
            // code
            i++;
        }


        //////////////===while============================

        int toplam =0;
        long sayi=378573457;
        long sayi2=sayi;
        while (0<sayi2) {
            int rakam = (int) (sayi2%10);
            toplam += rakam;
            sayi2 = sayi2/10;
        }
        System.out.println("\n"+sayi+" nin Rakamları Toplamı="+toplam);

    }
}
