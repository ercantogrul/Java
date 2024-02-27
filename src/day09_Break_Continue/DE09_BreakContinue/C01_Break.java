package day09_Break_Continue.DE09_BreakContinue;

public class C01_Break {
    public static void main(String[] args) {
        // rastgele  1 ile 100 arasında 50 sayısını bulana kadar sayılar üretiniz,
        // kaç sayı ürettikten sonra 50 sayısı bulunmuştur
        int counter=0;

        for (int i = 0; i <Integer.MAX_VALUE ; i++) {
            int sayi= (int) (Math.random()*100);
            if (sayi==50) break;
            else counter++;
        }

        System.out.println("ilk 50 den önce " + counter+" adet sayı vardır");
    }
}
