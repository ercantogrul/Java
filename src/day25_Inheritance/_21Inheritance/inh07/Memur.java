package day25_Inheritance._21Inheritance.inh07;

public class Memur extends Muhasebe{
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Memur m1 =new Memur();

		
		m1.isim="Sevda";
		m1.soyIsim="Gencer";
		m1.adres="Karadut alti";
		m1.saatUcreti=20;
		m1.statu="chef";
		m1.tel="12345";
		m1.id=m1.idAta();
		m1.maas=m1.maasHesapla();
		System.out.println(m1.isim + "\n" + m1.soyIsim+  "\n" +m1.tel+ "\n" + m1.adres 
				+ "\n" + m1.saatUcreti + "\n" +m1.id + "\n" + m1.maas);

		System.out.println("***********************");

		Memur i1 =new Memur();

		i1.isim="Ali";
		i1.soyIsim="Ekber";
		i1.adres="Istanbul";
		i1.saatUcreti=25;
		i1.statu="ustabasi";
		i1.tel="632541";
		i1.id=i1.idAta();
		i1.maas=i1.maasHesapla();
		System.out.println(i1.isim + "\n" + i1.soyIsim+  "\n" +i1.tel+ "\n" + i1.adres
				+ "\n" + i1.saatUcreti + "\n" +i1.id + "\n" + i1.maas);



	}

}
