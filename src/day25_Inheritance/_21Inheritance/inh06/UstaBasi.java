package day25_Inheritance._21Inheritance.inh06;

public class UstaBasi extends Isci {

	public String bolum= "takimhane";
	public int sorOldIscisay = 20;
	

	public static void main(String[] args) {
		
		UstaBasi ub1 = new UstaBasi();
		
		System.out.println(ub1.bolum); // takimhane
		System.out.println(ub1.sorOldIscisay); // 20
		System.out.println(ub1.saatUcreti); // 10
		System.out.println(ub1.isim); // Mehmet
		
		Isci ub2= new UstaBasi();
		// bunu yazmamizi saglayan extends dir..
		// bunu yazinca pproblem olmuyor ama avantaj ve dezavantajlari mevcut...
		// aynisi list te de mevcuttu.. olabildigini gormustuk..
		// List <String> list = new ArrayList<>();
		
		
		System.out.println(ub2.departman); // Imalathane -- isci class indan aldi
		System.out.println(ub2.izindeMi); // false -- persnel class indan aldi
		
		
		Personel ub3 = new UstaBasi();
		// Bu class ile her yere ulasabilirim..
		
		System.out.println(ub3.id); // 1001
		System.out.println(ub3.isim); // Mehmet
		

	}

}
