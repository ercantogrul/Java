package day24_Encapsulation.DE24_Encapsulation_ilk.Tasks.task01;

public class Bmi {
    private String name;
    private int age;
    private int weight;
    private double height;
    private double bmi;

    public Bmi() {
    }

    public Bmi(String name, int age, int weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height/100;

        this.bmi = weight/(height*height);

    }

    @Override
    public String toString() {
        return "Bmi{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(int height) {

        this.height = height;
    }
    public double getBMI(){
        bmi =weight/(height*height);
        System.out.println(bmi);
        return bmi;
    }

    public void getStatus() {
        if (bmi<18){
            System.out.println("Zayif");
        } else if (bmi<25) {
            System.out.println("Normal");

        } else if (bmi<30) {
            System.out.println("Kilolu");

        }else System.out.println("Obez");

    }


}
