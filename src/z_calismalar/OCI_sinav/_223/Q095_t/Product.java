package z_calismalar.OCI_sinav._223.Q095_t;

import java.util.ArrayList;
import java.util.List;

class Product {
    int id;
    String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Shop {
    public static void main(String[] args) {
        List<Product> lst = new ArrayList<>();
        lst.add(new Product(10, "IceCream")); //lst deil 1st. hata verince lst cevirdim.
        lst.add(new Product(11, "Chocolate"));

        Product p1 = new Product(10, "IceCream");
        System.out.println(lst.indexOf(p1)); //p1 i lst e eklemedigi icin (list de yer almadigi icin) -1 verir.

        Product p2 = new Product(10, "IceCream");  // her new yapinca yeni bir referansla yeni bir obj üretilir
        lst.add(p2);
        Product p3 =p2;// dersek esitleme yapmis olur add yapinca ve  lst.indexOf(p2) ve lst.indexOf(p3) yazarsak ikiside 2 gelir
        // önemli not: bu String den olusmus olsaydi gecerli olmazdi

        System.out.println(lst.indexOf(p2)); // p2 eklendigi yerin index ini verir  //2
        System.out.println(lst.indexOf(p3)); // esitleme yapildigi icin üstteki ile ayni sonucu verir  //2

        System.out.println(lst.indexOf(new Product(10, "IceCream"))); // new yapip yeni bir referansla yeni bir obj üretildi ama liste eklenmedi bubnun icin cikti -1 olur
        System.out.println(lst.indexOf(new Product(11, "Chocolate")));
    }
}



/*
 *What is the result?
		A. true
		B. false
		C. -1
		D. 0
		Answer: C
 */