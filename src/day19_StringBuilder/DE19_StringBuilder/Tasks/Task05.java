package day19_StringBuilder.DE19_StringBuilder.Tasks;

public class Task05 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hasan ");
        sb1.toString().toLowerCase();  //System.out.println("sb1.toString().toLowerCase() = " + sb1.toString().toLowerCase());
        // sb1 stringe cevrildi ama atamasi yapuilmadigi icin sb1 ayni kalir
        //String st =sb1.toString().toLowerCase(); System.out.println(st);  bu ve yukardaki hasanolur

        System.out.println(sb1);  // Çıktı ne olur , run etmeden bulunuz //Hasan
    }
}
