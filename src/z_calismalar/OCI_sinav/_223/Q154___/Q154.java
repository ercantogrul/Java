package z_calismalar.OCI_sinav._223.Q154___;

import java.util.ArrayList;
import java.util.Arrays;

public class Q154 {
    public static void main(String[] args) {
        ArrayList myList = new ArrayList();  // bu sekilde tanimlaninca her türlü veri eklenebilir demekti
        String[] myArray;
        try {
            while (true) {                  //infinite doner. Memoriden kaynaklanan mainde bir hata olusur. Memoryoverflow da hata yani.
           // while sürekli true oldugu icin myList e sonsuza kadar  myList.add("My String");ekliyecek-- sonunda hafiza yetmeyecegi icin hata verecek
                myList.add("My String");
            }
        } catch (RuntimeException re) {
            System.out.println("Cought a RuntimeException");
        } catch (Exception e) {
            System.out.println("Cought an Exception");
        }
        System.out.println("Ready to use");
    }
    //Exception in thread "main" java.lang.OutOfMemoryError: Java heap space

}
	/*
	What is the result?
	A.	Execution terminates in the first catch statement, and Caught a RuntimeException is printed to the console.
	B.	Execution terminates in the second catch statement, and Caught an Exception is printed to the console.
	C.	A runtime error is thrown in the thread "main".       // "main de bir çalışma zamanı hatası atılıyor.
	D.	Execution completes normally, and Ready to use is printed to the console.
	E.	The code fails to compile because a throws keyword is required.
	Answer: C

	 */
