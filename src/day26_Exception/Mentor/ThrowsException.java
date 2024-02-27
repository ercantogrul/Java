package day26_Exception.Mentor;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {


    public static void main(String[] args) throws InterruptedException, FileNotFoundException {

        // throws sadece checked exception için kullanılır

        Thread.sleep(100);
        Thread.sleep(100);
        Thread.sleep(100);
        FileInputStream file=new FileInputStream("src/Projects/Manav/Manav.txt");

        System.out.println("main");





    }
}
