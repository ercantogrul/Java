package z_calismalar.OCI_sinav._223.Q146_NullpointerException;

import java.util.Arrays;

public class Q146 {
	public static void main(String[] args) {
		String[] strs = new String[2];
		//strs[0]="ali";
		//strs[1]="abli"; // bu sekilde atama yapildiktan sonra concat yapilabilinirdi. oradada strs[idx] = nin icine tekrar atilmasi gerekirki ciktiyi alabilelim
		System.out.println(Arrays.toString(strs));
		int idx = 0;
		for (String s : strs) {
			strs[idx].concat("element " + idx);  // null ile bir veri birlestirilemez--- A null pointer exception is thrown at runtime.verir
			idx++;                                   // concat string bir ifadenin methodu, o methodu sadece string bir ifade ile kullanabiliriz.
			                                         // null ile string bir methodu cagiramayiz
		}

		for (idx = 0; idx < strs.length; idx++) {
			System.out.println(strs[idx]);
		}


	}
}
/*	 What is the result?
		A. Element 0Element 1
		B. Null element 0Nullelement 1
		C. NullNull
		D. A null pointer exception is thrown at runtime.

		cevap:D
 */
