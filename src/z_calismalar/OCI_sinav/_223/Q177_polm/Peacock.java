package z_calismalar.OCI_sinav._223.Q177_polm;

public class Peacock extends Bird {
		public  void dance() {
			System.out.println("Dance.");
		}
		
			public static void main(String[] args) {
				/* insert code snippet here */
				Bird b = new Peacock ();
				Peacock p = (Peacock) b;

				p.fly();
				p.dance();
			}
}
/* Which code snippet can be inserted to print Fly.Dance. ?

A.	Bird p = new Peacock(); // referens Bird den alinmis. burada dance() methodu olmadigi icin CTE verir.

B.	Bird b = new Bird();
	Peacock p = (Peacock) b; // burada b objesi new Bird();indan olustugu icin ::Peacock p:: objesi icin new Bird(); constr. verilemez ClassCastException firlarir RTE

C.	Peacock b = new Peacock ();
	Bird p = (Bird) b;  // // p objesi icin referens Bird den alinmis. burada dance() methodu olmadigi icin CTE verir.

D.	Bird b = new Peacock ();
	Peacock p = (Peacock) b; // bu dogru

Answer: D



*/