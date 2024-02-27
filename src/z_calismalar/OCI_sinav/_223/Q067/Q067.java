package z_calismalar.OCI_sinav._223.Q067;

public class Q067 {

}
class Caller {
   private void init() {  // private method lar sadece kendi classlarinda kullanilabilirler
       //private cannot access
        System.out.println("Initialized"); 
    }
     public void start() {
        init();  // init private method ayni class icinde oldugu iicin bu sekilde kullanilabilir
        System.out.println("Started");
    }
}

class TestCall {
    public static void main(String[] args) {
        Caller c = new Caller();
//        c.start();
//       c.init();
        // 1: static olmayan methodlar static bir method (main) icinde dogrudan kullanilamaz
        //2. bir obje ile kullanilabilir
        //3. ama private olan method veya obje sadece ayni class icerisinde kullanilabilir
    }
}

//What is the result?
//A. An exception is thrown at runtime.
//B. InitializedStartedInitialized
//C. InitializedStarted
//D. Compilation fails.





//Answer: D

