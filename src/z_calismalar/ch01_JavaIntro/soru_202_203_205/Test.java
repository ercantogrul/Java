package z_calismalar.ch01_JavaIntro.soru_202_203_205;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Employee manager = new Manager();
        Manager manager2 = new Manager();
        Employee director = new Director();
//        director.stockOptions = 1_000;
//        employee.salary = 50_000;
//        manager.budget = 1_000_000;
//        manager.stockOption = 500;
//        employee.budget = 200_000;
//        director.salary = 80_000;
        manager2.salary=9;
        String myStr = "Hello World ";
        myStr.trim();
        int i1 =myStr.indexOf(" ");
        System.out.println("i1 = " + i1);

        LocalDate date = LocalDate.of(2012,1,30);
        date.plusDays(10);
        System.out.println(date);

    }
}
