package z_calismalar.OCI_sinav._223.Q129__;

public class Q129 {

	//static int ans; //static yapilirsa ans class a ait olg icin ok boyle olursa cevap Answer =0;
		public static void main(String[] args) {
			//int ans=0;   // int ans yi burada tanimlasaydik CTE hatasi gider yerine (ans = num/div; RTE verirdi)
			try {
				int num =10;
				int div =0;
				int ans = num/div;  // int ans , try scop'unda tanimlandigi icin catch de gecerli degil
			}catch (ArithmeticException ae) {
			//	ans = 0;                     //line n1
			}catch (Exception e) {
				System.out.println("Invalid calculation");
			}
			// System.out.println("Answer = " + ans);  //line n2   // try icinde tanimlanan variable burada okunamaz
	         

		}

	}
/*

B.	Invalid calculation
C.	Compilation fails only at line n1.
D.	Compilation fails only at line n2.
E.	Compilation fails at line n1 and line n2.





Answer E. Compilation fails at line n1 and line2.
*/