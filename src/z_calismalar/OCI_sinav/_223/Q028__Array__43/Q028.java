package z_calismalar.OCI_sinav._223.Q028__Array__43;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q028 {

	public static void main(String[] args) {
		// given the code fragment
		String[] arr = {"Hi", "How", "Are", "You"};
		List<String> arrList = new ArrayList<>(Arrays.asList(arr));
		if (arrList.removeIf(s -> {System.out.print(s);return s.length() <= 2;})) { // < 2 // sarti sagliyorsa o degeri silip if bloga giriyor
			System.out.println(" removed"); //s causes compilation error            // sarti saglamazsa else bloguna gider
		}
		//System.out.println(arrList); //[How, Are, You]


	}
}
//What is the result?
//A.	Compilation fails.
//B.	The program compiles, but it prints nothing.
//C.	HiHowAreYou removed
//D.	An UnsupportedOperationException is thrown at runtime.




// C 	System.out.println(Arrays.toString(arrList.toArray()));