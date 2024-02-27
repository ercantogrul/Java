package day25_Inheritance.DE25_InHeritance.task02;

public class SuperClass {
    int sayi  = 33;

    void ebikGabik(){
        System.out.println("Agama bolcana super offer " );
    }
    @Override
    public String toString() {
        return "SuperClass{" +
                "sayi=" + sayi +
                '}';
    }
}
