package day08_Loops.DE08_Loops.L01_ForLoops.Tasks;

public class Task15 {
	public static void main(String[] args) {
		/*
		Task-> verilen bir String'deki rakam sayısını print eden code create ediniz
		repalace() metotun kullanmadan yapın
		Örnek
		String str = "jadsjl52kjşlk524524j5j24";
		output : 11
		 */
		String str = "jadsjl52kjşlk524524j5j24";
		int sayac=0;
		for (int i = 0; i <str.length() ; i++) {
			if (Character.isDigit(str.charAt(i))) sayac++;
		}

		System.out.println("rakam sayısı = "+ sayac);


	}
}
