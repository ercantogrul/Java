package z_calismalar.OCI_sinav._223.Q188;

public class another {
    public static void main(String[] args) {
        CheckingAccount acct = new CheckingAccount((int) (Math.random() * 1000)); //Math.rondom() rondom bir rakam olusturuyor.
        // line n1

        System.out.println(acct.getAmount());
    }
}
/*Which three lines, when inserted independently at line n1,
cause the program to print a 0 balance?
A.	acct.setAmount(-acct.getAmount());  // random dan üretilen sayinin negatif olanini set e gönderiyor sonuc (-gönderilen sayi) olur
B.	acct.amount = 0; <option D earlier>  //amount publick oldugu icin buradan ulasilabilinir ve amount  dogrudan sifira esitleniyor sonuc 0 olur
C.	acct.setAmount(0);                   // amount a 0 set ediliyor sonuc 0 olur
D.	acct.getAmount() = 0; <option E earlier>    // CTE__ get e deger atanmaz hata verir. get in parametresi olmaz retun olur. set in ise parametresi olur return olmaz
E.	this.amount = 0; <option A earlier>  // static olan main methodun icine this kullanilmaz CTE
F.	acct.changeAmount(0); <option F earlier>  // changeAmount methoduna 0 gönderildi ama methodda randomdan gönderilen sayi ile 0 toplandi ve geri gönderdi sonuc Random sayi olur
G.	acct.changeAmount(-acct.amount); <option G earlier>  // changeAmount methoduna - random sayi gönderildi ve methodda randomdan gönderilen sayi ile toplandi sonuc 0 olur





Answer:  B C G

*/