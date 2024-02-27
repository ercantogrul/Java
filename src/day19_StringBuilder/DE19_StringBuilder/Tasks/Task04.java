package day19_StringBuilder.DE19_StringBuilder.Tasks;

public class Task04 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("hasan ");
        sb1.append("ali ").append(sb1).append(1);
        System.out.println(sb1);  // çıktı ne olur, run etmeden çözünüz
    }
}
