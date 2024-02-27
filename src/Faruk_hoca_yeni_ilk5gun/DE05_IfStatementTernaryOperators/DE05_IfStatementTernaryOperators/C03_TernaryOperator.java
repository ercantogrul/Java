package Faruk_hoca_yeni_ilk5gun.DE05_IfStatementTernaryOperators.DE05_IfStatementTernaryOperators;

public class C03_TernaryOperator {
    public static void main(String[] args) {
        int i1 = 35;
        int i2 = 53;

        String sonuc = i1>i2 ? "Buyuktur":"kucuktur";
        System.out.println("sonuc = " + sonuc);

        System.out.println("Sonuc2 = " +( i1<i2 ? "Kucuktur":"Buyuktur"));

    }
}
