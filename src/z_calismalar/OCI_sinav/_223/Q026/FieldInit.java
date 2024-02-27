package z_calismalar.OCI_sinav._223.Q026;

public class FieldInit {
	Character c;   //WapperClass dan olusanlarda null yazar
	boolean b;
	float f;
	void printAll() {
		System.out.println("c = " + c);
		System.out.println("b = " + b);
		System.out.println("f = " + f);
	}
	public static void main(String[] args) {
		FieldInit f = new FieldInit();
		f.printAll();

	}
}
//What is the result? 
//A. c=null b=true f=0.0 
//B. c= b=false f=0.0 
//C. c=null b=false f=0.0 
//D. c=0 b=false f=0.0F


// C

