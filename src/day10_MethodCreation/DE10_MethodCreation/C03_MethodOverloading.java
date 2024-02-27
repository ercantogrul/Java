package day10_MethodCreation.DE10_MethodCreation;

public class C03_MethodOverloading {
    public static void main(String[] args) {
          topla(10,15);

//        topla(10,20,30);
//        topla(10.3,5);
//        topla(10,5.5);
         topla(10.3,5.5);
       // aynı isimde, farklı parametre (parametre sayısı, ve/veya
      // parametre sırası ve/veya parametre veri tipi) ile metot oluşturmaya
      // "method overloading" denir.
    }

    private static void topla(int birinciSayi, int ikinciSayi) {
        System.out.println("1.metot çalıştı");
    }
    private static int topla(byte birinciSayi2, int ikinciSayi) {
        System.out.println("1.metot çalıştı");
        return  birinciSayi2+ikinciSayi;
    }
    private static void topla(int i, int i1,int i3) {
        System.out.println("2.metot çalıştı");
    }
    private static void topla(double i, int i1) {
        System.out.println("3.metot çalıştı");
    }
    private static void topla(double i, double i1) {
        System.out.println("4.metot çalıştı");
    }
    private static void topla(int i, double i1) {
        System.out.println("5.metot çalıştı");
    }
}
