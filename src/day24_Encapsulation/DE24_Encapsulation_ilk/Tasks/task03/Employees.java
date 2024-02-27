package day24_Encapsulation.DE24_Encapsulation_ilk.Tasks.task03;

public class Employees {
    private String name;
    private int salary;
    private String geburtsdatum;

    public Employees() {
    }

    public Employees(String name, int salary, String geburtsdatum) {
        this.name = name;
        this.salary = salary;
        this.geburtsdatum = geburtsdatum;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", geburtsdatum='" + geburtsdatum + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getGeburtsdatum() {
        return geburtsdatum;
    }

    public void setGeburtsdatum(String geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }


}
