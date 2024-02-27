package day08_Loops.DE08_Loops_ilk.L01_ForLoops.Tasks02;

public class Task02_04 {
    public static void main(String[] args) {
        // 1 ila 10 arasında rastgele üretilen 10 adet sayının toplamını bulunuz

        int toplam =0;
        for (int i = 0; i < 10; i++) {
            int sayi = (int) (Math.random()*9+1);
            toplam =toplam+sayi;
            System.out.println(sayi+", ");

        }
        System.out.println("toplam :"+toplam);

    }
}
