package z_calismalar.ch01_JavaIntro.soru_177;

public class Reacock extends Bird{
    public void dance(){
        System.out.println("Dance");
    }

    public static void main(String[] args) {
        Bird b = new Bird();
        Reacock p = (Reacock) b;
        p.fly();
        p.dance();
        Reacock f = (Reacock) new Bird();
        f.fly();
        f.dance();
    }
}
