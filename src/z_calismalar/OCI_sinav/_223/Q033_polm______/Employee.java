package z_calismalar.OCI_sinav._223.Q033_polm______;

public class Employee {
	String name;
	boolean contract;
	double salary;
	Employee() {

		//line1
	}
	public String toString() {
		return name + ":" + contract + ":" + salary;	
	}	
	public static void main(String[] args) {
		Employee e = new Employee();
		// line2
		System.out.println(e);





		//primitive boolen bir deger null -sayi-string  yazip boolean cast edip yazdirinca // false
		//ama wrapper Boolean da farkli
		boolean b = Boolean.parseBoolean(String.valueOf(23)); // false
		boolean c = Boolean.parseBoolean(null); // false
		boolean d = Boolean.parseBoolean("aaa"); // false
		//boolean d = TRUE ; // CTE
				System.out.println(d);

	}
}
/*   Which two modifications, when made independently,
  enable the code to print joe:true:100.0 ? ( Choose Two)
  		A: Replace line2 with:
		 	e.name = "Joe";
		 	e.contract = true;
			e.salary = 100;
			
		B: Replace line2 with:
		 	this.name = "Joe";  		// this. cannot be  used in static content / main method
		 	this.contract = true;
			this.salary = 100;
		 
		 C: Replace line n1 with:
			this.name = new String("Joe");
			this.contract = new Boolean(true);
			this.salary = new Double(100);
			
		D: Replace line n1 with: (was n2 in earlier versions, non-static fields can not be called under static methods)
		 	name = "Joe";
		 	contract = TRUE; // --> TRUE gives complitaion error  //primitive boolen sadece true yazinca true verir. büyük harfle yazinca (biri dahi büyük olsa) CTE verir.
			salary = 100.0f;
			
		E: Replace line n1 with:
			this("Joe", true, 100);  	// could be used to call a constructor w/ 3 parameters
		
* 'toString()' method : Object class'inda zaten oldugu icin bu methodu yazdigimizda override goruruz ve
  her object olusturdugumuzda bu method calisir. Aslinda override etmeyince zaten memory'deki yerini gosterir.



		
		
		
		
		
		
*/
