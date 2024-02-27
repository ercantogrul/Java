package day10_MethodCreation.DE10_MethodCreation;

public class C01_Method {
    public static void main(String[] args) {
        // Statik metot içinde ancak statik bir metot doğrudan çağrılır
        C01_Method.ilkMetot();
        ilkMetot();
        int a = 10;
        int b = 7;
        buyukYaz(a,b);
        int toplam = C01_Method.topla(a,b);
        int toplam2= Integer.sum(a,b);
    }

    private static int topla(int a, int b) {
        // void yerin int olursa geriye int bir değer return etmelidir.
        int sum = a+b;
        return sum;
    }

    private static void buyukYaz(int a, int b) {
        System.out.println(a>b? a:b);
    }

    public static void ilkMetot(){ // () parantez arasına,
                                // bu metoda göndereceğimiz parametreler yazılır
                                // void : metot bize bişey geriye göndermeyecek demektir
        System.out.println(" ilk metot çağrıldı");
    }



}
