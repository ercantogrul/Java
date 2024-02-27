package day19_StringBuilder.DE19_StringBuilder.Tasks;

public class Task03_tersCevir {
    public static void main(String[] args) {
        String str = "Selamlar Kardeş";
        // StringBulder yardımı ile ters cevirin

        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());
    }
}
