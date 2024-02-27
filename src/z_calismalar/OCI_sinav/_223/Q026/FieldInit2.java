package z_calismalar.OCI_sinav._223.Q026;

public class FieldInit2 {
	byte by;
	short sh;
	int i;
	long l;
	float f;	
	double d;
	boolean bo;
	char c;
	String s;
	StringBuilder sb;
	StringBuffer sBuf;
	Byte byte1;
	Short short1;
	Integer integer1;
	Long long1;
	Float float1;
	Double double1;
	Boolean boolean1;
	Character character1;
	int[] intarray;
	String [] strarr;
	void printAll() {
		System.out.println("byte = " + by);
		System.out.println("short= " + sh);
		System.out.println("int = " + i);        //0
		System.out.println("long = " + l);       //0
		System.out.println("float = " + f);      //0.0
		System.out.println("double = " + d);     //0.0
		System.out.println("boolean = " + bo);   //false
		System.out.println("char = " + c);       //-


		//bütün wapperClaslar,String,StringBuilder, diziler (yani class olanlarin hepsi) null alir
		System.out.println("Byte = " + byte1);
		System.out.println("Short = " + short1);
		System.out.println("Integer = " + integer1);
		System.out.println("Long = " + long1);
		System.out.println("Float = " + float1);
		System.out.println("Double = " + double1);
		System.out.println("Boolean = " + boolean1);
		System.out.println("Character = " + character1);
		System.out.println("String = " + s);
		System.out.println("StringBuilder = " + sb);
		System.out.println("StringBuffer = " + sBuf);
		System.out.println("String array = " + strarr);
		System.out.println("int array = " + intarray);
		
	}

	public static void main(String[] args) {
		FieldInit2 f = new FieldInit2();
		f.printAll();
	}
}
//What is the result? 
//A. c=null b=true f=0.0 
//B. c= b=false f=0.0 
//C. c=null b=false f=0.0 
//D. c=0 b=false f=0.0F

