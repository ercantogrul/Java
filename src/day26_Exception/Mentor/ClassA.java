package day26_Exception.Mentor;

public class ClassA {

    public void method1() throws InterruptedException {
        System.out.println("Method1 çalıştı");
        Thread.sleep(110);
        System.out.println("MEthod1 bitti");
    }


    public void method2() throws InterruptedException {
        method1();
    }

    public void method3() {
        try {
            method1();
            method2();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
