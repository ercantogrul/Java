package z_calismalar.OCI_sinav._223.Q119_polm;

public class App {
  String greet="Welcome!";
    public App(){
       // greet="Hello!"; // bu sekilde tanimlansa idi greet yukardaki instance variable olurdu
        String greet="Hello!"; // bu yukarda ki obje ile herhangi bir ilgisi yok, bu farkli bir variable

    }
    public void setGreet(){
        String greet="Good Day!"; // buda methoddaki variablede ayni sekilde yukardaki instance variable dan farklidir
    }

    public static void main(String[] args) {
        App t=new App();
        String greet="Good Luck!";
      System.out.println(t.greet);
    }
}
/*What is the result?
A. Good Luck!
B. Good Day!
C. Welcome!
D. Hello!
answer C
 */
