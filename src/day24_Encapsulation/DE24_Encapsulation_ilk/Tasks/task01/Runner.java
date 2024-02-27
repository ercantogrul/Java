package day24_Encapsulation.DE24_Encapsulation_ilk.Tasks.task01;

public class Runner {
    public static void main(String[] args) {
        Bmi kisi =new Bmi("ercan",45,95,182);
        System.out.println(kisi);
        double bmi = kisi.getBMI();
        kisi.getStatus();



    }

}
