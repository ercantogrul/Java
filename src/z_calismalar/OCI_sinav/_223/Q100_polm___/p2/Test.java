package z_calismalar.OCI_sinav._223.Q100_polm___.p2;


import z_calismalar.OCI_sinav._223.Q100_polm___.p1.Acc;

public class Test extends Acc {
		public static void main(String[] args) {
	        Acc obj = new Test();

			Acc obj2 = new Acc();  //s

			Test obj3 = new Test(); // r ve s
			// farkli package de bulunan protected Access modifiert bir variable la ulasmak icin objeyi child  türünden olusturmak gerekir
			//yani Test class indan olusturulan bj3 ile  protected int r ye ulasilabilir

		  //Test obj4 = new Acc(); //parent class referans vereilemez CTE veir







	//Protected is inheritable to sub class (outside the package) so there for if
	// the sub class’ object was created then you could access to the protected variable.
	// But the object was created from super class

	    }
	}
	/**
	 Which statement is true?
	  A. Both p and s are accessible via obj.
	  B. Only s is accessible via obj.
	  C. Both r and s are accessible via obj.
	  D. p, r, and s are accessible via obj.

	 Answer: B
	 
	 
	 So, public can be reached from anywhere....
	 protected can be reached from the same package,
	 and if we need to reach from another package,
	 it needs to be extend from parent AND needs to
	 create an object from the child class...
	 Default only can be reached from same package...
	 Private only from same class.


	 */

