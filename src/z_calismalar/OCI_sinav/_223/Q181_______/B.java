package z_calismalar.OCI_sinav._223.Q181_______;

public class B {
    private int doStuff(){
        // soruda x private
        int x = 100; //Illegal modifier for parameter x; only final is permitted
        return x++;

        // private methodun icinde private bir variable kullanilamaz
   }
}
