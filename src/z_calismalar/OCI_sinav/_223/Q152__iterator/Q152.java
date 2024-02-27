package z_calismalar.OCI_sinav._223.Q152__iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Q152 {


	public static void main(String[] args) {
		List <String> lst=Arrays.asList("A","B","C","D");
		Iterator<String> itr=lst.iterator();
		while(itr.hasNext()){ // pointin saginda ilk A yi sonra sirayla diger elemanlari alir
			String e=itr.next(); // A aldi ve e ye atadi if e girmez else ye girer--(continue yoksa) yazdirir sonra B yazdirir C ye gelince if e girer ve loop dan cikar
			if (e=="C") {
				break;
			}
			else {
			//	continue; // contiue ve brek ten sonra birsey gelmez CTE verir.

				System.out.println(e);
			}
		}
		//iteroter: özellikleri normal loop lardan farki index leri olmadigi icin cokdaha hizli, point ile ilerler

	}
}
/*	Which action enables it to print AB? (Hangi eylem AB'yi yazdırmayı sağlar?)
		A. Comment lines 18 to 21.
		B. Comment line 20.
		C. Comment line 19.          //(19. satiri yoruma al)
		D. Comment line 16.






		Answer: c
*/