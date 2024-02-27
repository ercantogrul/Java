package day27_Polimorfizm.Task2;

public class Cat extends BigCat{

    public static void main(String[] args) {
        Cat  vanKedisi=new Cat();

        vanKedisi.getNameAnimal();//Animal name Animal Class
        vanKedisi.getNameCat();//Animal Big Cat name
        vanKedisi.getCatName();//Van İran Kedisi
        vanKedisi.getName();//Van Kedisi



    }
    @Override
    public void getName() {
        System.out.println("Van Kedisi");
    }

    @Override
    public void getCatName() {
        System.out.println("Van İran Kedisi");
    }
}
