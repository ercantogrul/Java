package z_calismalar.OCI_sinav._223.Q011_146_201;

public class Q011 {
	public static void main(String[] args) {
		String[] strs = {"A", "B"};
		int idx = 0;
		for (String s : strs) {
			strs[idx].concat(" element " + idx);  // ama strs[idx]=strs[idx].concat(" element " + idx); olsaydi
			idx++;                                    //0. elemana A element 0 eklenir sonrada idx bir artar
		}                                             //1. elemana B element 1 eklenir di.
		                                              // String[] strs = {"A element 0", "B element 1"}; olurdu
		for (idx = 0; idx < strs.length; idx++) {
			System.out.println(strs[idx]);
		}
	}
}
//What is the result?
//A.	A
//		B
//B.	A element 0
//		B element 1
//C.	A NullPointerException is thrown at runtime.
//D.	A 0
//		B 1





// Answer A