package day25_Inheritance._21Inheritance.inh07;

public class Personel {

	public static int sayac=1000;
    public	int id;
    public	String isim;
    public	String soyIsim;
    public	String adres;
    public	String tel;
	
    public int  idAta() {
	this.id=++sayac;
	return id;
}
}
