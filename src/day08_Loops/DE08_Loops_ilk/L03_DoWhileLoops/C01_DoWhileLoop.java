package day08_Loops.DE08_Loops_ilk.L03_DoWhileLoops;

public class C01_DoWhileLoop {
    public static void main(String[] args) {
        /*
        While loop-> önce sart konrol edilir eğer  sart sonucu true alınırsa body action çalışır
        do-While loop-> önce body action çalışır sonra şart kontrol edilir.Sart true ise loop devam eder.
        sart false ise loop kırılır ve loopdan sonraki ilk satır çalışır.
        do-While loop->  game app. de daha çok kullanılır.
        Trick: while loop sart sağlanmazsa hiç çaılşmayabilir ama do-while sart sağalasın sağlamasın
        en az bir kez çalışır..

         */

        // Sıfırı bulana kadar, rastgele 0,10 arasında sayılar üretiniz,
        // ürettiğiniz sayıları ekrana yazdırınız
        int sayi;
        do {
            sayi= (int) (Math.random()*11);
            System.out.print(sayi+" ");
        } while (sayi != 0);

    }
}
