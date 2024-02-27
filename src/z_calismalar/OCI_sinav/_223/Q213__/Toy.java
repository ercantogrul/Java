package z_calismalar.OCI_sinav._223.Q213__;

abstract class Toy {
    int price;
    //line n1;


}
/*
A)  public static void insertToy(){  // bir method abstract ve static keyword'lere ayni anda sahip olamaz CTE verir.
                                     // burada sadece static ve gövdeli konkret method oldugu icin dogru
        //  code goes here
    }

B)  final Toy getToy(){
        return new Toy();// Final method da new Toy() denilerek bir obje geri gönderilmez. return yapilirsa CTE verir.
    }

C)  public void printToy()   // gövdesiz konkret bir method abstract bir class da kullanilamaz. gövdesiz ise abstract olmak zorunda// yanlis

  cözümde asagidaki sekilde yazilmis. asagidaki gibni olsaydi dogru olurdu
 C)  public void printToy() {}  // gövdeli konkret bir method abstract bir class da olabilir

D)  public int calculataePrice(){ // gövdeli konkret bir method abstract bir class da olabilir
        return price;
    }

E)  public abstract int computeDiscount();  // abstract gövdesiz bir method abstract bir class da olabilir

 which code fragments are valid at line n1?
    A. Option A
    B. Option B
    C. Option C
    D. Option D
    E. Option E


Answer:
 A D E
*/