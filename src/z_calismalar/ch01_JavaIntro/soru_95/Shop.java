package z_calismalar.ch01_JavaIntro.soru_95;
import java.util.ArrayList;
import java.util.List;

public class Shop {
    public static void main(String[] args) {
        List<Product> lst = new ArrayList<>();
        lst.add(new Product(10,"IceCream"));
        lst.add(new Product(11,"cikolata"));
        Product p1 = new Product(10,"IceCream");
        System.out.println("lst.indexOf(p1) = " + lst.indexOf(p1));
        System.out.println("p1 = " + p1);





    }
}
