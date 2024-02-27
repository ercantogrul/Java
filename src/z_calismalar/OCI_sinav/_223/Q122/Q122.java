package z_calismalar.OCI_sinav._223.Q122;

public class Q122 {
	public static void main(String[] args) {

		Short s1 = 200; 
		Integer s2 = 400;
	//	String s3 = (String) (s1+s2);//line n1
		Long s4 = (long) (s1+s2);      //line n2


		System.out.println("Sum is " + s4);

		//long s5 = s1+s2;       //s1 ve s2 yi java int olarak okur ve toplayip daha büyük olan primitiv olan long a atayabiliriz cast yapmaya gerek yok
		//Long s4 = (long)s1+s2;  //s1 ve s2 yi java int olarak okur....toplayip non_primitiv olan Long a atayabilmek icin cast YAPMAK ZORUNDAYIZ yoksa CTE verir
		//String s3 = ""+(s1+s2);// böyle yapilsa Stringe cevrilmis olurdu

		String a= "5,7";  // String olan sayisal veriler int veya sayi veri türüne cast edilebilir
		int b= Integer.parseInt(a);
		long c= Long.parseLong(a);

		}

	}
//	What is the result?
//		A.	Sum is 600
//		B.	Compilation fails at line n1.
//		C. Compilation fails at line n2.
//		D. A ClassCastException is thrown at line n1.
//		E. A ClassCastException is thrown at line n2.
