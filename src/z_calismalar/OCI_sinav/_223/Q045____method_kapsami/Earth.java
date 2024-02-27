package z_calismalar.OCI_sinav._223.Q045____method_kapsami;

abstract class Planet{
	 protected void revolve() {		// line n1
	}
	abstract void rotate();				// line n2
}

	 class Earth extends Planet{
//		void revolve() {		// line n3  // owerreid edilen metod kapsamasi ilk olusturuldugu Access modifiert dan daha kücük olamaz
//		 }                      // bu sadece protected veya public olabilir
		 protected void rotate() {		// line n4
		 }
}

//	 Which two modifications, made independently, enable the code to compile? (Choose two.) 
//			 A.	Make the method at line n1 public.
//			 B.	Make the method at line n2 public.
//			 C.	Make the method at line n3 public. 			√
//			 D.	Make the method at line n3 protected. 	√
//			 E.	Make the method at line n4 public.
