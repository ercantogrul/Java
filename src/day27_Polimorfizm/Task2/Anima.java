package day27_Polimorfizm.Task2;

public abstract class Anima {

    private int a;
    private static final String name="Animal";

   public abstract void getName();//abstract method mutlaka alt sınıflar implement etmeli (abstract chid sınıflar hariç)

    public void getNameAnimal() {//concrete method
        System.out.println("Animal name");


    }


}