package day21_StaticKeyword.StaticVariable;

public class Deneme {
    static  int sayi=20;
    int yas = 40;

    public Deneme() { // parametresiz constructor ici bos
    }
    public void Deneme() {
        sayi++;
        yas++;
        System.out.println(sayi+""+yas);

    }

    public static void main(String[] args) {
        Deneme obj1= new Deneme(); // parametresiz constructor ici bos oldugu icin variable larin instince degerlerini görör
        Deneme obj2= new Deneme();
        System.out.println(obj2.sayi+" "+obj2.yas);


        obj2.Deneme();
    }
}
