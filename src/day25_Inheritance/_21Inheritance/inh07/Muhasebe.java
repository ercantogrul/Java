package day25_Inheritance._21Inheritance.inh07;

public class Muhasebe extends Personel{
	
	public String statu;
	
	public int  saatUcreti;
	
	public int maas;
	
	public int maasHesapla() {
		maas=saatUcreti*8*30;
		
		return maas;
		
	}

}
