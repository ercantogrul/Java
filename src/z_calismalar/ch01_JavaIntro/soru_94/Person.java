package z_calismalar.ch01_JavaIntro.soru_94;

public class Person {

    String name;
    int age = 25;

     Person(String name) {
        setName(name);
    }

    public Person (String name, int age){
        setName(name);
        setAge(age);
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
    public String show(){
        return name + " " + age;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Jesse");
        Person p2 = new Person("Walter",52);
        System.out.println("p1.show() = " + p1.show());
        System.out.println("p1.show() = " + p2.show());
    }
}
