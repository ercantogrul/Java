package day08_Loops.DE08_Loops_ilk.L01_ForLoops;

public class s01_ForLoop_ornek {
    public static void main(String[] args) {
        int toplam = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("merhaba"); // sifirdan 10 a kadar (0-1-2-3-4-5-6-7-8-9 yani 10 defa) merhaba yazdir
            toplam = toplam+i;  // sifirdan 10 a kadar (10 dahil degil) olan sayilari topla demektir.
            System.out.println(toplam);   // 0 dan 10 a kadar olan sayilari tek tek toplaniyor

        }
        System.out.println(toplam); // for loop disinda genel toplam yapiliyor


    }
}
