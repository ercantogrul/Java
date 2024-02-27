package Faruk_hoca_yeni_ilk5gun.DE05_IfStatementTernaryOperators.DE05_IfStatementTernaryOperators;

public class C01_IfStatement {
    public static void main(String[] args) {
        int sayi = (int) (Math.random()*20); // 0 ile 19 ( dahil bir sayı üretir)
        // Math.random() 0.0000 ila 0.99999 arasında double bir sayı üretir
        System.out.println("sayi = " + sayi);

        if (sayi%2==0) {
            System.out.println("Sayı çifttir");
        }

        System.out.println("bitti");


    }
}
