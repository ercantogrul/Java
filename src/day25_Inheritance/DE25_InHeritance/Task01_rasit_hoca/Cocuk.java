package day25_Inheritance.DE25_InHeritance.Task01_rasit_hoca;

public class Cocuk extends Baba {

    private String tc = "987654321";

    public void minecraft() {
        System.out.println("Cok iyi oyun oynar");
    }

    public Cocuk() {
        super("ali");
        System.out.println("Cocuk cons. calisti");
    }
}
