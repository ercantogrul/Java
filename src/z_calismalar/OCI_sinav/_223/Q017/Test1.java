package z_calismalar.OCI_sinav._223.Q017;

public class Test1 {
	int x, y;

	public Test1(int x, int y) {
		initialize(x, y);
	}
	
	public void initialize(int x, int y) {
		this.x = x * x;
		this.y = y * y;
	}

	public static void main(String[] args) {
	int x = 3, y =5;
	Test1 objTest = new Test1(x, y);

	System.out.println(objTest.x + " " + objTest.y); // 9 25    prints the local variables

	}
}
//What is the result?
//A.	Compilation fails.
//B.	3 5
//C.	0 0
//D.	9 25
