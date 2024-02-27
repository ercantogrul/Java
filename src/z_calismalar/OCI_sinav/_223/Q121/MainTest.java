package z_calismalar.OCI_sinav._223.Q121;

public class MainTest {

	public static void main(int[] args) {
		System.out.println("int main " + args[0]);
	}
	public static void main(Object[] args) {  // argümanlari farkli main isminde bir method dur.
		System.out.println("Object main " + args[0]);
	}
	public static void main(String[] args) {  // bu ise orjinal main methoddur
		System.out.println("String main " + args[0]);

	}
}

//		A.	int main 1
//		B.	Object main 1
//		C.	String main 1
//		D.	Compilation fails
//		E.	An exception is thrown at runtime
