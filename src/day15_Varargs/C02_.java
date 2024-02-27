package day15_Varargs;

public class C02_ {
    public static void main(String[] args) {
        /* String varargs paremesi olan bir metot yazın, bu strinlerin uzunları toplamını return edip
           main de yazdırın
          */
        string ("Ankara","bursa","Trabzon");
    }
    private static void string(String...str) {
        System.out.println(str.length);
        int toplam =0;
        for (String value: str) {
            toplam+=value.length();

        } System.out.println(toplam);

    }
}
