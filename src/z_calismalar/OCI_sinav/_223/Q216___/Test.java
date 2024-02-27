package z_calismalar.OCI_sinav._223.Q216___;
class Product{
    double price;
}
public class Test {
   public  void  updatePrice(Product product,double price){  // product asagidan gönderilen prt dir.
       // objenin referansi geldi ama double price in ise sadece degeri geldi
       // return olmadigi icin double price in buradaki degeri burada kalir
       // ama referansi galen Product product, in yeni degeri ayni refaransta yer aldigi icin asagidada bu deger okunur
        price=price*2;
        product.price=product.price+price; // asagida prt.price=200; atanmis---buradaki product.price ile ayni olup product.price=200 dür
                                           // burada objeye 200 atandi ve 200 olan price ile toplanip 400 oldu.
   }

    public static void main(String[] args) {
        Product prt=new Product();
        prt.price=200;  //
        double newPrice=100;

        Test t=new Test();
        t.updatePrice(prt,newPrice);
        System.out.println(prt.price+":"+newPrice);
    }
}
/*
What is the result?
 A. 200.0 : 100.0
 B. 400.0 : 200.0
 C. 400.0 : 100.0
 D. Compilation fails.
  Answer: C

 */
