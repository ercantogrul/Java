package z_calismalar.OCI_sinav._223.Q105_LocaleDate;

import java.time.LocalDate;

public class Q105 {



//Given the code fragment:

public static void main(String[] args) {
    LocalDate date = LocalDate.of(2012, 01,32);  // java bu verileri basta kontrol etmiyor dolayisiyla CTE vermez.. ama sonra RTE verir  //A DateTimeException is thrown at runtime.
    date.plusDays(10);  // atama yapilmadigi icin bu satirin hic bir etkisi yok
    System.out.println(date);
}

		/* What is
		the result?
		A . 2012-02-10
		B . 2012-02-11
		C.Compilation fails
		D.A DateTimeException is thrown at runtime.  //

Answer:

*/

/*
Q_144

Given the code fragment:
public static void main (String [] args) {
LocalDate date = LocalDate.of (2012, 01, 32);
 date.plusDays (10);
 System.out.println (date);
		  What is the result?
		  A. 2012-02-10
		  B. 2012-02-11
		  C. Compilation fails
		  D. A DateTimeException is thrown at runtime.

*/
}
