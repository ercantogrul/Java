package z_calismalar.ch01_JavaIntro.soru_131;

public class Car extends Vehicle {
    int y;

    Car() {
        super();
        y=20;
    }

    Car(int y) {
        this.y = y;
    }
    public String toString(){
        return x + ":" + this.y;
    }

    public static void main(String[] args) {
        Vehicle y = new Car();
        System.out.println("y = " + y);
    }
}
