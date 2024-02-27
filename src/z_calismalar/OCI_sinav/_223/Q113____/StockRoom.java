package z_calismalar.OCI_sinav._223.Q113____;

public class StockRoom {
    static int stock=10;//statici ekledim
    static int qty=5; //ben ekledim
    public void purchase(int qty){
    	stock +=qty;
    	}
    public void sell(int qty){
    	stock -=qty;
    	}
    public  void  printStock(String action){
		System.out.println(action+":"+ qty +" items. Stock in Hand: " +stock);
    }
    // qty tanimlanmadan burada kullanamayiz

    public static void main(String[] args) {
        StockRoom k1=new StockRoom();
      //  qty = 5; // qty ya yukarda tanimlanip 5 atanmali, yada yukarda tanimlanip burada 5 atanmali
        k1.sell(5);
        k1.printStock("Sold");

        StockRoom k2=new StockRoom();
     //   qty = 5;
        k2.purchase(qty);
        k2.printStock("Purchased");
    }
}
/*You want the code to print:
Sold: 5 items. Stock in Hand: 5 Purchased: 5 items.
 Stock in Hand: 10? Which action enables the code to print this?
  A. Declare the stock variable and the purchase(), sell(), and printStock() methods static.
  B. Declare the stock variable and the printStock() method static.
  C. Declare the stock and qty variables and the printStock() method static.
  D. Declare the stock variable static.
Answer: C

 */
