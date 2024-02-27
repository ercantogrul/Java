package day25_Inheritance.DE25_InHeritance.task02;

public class Main {
    public static void main(String[] args) {
        SubClass sub = new SubClass();
        sub.ebikGabik();
        System.out.println("sub.sayi = " + sub.sayi);

        SuperClass sp = new SuperClass();
        sp.ebikGabik();
        System.out.println("sp.sayi = " + sp.sayi);
        System.out.println("__________________");

        sub.javaCAN();
        System.out.println("::::::::::::::::::");
        System.out.println(sub);


    }



}
